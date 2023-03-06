package com.company;

public class TalentLMS implements CheckAble{

    private String name;
    private Student[] users;
    private Group[] groups;

    public TalentLMS(String name, Student[] users, Group[] groups) {
        this.name = name;
        this.users = users;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getUsers() {
        return users;
    }

    public void setUsers(Student[] users) {
        this.users = users;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public void login(TalentLMS talentLMS) {

    }

    @Override
    public void getGroupsStudents(String courseName) {

    }

    @Override
    public void updateCourseName(String oldName, String newName) {

    }

    @Override
    public void getCountOfStudentsFromGroup(String courseName) {

    }

    @Override
    public void getAllCountOfStudentsAndInfo() {

    }

    @Override
    public void getAllGirlStudents() {

    }

    @Override
    public void getAllBoyStudentsAndThemAverageAge() {

    }

    @Override
    public void addNewStudentToGroup(Student student) {

    }

    @Override
    public void deleteStudentFromGroupByStudentName(String name) {

    }

    @Override
    public void deleteStudentFromTalentLMS(String name) {

    }

    @Override
    public void updateStudentInfo(String info) {

    }
}
