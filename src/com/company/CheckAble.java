package com.company;

public interface CheckAble {

    void login(TalentLMS talentLMS);

    void getGroupsStudents(String courseName);

    void updateCourseName(String oldName, String newName);

    void getCountOfStudentsFromGroup(String courseName);

    void getAllCountOfStudentsAndInfo();

    void getAllGirlStudents();

    void getAllBoyStudentsAndThemAverageAge();

    //when you add student to course this student must be added to student array in TalentLMS
    //if in the group 20 students you can't add new one
    //when you add new student check all students' login is exists throw exception
    void addNewStudentToGroup(Student student);

    void deleteStudentFromGroupByStudentName(String name);

    void deleteStudentFromTalentLMS(String name);

    void updateStudentInfo(String info);
}
