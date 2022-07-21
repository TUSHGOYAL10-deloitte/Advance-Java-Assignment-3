package com.company.lambdas.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String email;


    private LocalDate DOB;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", DOB=" + DOB +
                ", branch='" + branch + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    private String branch;
    int[] marks = new int[5];

    public Student(LocalDate DOB) {
        this.DOB = DOB;
    }

    public Student(){

    }

    public Student(int id, String name,String email, LocalDate DOB, String branch, int[] marks) {
        this.id = id;
        this.name = name;

        this.email = email;
        this.DOB = DOB;
        this.branch = branch;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int[] getMarks() {
        return marks;
    }
}

