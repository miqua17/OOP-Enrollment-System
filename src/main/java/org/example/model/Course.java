package org.example;

public class Course {

    int courseID;
    String courseName;
    String program;

    public Course() {

    }

    public Course(int courseID, String courseName, String program) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.program = program;

    }

    public int getCourseID() {
        return courseID;

    }

    public void setCourseID(int courseID) {

        this.courseID = courseID;
    }

    public String getCourseName() {

        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;

    }

    public String getCourseProgram() {
        return program;

    }


    public void setCourseProgram(String program) {
        this.program = program;

    }

    public void display() {
        System.out.println("\norg.example.Course ID:" + getCourseID());
        System.out.println("org.example.Course Name:" + getCourseName());
        System.out.println("org.example.Course Program:" + getCourseProgram());


    }
}