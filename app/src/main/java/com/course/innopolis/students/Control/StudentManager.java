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
    private Map<Integer, Student> students;

    public StudentManager() {
        this.students = new HashMap<>();
    }

    public Map<Integer, Student> fillStudentList() {
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

        this.students.put(0, new Student("Алексеев", "Александр", "Алексеевич", dateOfBirth, 0L, contacts));
        this.students.put(1, new Student("Иванова", "Ольга", "Александровна", dateOfBirth, 0L, contacts));
        this.students.put(2, new Student("Петов", "Петр", "Александрович", dateOfBirth, 1L, contacts));
        this.students.put(3, new Student("Петрова", "Светлана", "Игоревна", dateOfBirth, 2L, contacts));
        this.students.put(4, new Student("Иванов", "Иван", "Петрович", dateOfBirth, 2L, contacts));
        this.students.put(5, new Student("Петров", "Андрей", "Николаевич", dateOfBirth, 3L, contacts));
        this.students.put(6, new Student("Ветров", "Олег", "Павлович", dateOfBirth, 3L, contacts));
        this.students.put(7, new Student("Лисаков", "Константин", "Александрович", dateOfBirth, 4L, contacts));

        //studentsList.add(new Student("Алексеев", "Александр", "Алексеевич", dateOfBirth, group1.getGroupId(), contacts));

        return students;
    }

    public Map<Integer, Student> getAll() {
        return students;
    }

}
