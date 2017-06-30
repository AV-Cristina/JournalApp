package com.course.innopolis.students.View.Lessons;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.course.innopolis.students.R;

public class LessonsActivity extends AppCompatActivity {
    private Button bAddLesson;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);
        context = this;

        bAddLesson = (Button) findViewById(R.id.bAddLesson);
        bAddLesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, AddLessonActivity.class);
                context.startActivity(intent);
            }
        });

    }


}
