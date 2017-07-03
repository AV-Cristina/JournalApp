package com.course.innopolis.students.View.Group;

import android.app.Activity;
import android.os.Bundle;

import com.course.innopolis.students.Control.GroupsManager;
import com.course.innopolis.students.Fragment.GroupsFragment;
import com.course.innopolis.students.Model.Group;
import com.course.innopolis.students.R;

import java.util.ArrayList;
import java.util.Map;

public class GroupsActivity extends Activity {
    private ArrayList<String> groupNames;

    private GroupsFragment mGroupFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);

        GroupsManager gm = new GroupsManager();
        Map<Integer, Group> groups = gm.fillGroupList();

        groupNames = new ArrayList<>();
        for(int i = 0; i < gm.size(); i++){
            groupNames.add(gm.getGroup(i).getName());
        }

        mGroupFragment = (GroupsFragment)getFragmentManager().findFragmentById(R.id.fragment);
        mGroupFragment.setGroupNames(groupNames);
        /*
        // get an instance of FragmentTransaction from your Activity
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        GroupsFragment groupsFragment = new GroupsFragment();
        fragmentTransaction.add(R.id.fragmentLayout, groupsFragment);
        fragmentTransaction.commit();*/
    }

    /*
    Context context;
    EditText etGroupFilter;
    ListView lvGroups;
    ArrayList<String> groupNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);

        GroupsManager gm = new GroupsManager();
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
    }*/

}
