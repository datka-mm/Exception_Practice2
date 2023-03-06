package com.company;

import com.company.enums.Gender;

public class Student {

    private String fullName;
    private int age;
    private Gender gender;
    private String email;
    private String password;
    private Course[] courses;

    public Student(String fullName, int age, Gender gender, String email, String password, Course[] courses) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.courses = courses;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
