package com.course.innopolis.students.Model;

/**
 * Created by Cristina on 21.06.2017.
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


    public class Student implements Serializable {
        private String surname;
        private String firstName;
        private String secondName;
        private Date dateOfBirth;
        private final Long id;
        private Long groupId;
        private List<Contact> contacts;

        public Student(String firstName, String surname, String secondName, Date dateOfBirth, Long groupId, List<Contact> contacts) {
            this.firstName = firstName;
            this.surname = surname;
            this.secondName = secondName;
            this.dateOfBirth = dateOfBirth;
            this.id = (long)(Math.random()) + System.currentTimeMillis();
            this.groupId = groupId;
            this.contacts = new ArrayList<>();
        }

        public Long getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public Date getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public Long getGroupId() {
            return groupId;
        }

        public void setGroupId(Long groupId) {
            this.groupId = groupId;
        }

        public List<Contact> getContacts() {
            return contacts;
        }

//        public List<Student> getStudentList() {
//
//            return list;
//        }


        @Override
        public int hashCode() {
            return (int) (21 + id * 42);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) return false;
            if (!(obj instanceof Student)) return false;
            if (this.id == ((Student)obj).id) return true;
            return super.equals(obj);
        }
    }
