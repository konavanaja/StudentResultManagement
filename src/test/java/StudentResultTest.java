import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentResultTest {

    StudentResult result = new StudentResult();

    @Test
    void testCalculateTotal() {
        assertEquals(240, result.calculateTotal(80, 80, 80));
    }

    @Test
    void testCalculateAverage() {
        assertEquals(80.0, result.calculateAverage(80, 80, 80));
    }

    @Test
    void testCalculateGrade() {
        assertEquals("A", result.calculateGrade(95));
    }
}