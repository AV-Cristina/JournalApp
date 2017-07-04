package com.course.innopolis.students.Control;

import com.course.innopolis.students.Model.Lesson;
import com.course.innopolis.students.Model.Student;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cristina on 01.07.2017.
 */

public class LessonsManager {
    private Map<Integer, Lesson> lessons;
    private static Integer lessonsCount = 0;


    private LessonsManager() {
        this.lessons = new HashMap<>();
    }


    private static class LessonsManagerHolder {
        private final static LessonsManager instance = new LessonsManager();
    }


    public static LessonsManager getInstance(){
        return LessonsManagerHolder.instance;
    }


    public Map<Integer, Lesson> fillLessonList() {

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date dateBeg = null;
        try {
            dateBeg = format.parse("01.07.2017");
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.lessons.put(0, new Lesson(0L, "Generics", dateBeg, dateBeg, "501", "description", 0L, "Иванов Петр Васильевич"));
        this.lessons.put(1, new Lesson(1L, "Collection framework", dateBeg, dateBeg, "501", "description", 1L, "Иванов Петр Васильевич"));
        this.lessons.put(2, new Lesson(2L, "Модель памяти Java", dateBeg, dateBeg, "501", "description", 2L, "Иванов Петр Васильевич"));
        this.lessons.put(3, new Lesson(3L, "Потоки выполнения. Синхронизация", dateBeg, dateBeg, "501", "description", 0L, "Иванов Петр Васильевич"));
        this.lessons.put(4, new Lesson(4L, "View, ViewGroup", dateBeg, dateBeg, "501", "description", 1L, "Иванов Петр Васильевич"));
        this.lessons.put(5, new Lesson(5L, "Adapter, AdapterView", dateBeg, dateBeg, "501", "description", 2L, "Иванов Петр Васильевич"));
        this.lessons.put(6, new Lesson(6L, "App resources, Config qualifier", dateBeg, dateBeg, "501", "description", 0L, "Васильев Иван Петрович"));
        this.lessons.put(7, new Lesson(7L, "Алгоритмы поиска", dateBeg, dateBeg, "501", "description", 1L, "Васильев Иван Петрович"));
        this.lessons.put(8, new Lesson(8L, "Алгоритмы сортировки", dateBeg, dateBeg, "501", "description", 2L, "Васильев Иван Петрович"));
        this.lessons.put(9, new Lesson(9L, "Основные конструкции языка SQL", dateBeg, dateBeg, "501", "description", 1L, "Васильев Иван Петрович"));
        this.lessons.put(10, new Lesson(10L, "Обзор библиотеки STL", dateBeg, dateBeg, "501", "description", 2L, "Васильев Иван Петрович"));
        lessonsCount += 11;
        return this.lessons;
    }


    public Lesson getLesson(Integer id){
        Lesson lessons = this.lessons.get(id);
        return lessons;
    }


    public Lesson getLesson(String lessonsName){
        Lesson lessons = this.lessons.get(lessonsName);
        return lessons;
    }


    public Integer size(){
        Integer size = this.lessons.size();
        return size;
    }
}
