import org.example.Student.Student;
import org.example.Student.StudentDB;
import org.example.Student.StudentNotFoundException;
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
            // Arrange
            String searchId = "1";
            String expectedName = "Max Mustermann";

            // Act
            Student foundStudent = studentDB.findByld(searchId);

            // Assert
            Assertions.assertNotNull(foundStudent);
            Assertions.assertEquals(expectedName, foundStudent.getName());
        } catch (StudentNotFoundException e) {
            Assertions.fail("Exception thrown unexpectedly: " + e.getMessage());
        }
    }

    @Test
    public void testFindByld_NonExistingId_ThrowsStudentNotFoundException() {
        // Arrange
        String searchId = "3";

        // Act & Assert
        Assertions.assertThrows(StudentNotFoundException.class, () -> {
            studentDB.findByld(searchId);
        });
    }
}
