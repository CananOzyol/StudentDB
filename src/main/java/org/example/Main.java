package org.example;

import org.example.Student.Student;
import org.example.Student.StudentDB;
import org.example.Student.StudentNotFoundException;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentDB database = new StudentDB();
        database.addStudent(new Student("1", "Max Mustermann"));
        database.addStudent(new Student("2", "Erika Musterfrau"));

        String searchId = "3";

        try {
            Student foundStudent = database.findByld(searchId);
            System.out.println("Student found: ID = " + foundStudent.getId() + ", Name = " + foundStudent.getName());
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
