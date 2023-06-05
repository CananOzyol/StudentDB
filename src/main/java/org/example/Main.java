package org.example;

import org.example.Student.Student;
import org.example.Student.StudentDB;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    Student student1 = new Student("Canan", "101");
    Student student2 = new Student("Yunus", "102");
    Student student3 = new Student("Claudia", "103");

    Student[] students = new Student[]{student1, student2, student3};  // Array übergeben!!!!!
    StudentDB studentDatabase = new StudentDB(students);


    System.out.println(studentDatabase.getAllStudents());
    System.out.println(studentDatabase.toString());
    System.out.println(studentDatabase.randomStudent());
    }
}
