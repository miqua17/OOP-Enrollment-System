package org.example;

public class Student {

    private int studentID;
    private String studentName;
    private String program;


    public Student() {


    }

    public Student(int studentID, String studentName, String program) {

        this.studentID = studentID;
        this.studentName = studentName;
        this.program = program;
    }

    public int getStudentID() {

        return studentID;
    }

    public void setStudentID(int studentID) {

        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;

    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;

    }

    public String getStudentProgram() {
        return program;
    }

    public void setStudentProgram(String program) {
        this.program = program;

    }

    public void display() {
        System.out.println("org.example.Student ID:" + getStudentID());
        System.out.println("org.example.Student Name:" + getStudentName());
        System.out.println("org.example.Student Program:" + getStudentProgram());

    }
}

