import org.junit.Test;
import static org.junit.Assert.*;

public class ProjectFinalTest {
   


    
    @Test
    public void testCheckEmployeeID() {
        Factory factory = new Factory();
        factory.addEmployee("John", 1234, 50000);
        assertTrue(factory.CheckEmployeeID(1234));
        assertFalse(factory.CheckEmployeeID(5678));
    }
    
    @Test
    public void testCheckTraineeID() {
        Factory factory = new Factory();
        factory.addTrainee("Sarah", 5678, 20000);
        assertTrue(factory.CheckTraineeID(5678));
        assertFalse(factory.CheckTraineeID(1234));
    }
    
    @Test
    public void testCheckPartTimeEmployeeID() {
        Factory factory = new Factory();
        factory.addPartTimeEmployee("Alex", 9101, 0.06, 20, 10);
        assertTrue(factory.CheckPartTimeEmployeeID(9101));
        assertFalse(factory.CheckPartTimeEmployeeID(2345));
    }
    
    
    @Test
    public void testToString() {
        Factory factory = new Factory();
        factory.addEmployee("John", 1234, 50000);
        factory.addTrainee("Sarah", 5678, 20000);
        factory.addPartTimeEmployee("Alex", 9101, 0.06, 20, 10);
        String expected = "the name of factory: K.SH\ntotal number Employee: 1\ntotal number trainee: 1\ntotal number of part time employee: 1";
        assertEquals(factory.toString(), expected);
    }
    
}

