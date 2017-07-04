package com.course.innopolis.students.Control;

import com.course.innopolis.students.Model.Subject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cristina on 23.06.2017.
 */

public class SubjectsManager {
    private Map<Integer, Subject> subjects;
    private static Integer subjectsCount = 0;


    private SubjectsManager() {
        this.subjects = new HashMap<>();
    }


    private static class SubjectsManagerHolder {
        private final static SubjectsManager instance = new SubjectsManager();
    }


    public static SubjectsManager getInstance(){
        return SubjectsManagerHolder.instance;
    }


    public Map<Integer, Subject> fillSubjectList() {
        this.subjects.put(0, new Subject(0L, "Java Core"));
        this.subjects.put(1, new Subject(1L, "Введение в Android"));
        this.subjects.put(2, new Subject(2L, "Основы БД"));
        this.subjects.put(3, new Subject(3L, "Проектирование ИС"));
        this.subjects.put(4, new Subject(4L, "Сетвые технологии"));
        this.subjects.put(5, new Subject(5L, "Язык программирования С++"));
        this.subjects.put(2, new Subject(6L, "Объектно-ориентированное программирование"));
        this.subjects.put(3, new Subject(7L, "Алгоритмы и структуры данных"));
        this.subjects.put(4, new Subject(8L, "Сетвые технологии"));
        this.subjects.put(5, new Subject(9L, "Введение в системный анализ"));
        this.subjects.put(3, new Subject(7L, "Ручное тестирование"));
        this.subjects.put(4, new Subject(8L, "Тестирование веб-сервисов"));
        this.subjects.put(5, new Subject(9L, "Тестирование мобильных приложений"));
        this.subjects.put(4, new Subject(8L, "Тестирование баз данных"));
        this.subjects.put(5, new Subject(9L, "Тестирование безопасности"));
        subjectsCount += 10;
        return subjects;
    }


    public Map<Integer, Subject> getAll() {
        return subjects;
    }


/*    public boolean add(String fullUserName, String login, String password) {
        if (users.get(fullUserName) != null) {
            throw new IllegalArgumentException("У студента " + fullUserName + " уже есть учётная запись");
        } else if (users.get(login) != null) {
            throw new IllegalArgumentException("Login " + login + " уже используется, введите другой");
        }
        this.users.put(usersCount, new User(fullUserName, login, password));
        usersCount++;
        return true;
    }*/
}
