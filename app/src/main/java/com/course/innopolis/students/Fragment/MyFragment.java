package com.course.innopolis.students.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

/**
 * Created by Cristina on 27.06.2017.
 */

public class MyFragment extends Fragment{
    EditText etGroupFilter;
    ListView lvGroups;
    private LayoutInflater inflater;
    private ViewGroup container;
    private Bundle savedInstanceState;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        this.inflater = inflater;
        this.container = container;
        this.savedInstanceState = savedInstanceState;
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.my_fragment, container, false);
    }

}
