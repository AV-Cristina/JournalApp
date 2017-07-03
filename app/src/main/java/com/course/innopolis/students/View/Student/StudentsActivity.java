package com.course.innopolis.students.View.Student;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.course.innopolis.students.Control.StudentsManager;
import com.course.innopolis.students.R;

public class StudentsActivity extends Activity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

        StudentsManager sm = new StudentsManager();
        sm.fillStudentList();

    }
}
