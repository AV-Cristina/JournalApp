package com.course.innopolis.students.View.LoginRegistration;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.course.innopolis.students.Control.UsersManager;
import com.course.innopolis.students.R;
import com.course.innopolis.students.View.Student.StudentDetailsActivity;

public class RegistrationActivity extends Activity {
    private EditText etFullUserName;
    private EditText etLogin;
    private EditText etPassword;
    private EditText etConfirmPassword;
    private Button bRegistration;
    private Context context;
    UsersManager usersManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        context = this;

        usersManager = new UsersManager();
        usersManager.fillUserList();

        etFullUserName = (EditText)findViewById(R.id.etFullUserName);
        etLogin = (EditText)findViewById(R.id.login);
        etPassword = (EditText)findViewById(R.id.password);
        etConfirmPassword = (EditText)findViewById(R.id.confirmPassword);

        bRegistration = (Button)findViewById(R.id.registrationButton);

        bRegistration.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String fullUserName = etFullUserName.getText().toString();
                String login = etLogin.getText().toString();
                String password = etPassword.getText().toString();
                String confirmPassword = etConfirmPassword.getText().toString();

                if (fullUserName.isEmpty() || login.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
                    Toast.makeText(context, "Заполните, пожалуйста, все поля", Toast.LENGTH_LONG).show();
                }
                else if (!confirmPassword.equals(password)) {
                    Toast.makeText(context, "Неправильное подтверждение пароля", Toast.LENGTH_LONG).show();
                }
                else {
                    try {
                        usersManager.add(fullUserName, login, password);
                    } catch (IllegalArgumentException e) {
                        Toast.makeText(context, "IllegalArgument", Toast.LENGTH_LONG).show();
                    }
                    Intent intent = new Intent(context, MainActivity.class);
                    context.startActivity(intent);
                }
            }
        });

    }
}
