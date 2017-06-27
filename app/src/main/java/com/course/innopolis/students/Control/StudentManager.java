package com.course.innopolis.students.Control;

import com.course.innopolis.students.Model.Contact;
import com.course.innopolis.students.Model.ContactType;
import com.course.innopolis.students.Model.Group;
import com.course.innopolis.students.Model.Student;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cristina on 23.06.2017.
 */

public class StudentManager {
    private Map<Long, Student> students;

    private StudentManager() {
        this.students = new HashMap<>();
    }

    public Map<Long, Student> fillStudentList() {


        ///////////////////////////////////////////////////////////////////////////////////////////
/* //this.students.put(i, )


        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("@alex", ContactType.PHONE));
        contacts.add(new Contact("Alex@gmail.com", ContactType.EMAIL));
        contacts.add(new Contact("vk.com/alex", ContactType.VK));
        contacts.add(new Contact("@alex", ContactType.TELEGRAM));
        contacts.add(new Contact("alex", ContactType.SKYPE));


        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date dateOfBirth = null;
        try {
            dateOfBirth = format.parse("01.02.1987");
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Алексеев", "Александр", "Алексеевич", dateOfBirth, group1.getGroupId(), contacts));
        studentsList.add(new Student("Иванова", "Ольга", "Александровна", dateOfBirth, group1.getGroupId(), contacts));
        studentsList.add(new Student("Петов", "Петр", "Александрович", dateOfBirth, group1.getGroupId(), contacts));
        studentsList.add(new Student("Петрова", "Светлана", "Игоревна", dateOfBirth, group2.getGroupId(), contacts));
        studentsList.add(new Student("Иванов", "Иван", "Петрович", dateOfBirth, group2.getGroupId(), contacts));
        studentsList.add(new Student("Петров", "Андрей", "Николаевич", dateOfBirth, group2.getGroupId(), contacts));
        studentsList.add(new Student("Ветров", "Олег", "Павлович", dateOfBirth, group3.getGroupId(), contacts));
        studentsList.add(new Student("Лисаков", "Константин", "Александрович", dateOfBirth, group3.getGroupId(), contacts));*/
        ///////////////////////////////////////////////////////////////////////////////////////////

        return students;
    }

    public Map<Long, Student> getAll() {
        return students;
    }

}
