import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactoryTest {
    private Factory factory;

    @Before
    public void setUp() {
        factory = new Factory();
    }

    @Test
    public void testGetFactoryName() {
        assertEquals("K.SH", factory.getFaclotyName());
    }

    @Test
    public void testSetFactoryName() {
        factory.setFactoryName("ABC");
        assertEquals("ABC", factory.getFaclotyName());
    }

    @Test
public void testAddTrainee() {
    factory.addTrainee("John", 1, 1000.0);
    assertEquals(1, factory.getTraineeList().size());
    assertEquals(1, factory.getNumberOfTrainee());
}


    @Test
    public void testDisplayTraineeData() {
        factory.addTrainee("John", 1, 1000.0);
        factory.addTrainee("Mary", 2, 2000.0);
        factory.dispalyTraineeData();
    }

    @Test
    public void testAddEmployee() {
        factory.addEmployee("Tom", 3, 3000.0);
        assertEquals(1, factory.EmployeeList.size());
        assertEquals(1, factory.numberOfEmployee);
    }

    @Test
    public void testDisplayEmployeeData() {
        factory.addEmployee("Tom", 3, 3000.0);
        factory.addEmployee("Jerry", 4, 4000.0);
        factory.displayEmployeeData();
    }

    @Test
    public void testAddPartTimeEmployee() {
        factory.addPartTimeEmployee("Bob", 5, 0.0, 20, 50.0);
        assertEquals(1, factory.partTimeEmployeeList.size());
        assertEquals(1, factory.numberOfPartTimeEmployee);
    }

    @Test
    public void testDisplayPartTimeEmployeeData() {
        factory.addPartTimeEmployee("Bob", 5, 0.0, 20, 50.0);
        factory.addPartTimeEmployee("Alice", 6, 0.0, 15, 40.0);
        factory.displayPartTimeEmployeeData();
    }

    @Test
    public void testToString() {
        String expected = "the name of factory: K.SH\n" +
                "total number Employee: 0\n" +
                "total number trainee: 0\n" +
                "total number of part time employee: 0";
        assertEquals(expected, factory.toString());
    }

    @Test
    public void testCheckTraineeID() {
        factory.addTrainee("John", 1, 1000.0);
        assertTrue(factory.CheckTraineeID(1));
        assertFalse(factory.CheckTraineeID(2));
    }

    @Test
    public void testCheckEmployeeID() {
        factory.addEmployee("Tom", 3, 3000.0);
        assertTrue(factory.CheckEmployeeID(3));
        assertFalse(factory.CheckEmployeeID(4));
    }

    @Test
    public void testCheckPartTimeEmployeeID() {
        factory.addPartTimeEmployee("Bob", 5, 0.0, 20, 50.0);
        assertTrue(factory.CheckPartTimeEmployeeID(5));
        assertFalse(factory.CheckPartTimeEmployeeID(6));
    }

    @Test
    public void testFiredEmployeeID_Found() {
        factory.addEmployee("John", 123, 1000.0);
        assertTrue(factory.CheckEmployeeID(123));
        factory.FiredEmployeeID(123);
        assertFalse(factory.CheckEmployeeID(123));
    }
    
    @Test
    public void testFiredEmployeeID_NotFound() {
        assertFalse(factory.CheckEmployeeID(456));
        factory.FiredEmployeeID(456);
        assertFalse(factory.CheckEmployeeID(456));
    }
}
