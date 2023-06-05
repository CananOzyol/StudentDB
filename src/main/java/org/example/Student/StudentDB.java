package org.example.Student;
import java.util.Arrays;
import java.util.Random;

public class StudentDB {
    private Student[] students;
    public StudentDB(Student[] students){
        this.students = students;
    }
    public Student[] getAllStudents(){
        return students;
    }

    @Override
    public String toString() {
        return "students: " + Arrays.toString(students);
    }

    private final Random random = new Random();
    public Student randomStudent(){
        return students[random.nextInt(students.length)];
    }
}
