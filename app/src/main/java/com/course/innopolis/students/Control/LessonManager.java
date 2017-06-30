package com.course.innopolis.students.Control;

import com.course.innopolis.students.Model.Lesson;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cristina on 01.07.2017.
 */

public class LessonManager {
    private Map<Integer, Lesson> lessons;

    public LessonManager() {
        this.lessons = new HashMap<>();
    }

    public Map<Integer, Lesson> fillLessonList() {

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date dateBeg = null;
        try {
            dateBeg = format.parse("01.07.2017");
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.lessons.put(0, new Lesson(0L, "lessonName1", dateBeg, dateBeg, "501", "description", 0L, "lecturer"));
        this.lessons.put(1, new Lesson(1L, "lessonName2", dateBeg, dateBeg, "501", "description", 1L, "lecturer"));
        this.lessons.put(2, new Lesson(2L, "lessonName3", dateBeg, dateBeg, "501", "description", 2L, "lecturer"));

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
