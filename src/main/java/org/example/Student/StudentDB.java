package org.example.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StudentDB {
    private List<Student> students;

    // Konstruktor
    public StudentDB() {
        students = new ArrayList<>();
    }

    // Methode zum Hinzufügen eines Studenten
    public void addStudent(Student student) {
        students.add(student);
    }

    // Methode zur Suche nach einem Studenten anhand der ID (als String)
    public Student findByld(String id) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student not found for ID: " + id);
    }
}