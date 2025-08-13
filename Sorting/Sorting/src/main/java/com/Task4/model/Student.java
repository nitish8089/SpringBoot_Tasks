package com.Task4.model;

public class Student {
    private int id;
    private String name;
    private int rollNo;
    private int marks;

    public Student(int id, String name, int rollNo, int marks) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public int getMarks() {
        return marks;
    }
}
