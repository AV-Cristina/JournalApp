package com.course.innopolis.students.View.Students;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.course.innopolis.students.Control.GroupManager;
import com.course.innopolis.students.Control.StudentManager;
import com.course.innopolis.students.Model.Group;
import com.course.innopolis.students.Model.Student;
import com.course.innopolis.students.R;

import java.util.Map;

public class StudentsActivity extends Activity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

        StudentManager sm = new StudentManager();
        sm.fillStudentList();

    }
}