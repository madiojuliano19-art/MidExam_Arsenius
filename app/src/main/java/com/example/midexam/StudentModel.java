package com.example.midexam;

public class StudentModel {
    String name, studentId;
    int age;

    public StudentModel(String studentId, String name, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }


    public String getName() {
        return this.name;
    }
    public String getStudentId() {
        return this.studentId;
    }

    public int getAge() {
        return this.age;
    }
}
