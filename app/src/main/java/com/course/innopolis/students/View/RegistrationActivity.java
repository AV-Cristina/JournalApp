package com.course.innopolis.students.View;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.course.innopolis.students.R;

public class RegistrationActivity extends Activity {

    private EditText etLogin;
    private EditText etPassword;
    private EditText etConfirmPassword;
    private Button bRegistration;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        context = this;

        etLogin = (EditText)findViewById(R.id.login);
        etPassword = (EditText)findViewById(R.id.password);
        etConfirmPassword = (EditText)findViewById(R.id.confirmPassword);

        bRegistration = (Button)findViewById(R.id.registrationButton);

        bRegistration.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity.class);
                context.startActivity(intent);
            }
        });



    }
}
