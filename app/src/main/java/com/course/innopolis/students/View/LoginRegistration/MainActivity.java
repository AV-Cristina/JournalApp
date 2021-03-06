package com.course.innopolis.students.View.LoginRegistration;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.course.innopolis.students.R;
import com.course.innopolis.students.View.Admin.AdminActivity;
import com.course.innopolis.students.View.Student.StudentDetailsActivity;


public class MainActivity extends Activity {
    private static String admin = "admin";
    private EditText etLogin;
    private EditText etPassword;
    private Button bLogin;
    private Button bRegistrationQuery;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        etLogin = (EditText) findViewById(R.id.login);
        etPassword = (EditText) findViewById(R.id.password);

        bLogin = (Button) findViewById(R.id.loginButton);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (admin.equals(etLogin.getText().toString()) && admin.equals(etPassword.getText().toString()))
                {
                    // // TODO: Передавать флаг
                    Log.i("LOG", "admin");
                    Intent intent = new Intent(context, AdminActivity.class);
                    context.startActivity(intent);
                }
                else{
                    Intent intent = new Intent(context, StudentDetailsActivity.class);
                    context.startActivity(intent);
                }
            }
        });

        bRegistrationQuery = (Button) findViewById(R.id.registrationQueryButton);
        bRegistrationQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,RegistrationActivity.class);
                context.startActivity(intent);
            }
        });


    }
}
