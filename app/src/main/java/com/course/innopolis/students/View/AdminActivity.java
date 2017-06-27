package com.course.innopolis.students.View;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.course.innopolis.students.R;

public class AdminActivity extends Activity {
    private Context context;
    Button bGroups;
    Button bStudents;
    Button bJournals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        context = this;
        Log.i("LOG", "adminActivity");

        bGroups = (Button)findViewById(R.id.groups);
        bGroups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, GroupsActivity.class);
                context.startActivity(intent);
            }
        });

        bStudents = (Button)findViewById(R.id.students);
        bStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, StudentsActivity.class);
                context.startActivity(intent);
            }
        });

        bJournals = (Button)findViewById(R.id.journals);
        bJournals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(context, JournalsActivity.class);
                context.startActivity(intent);
            }
        });

    }
}
