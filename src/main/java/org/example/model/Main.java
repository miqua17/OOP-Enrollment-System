package org.example.service;

import org.example.Course;
import org.example.Person;
import org.example.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        Student student = new Student();
        student.setStudentID(10209302);
        student.setStudentName("John Doe");
        student.setStudentProgram("BSIT");

        student.display();



        Course course = new Course();
        course.setCourseID(232028302);
        course.setCourseName("Integrative Programming");
        course.setCourseProgram("Information Technology");

        course.display();

        //create
        Person p1 = new Person();
        p1.setPersonName("Nigel Linatoc");
        p1.setPersonAge(55);
        persons.add(p1);

        //read
        System.out.println(persons.get(0).getPersonName());
        System.out.println(persons.get(0).getPersonAge());


        //update
        persons.get(0).setPersonAge(45);
        System.out.println(persons.get(0).getPersonAge());

        //Delete
        persons.remove(0);



    }
}