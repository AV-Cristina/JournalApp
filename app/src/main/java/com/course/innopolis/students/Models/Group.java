package com.course.innopolis.students.Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cristina on 22.06.2017.
 */

public class Group {
    private Long groupId;
    private String name;
    private List<Student> studentsList;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group (Long groupId, String name){
        this.groupId = groupId;
        this.name = name;
        this.studentsList = new ArrayList<>();
    }
}