package com.course.innopolis.students.Control;

import com.course.innopolis.students.Model.Journal;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cristina on 23.06.2017.
 */

public class JournalsManager {
    private Map<Integer, Journal> journals;
    private static Integer journalsCount = 0;


    public JournalsManager() {
        this.journals = new HashMap<>();
    }


    public Map<Integer, Journal> fillJournalList() {
        this.journals.put(0, new Journal(0L, 0L, 0L, true));
        this.journals.put(1, new Journal(1L, 0L, 0L, true));
        this.journals.put(2, new Journal(2L, 1L, 0L, true));
        this.journals.put(3, new Journal(3L, 1L, 0L, true));
        this.journals.put(4, new Journal(4L, 2L, 0L, true));
        this.journals.put(5, new Journal(5L, 2L, 0L, true));
        journalsCount += 6;
        return journals;
    }


    public Map<Integer, Journal> getAll() {
        return journals;
    }


//    public boolean add(String fullUserName, String login, String password) {
//        if (users.get(fullUserName) != null) {
//            throw new IllegalArgumentException("У студента " + fullUserName + " уже есть учётная запись");
//        } else if (users.get(login) != null) {
//            throw new IllegalArgumentException("Login " + login + " уже используется, введите другой");
//        }
//        this.users.put(usersCount, new Journal(fullUserName, login, password));
//        usersCount++;
//        return true;
//    }
}
