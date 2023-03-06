package com.company;

public class Group {

    private String courseName;
    private String description;
    private String startDate;
    private Student[] studentAndMentors;

    public Group(String courseName, String description, String startDate, Student[] studentAndMentors) {
        this.courseName = courseName;
        this.description = description;
        this.startDate = startDate;
        this.studentAndMentors = studentAndMentors;
    }
}
