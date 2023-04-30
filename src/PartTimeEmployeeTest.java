import org.junit.Test;
import static org.junit.Assert.*;

public class PartTimeEmployeeTest {

    @Test
    public void testGetHours() {
        PartTimeEmployee employee = new PartTimeEmployee("John Doe", 1234, 2000.0, 20, 25.0);
        assertEquals(20, employee.getHours());
    }

    @Test
    public void testSetHours() {
        PartTimeEmployee employee = new PartTimeEmployee("John Doe", 1234, 2000.0, 20, 25.0);
        employee.setHours(30);
        assertEquals(30, employee.getHours());
    }

    @Test
    public void testGetWages() {
        PartTimeEmployee employee = new PartTimeEmployee("John Doe", 1234, 2000.0, 20, 25.0);
        assertEquals(25.0, employee.getWages(), 0.001);
    }

    @Test
    public void testSetWages() {
        PartTimeEmployee employee = new PartTimeEmployee("John Doe", 1234, 2000.0, 20, 25.0);
        employee.setWages(30.0);
        assertEquals(30.0, employee.getWages(), 0.001);
    }

    @Test
    public void testGetCalculateSalary() {
        PartTimeEmployee employee = new PartTimeEmployee("John Doe", 1234, 2000.0, 20, 25.0);
        assertEquals(500.0, employee.getCalculateSalary(), 0.001);
    }

    @Test
    public void testPrintPerson() {
        PartTimeEmployee employee = new PartTimeEmployee("John Doe", 1234, 2000.0, 20, 25.0);
        employee.printPerson();
        // Verify that the output matches the expected format
        // and contains the correct information
    }
}
