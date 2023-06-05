import org.example.Student.Student;
import org.example.Student.StudentDB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class StudentDBTest {
    @Test
    void yieldTrue_areAllStudentCalled(){
        // given:
        Student student1 = new Student("Canan", "101");
        Student student2 = new Student("Claudia", "102");
        Student student3 = new Student("Laura", "103");

        Student[] students = new Student[]{student1,student2,student3};
        StudentDB studentDB = new StudentDB(students);
        // when:
        Student[] expected = new Student[]{student1,student2,student3};
        Student[] actual = studentDB.getAllStudents();
        // then:
        assertArrayEquals(expected, actual);
    }

    @Test
    void yieldTrue_outputToString(){
        // given:
        Student student11 = new Student("Canan", "101");
        Student student21 = new Student("Claudia", "102");
        Student student31 = new Student("Laura", "103");
        Student[] students1 = new Student[]{student11,student21,student31};
        StudentDB studentDB = new StudentDB(students1);

        // when:
        Student[] expected = new Student[]{student11,student21,student31};
        String expectedString = Arrays.deepToString(expected);
        String actualString = studentDB.toString();

        // then:
        Assertions.assertFalse(expectedString.equals(actualString));
    }
}
