package com.company;

import com.company.enums.Gender;
import com.company.enums.Role;

public class Main {
    public static void main(String[] args) {
        /**
         *
         */

        Course course = new Course("Java", 9);
        Course course1 = new Course("Js", 9);

        Course[] courses = new Course[] {course, course1};

        Student person = new Student("DatkaM", 21, Gender.FEMALE, "datkascnu@gmail.com", "password", courses);
        Student person1 = new Student("D", 17, Gender.FEMALE, "dskdfk@gmail.com", "pass", courses);

        Student[] people = new Student[]{person};
        Student[] people1 = new Student[]{person1};

        Group group = new Group("Java-6", "2022", "2022", people);
        Group group1 = new Group("Js-6", "2022", "2022", people1);

//        TalentLMS talentLMS = new TalentLMS("PeaksoftLMS", new Student[]{person, person1}, courses);
    }
}