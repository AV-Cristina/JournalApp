package com.course.innopolis.students.Control;

import com.course.innopolis.students.Model.Group;
import com.course.innopolis.students.Model.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Cristina on 23.06.2017.
 */

public class GroupsManager {
    private Map<Integer, Group> groups;
    private static Integer groupsCount = 0;


    private GroupsManager() {
        this.groups = new HashMap<>();
    }


    private static class GroupsManagerHolder {
        private final static GroupsManager instance = new GroupsManager();
    }


    public static GroupsManager getInstance(){
        return GroupsManagerHolder.instance;
    }


    public Map<Integer, Group> fillGroupList() {
        this.groups.put(0, new Group(1l, "Android 01"));
        this.groups.put(1, new Group(2l, "Java EE 01"));
        this.groups.put(2, new Group(3l, "Java EE 02"));
        this.groups.put(3, new Group(4l, "Java EE 03"));
        this.groups.put(4, new Group(5l, "Java EE 04"));
        this.groups.put(5, new Group(6l, "C++ 01"));
        this.groups.put(6, new Group(7l, "Testing 01"));
        groupsCount += 7;
        return this.groups;
    }


    public Group getGroup(Integer id){
        Group group = this.groups.get(id);
        return group;
    }


    public Group getGroup(String groupName){
        Group group = this.groups.get(groupName);
        return group;
    }


    public Integer size(){
        Integer size = this.groups.size();
        return size;
    }
}
