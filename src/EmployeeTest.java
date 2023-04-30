import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
    
    private Employee employee;
    
    @Before
    public void setUp() {
        employee = new Employee("John Smith", 123, 50000);
    }
    
    @Test
    public void testGetBaseSalary() {
        assertEquals(50000, employee.getBaseSalary(), 0);
    }
    
    @Test
    public void testSetBaseSalary() {
        employee.setBaseSalary(60000);
        assertEquals(60000, employee.getBaseSalary(), 0);
    }
    
    @Test
    public void testPrintPerson() {
        // Redirect standard output to a buffer
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        employee.printPerson();
        
        String expectedOutput = "Employee name: John Smith\n" +
                                "Employee ID: 123\n" +
                                "Employee Base salary: 50000.0\n";
        assertEquals(expectedOutput, outContent.toString());
    }
    
    @Test
    public void testEmployeeList() {
        // Create a new Employee and add it to the list
        Employee employee2 = new Employee("Jane Doe", 456, 60000);
        employee.getEmployeeList().add(employee2);
        
        // Check that the list contains the new Employee
        assertTrue(employee.getEmployeeList().contains(employee2));
    }
    
}
