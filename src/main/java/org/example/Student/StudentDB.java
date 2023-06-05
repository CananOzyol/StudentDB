package org.example.Student;
import java.util.Arrays;
import java.util.Random;

public class StudentDB {
    private Student[] students; // warum nochmal privat
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
    private final Random random = new Random(); // warum musste das nochmal private final sein
    public Student randomStudent(){
        return students[random.nextInt(students.length)];
    }

}
