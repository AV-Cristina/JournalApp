package com.course.innopolis.students.Model;

/**
 * Created by Cristina on 01.07.2017.
 */

public class User {
    private final Long id;
    private String fullUserName; // тут д. б. id соотв. Student
    private String login;
    private String password;
    // TODO: 01.07.2017 хранить хэш пароля


    public User(String fullUserName, String login, String password){
        this.id = (long)(Math.random()) + System.currentTimeMillis();
        this.fullUserName = fullUserName;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getFullUserName() {
        return fullUserName;
    }

    public void setFullUserName(String fullUserName) {
        this.fullUserName = fullUserName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        password = password;
    }

    @Override
    public int hashCode() {
        return (int) (21 + id * 42);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof User)) return false;
        if (this.id == ((User)obj).id) return true;
        return super.equals(obj);
    }
}
