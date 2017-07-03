package com.course.innopolis.students.Control;

import com.course.innopolis.students.Model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cristina on 01.07.2017.
 */

public class UsersManager {
    private Map<Integer, User> users;
    private static Integer usersCount = 0;


    public UsersManager() {
        this.users = new HashMap<>();
    }


    public Map<Integer, User> fillUserList() {
        this.users.put(0, new User("Алексеев Александр Алексеевич", "alex", "qwerty1"));
        this.users.put(1, new User("Иванова Ольга Александровна", "helga", "qwerty2"));
        this.users.put(2, new User("Петов Петр Александрович", "petr", "qwerty3"));
        usersCount += 3;
        return users;
    }


    public Map<Integer, User> getAll() {
        return users;
    }


    public boolean add(String fullUserName, String login, String password) {
        if (users.get(fullUserName) != null) {
            throw new IllegalArgumentException("У студента " + fullUserName + " уже есть учётная запись");
        } else if (users.get(login) != null) {
            throw new IllegalArgumentException("Login " + login + " уже используется, введите другой");
        }
        this.users.put(usersCount, new User(fullUserName, login, password));
        usersCount++;
        return true;
    }
}
