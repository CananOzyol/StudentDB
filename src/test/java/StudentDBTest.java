import org.example.Student.Student;
import org.example.Student.StudentDB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentDBTest {
    private StudentDB studentDB;

    @BeforeEach
    public void setup() {
        studentDB = new StudentDB();
        studentDB.addStudent(new Student("1", "Max Mustermann"));
        studentDB.addStudent(new Student("2", "Erika Musterfrau"));
    }

    @Test
    public void testFindByld_ExistingId_ReturnsStudent() {
        try {

            String searchId = "1";
            String expectedName = "Max Mustermann";

            Student foundStudent = studentDB.findByld(searchId);

            Assertions.assertNotNull(foundStudent);
            Assertions.assertEquals(expectedName, foundStudent.getName());
        } catch (StudentDB.StudentNotFoundException e) {
            Assertions.fail("Exception thrown unexpectedly: " + e.getMessage());
        }
    }

    @Test
    public void testFindByld_NonExistingId_ThrowsStudentNotFoundException() {
        // Arrange
        String searchId = "3";

        // Act & Assert
        Assertions.assertThrows(StudentDB.StudentNotFoundException.class, () -> {
            studentDB.findByld(searchId);
        });
    }
}
