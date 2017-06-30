package com.course.innopolis.students.Fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.course.innopolis.students.R;

import java.util.ArrayList;

/**
 * Created by Cristina on 27.06.2017.
 */

public class GroupsFragment extends Fragment{
    EditText etGroupFilter = null;
    ListView lvGroups = null;
    ArrayList<String> groupNames;

    TextWatcher textWatcher = new TextWatcher() {

        @Override
        public void afterTextChanged(Editable s) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            Log.i("LOG", "TextWatcher");
            listFilter(s);
        }
    };


    public void outputLines(ArrayList<String> groupNames){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getView().getContext(),
                android.R.layout.simple_list_item_1, groupNames);
        lvGroups.setAdapter(adapter);
    }


    public void listFilter(CharSequence s){
        String searchGroupName = s.toString();
        ArrayList<String> resultGroupNames = new ArrayList<>();
        for (int i = 0; i < groupNames.size(); i++) {
            if (groupNames.get(i).contains(searchGroupName)) {
                resultGroupNames.add(groupNames.get(i));
            }
        }
        outputLines(resultGroupNames);
    }

    public void setGroupNames(ArrayList<String> groupNames) {
        this.groupNames = groupNames;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("GroupsFragment", "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_groups, container, false);
        Log.d("GroupsFragment", "onCreateView");
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lvGroups = (ListView) getView().findViewById(R.id.lvGroups);
        etGroupFilter = (EditText) getView().findViewById(R.id.etGroupFilter);
        etGroupFilter.addTextChangedListener(textWatcher);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }



}
