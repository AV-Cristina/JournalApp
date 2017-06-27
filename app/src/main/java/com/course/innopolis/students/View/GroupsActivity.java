package com.course.innopolis.students.View;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.course.innopolis.students.Control.GroupManager;
import com.course.innopolis.students.Model.Group;
import com.course.innopolis.students.R;

import java.util.ArrayList;
import java.util.Map;

public class GroupsActivity extends Activity {
    Context context;
    EditText etGroupFilter;
    ListView lvGroups;

    ArrayList<String> groupNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);

        GroupManager gm = new GroupManager();
        Map<Integer, Group> groups = gm.fillGroupList();

        groupNames = new ArrayList<>();

        for(int i = 0; i < gm.size(); i++){
            groupNames.add(gm.getGroup(i).getName());
        }

        lvGroups = (ListView) findViewById(R.id.lvGroups);
        outputLines(groupNames);


        etGroupFilter = (EditText) findViewById(R.id.etGroupFilter);
        etGroupFilter.addTextChangedListener(new TextWatcher(){

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i("LOG", "TextWatcher");
                String searchGroupName = s.toString();
                ArrayList<String> resultGroupNames = new ArrayList<>();
                for (int i = 0; i < groupNames.size(); i++) {
                    if (groupNames.get(i).contains(searchGroupName)) {
                        resultGroupNames.add(groupNames.get(i));
                    }
                }
                outputLines(resultGroupNames);
            }
        });
    }


    public void outputLines(ArrayList<String> groupNames){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, groupNames);
        lvGroups.setAdapter(adapter);
    }

}
