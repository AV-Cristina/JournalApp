package com.course.innopolis.students.View;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.course.innopolis.students.Models.Contact;
import com.course.innopolis.students.Models.ContactType;
import com.course.innopolis.students.Models.Group;
import com.course.innopolis.students.Models.Student;
import com.course.innopolis.students.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends Activity {

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
                //attemptLogin();
                Intent intent = new Intent(context, GroupsActivity.class);
                context.startActivity(intent);
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

        //////////////////////////////////////////////////////////////////////////
        Group group1 = new Group(1l, "Android 01");
        Group group2 = new Group(2l, "Java EE 01");
        Group group3 = new Group(3l, "Java EE 02");


        ArrayList<Contact> contacts = new ArrayList<>();
        Contact contact1 = new Contact("@conor", ContactType.PHONE);
        contacts.add(contact1);
        Contact contact2 = new Contact("Conor@gmail.com", ContactType.EMAIL);
        contacts.add(contact2);
        Contact contact3 = new Contact("vk.com/conor", ContactType.VK);
        contacts.add(contact3);
        Contact contact4 = new Contact("@conor", ContactType.TELEGRAM);
        contacts.add(contact4);
        Contact contact5 = new Contact("conor", ContactType.SKYPE);
        contacts.add(contact5);


        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date dateOfBirth = null;

        try {
            dateOfBirth = format.parse("01.02.1987");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Student student1 = new Student("Conor", "John", "Reese", dateOfBirth, group1.getGroupId(), contacts);
        //////////////////////////////////////////////////////////////////////////


    }


    public void fillLists (){
       //////////////////////////////
    }
}
