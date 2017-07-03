package com.course.innopolis.students.View.Lesson;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import com.course.innopolis.students.R;

public class AddLessonActivity extends AppCompatActivity {
    private EditText etDate;
    private Button bSetDate;
    private EditText etTime;
    private Button bSetTime;
    private EditText etTitle;
    private EditText etDescription;
    private Button bSubmit;
    private Context context;


    private void selectDate(){
        DatePickerDialog.OnDateSetListener myListner = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                //Toast.makeText(MainActivity.this, year + " " + month + " " + dayOfMonth, Toast.LENGTH_SHORT).show();
                etDate.setText(dayOfMonth + "." +  month + "." + year);
            }
        };
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, myListner, 2017, 5, 30);
        datePickerDialog.show();
    }


    private void selectTime(){
        TimePickerDialog.OnTimeSetListener myListner = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                //Toast.makeText(MainActivity.this, i + " " + i1, Toast.LENGTH_SHORT).show();
                etTime.setText(i + ":" + i1);
            }
        };
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, myListner, 20, 10, true);
        timePickerDialog.show();
    }


    private void showAlert(){
        AlertDialog.Builder myBuilder = new AlertDialog.Builder(this);
        myBuilder.setMessage("Вы точно желаете добавить запись?");
        myBuilder.setTitle("Добавление записи");
        myBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.dismiss();
            }
        });
        myBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog dialog = myBuilder.create();
        dialog.show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_lesson);
        context = this;

        etDate = (EditText)findViewById(R.id.etDate);
        etTime = (EditText)findViewById(R.id.etTime);
        etTitle = (EditText)findViewById(R.id.etTitle);
        etDescription = (EditText)findViewById(R.id.etDescription);

        bSetDate = (Button)findViewById(R.id.bSetDate);
        bSetDate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //// TODO: 30.06.2017 ввод даты
                selectDate();
            }
        });

        bSetTime = (Button)findViewById(R.id.bSetTime);
        bSetTime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //// TODO: 30.06.2017 ввод time
                selectTime();
            }
        });

        bSubmit = (Button)findViewById(R.id.bSubmit);
        bSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //// TODO: 30.06.2017 Submit
                showAlert();
            }
        });

    }






}
