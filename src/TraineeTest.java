import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
public class TraineeTest {
    
    
    @Test
    public void testConstructor() {
        Trainee trainee = new Trainee("Karim Osama", 1234, 5000.0);
        assertEquals("Karim Osama", trainee.getName());
        assertEquals(1234, trainee.getID());
        assertEquals(5000.0, trainee.getTraineeSalary(), 0.0);
    }
    @Test
    public void testGetTraineeSalary() {
        Trainee trainee = new Trainee("Mahmoud", 1234, 5000.0);
        assertEquals(5000.0, trainee.getTraineeSalary(), 0.0);
    }
    
    @Test
    public void testSetTraineeSalary() {
        Trainee trainee = new Trainee("Mahmoud", 1234, 5000.0);
        trainee.setTraineeSalary(6000.0);
        assertEquals(6000.0, trainee.getTraineeSalary(), 0.0);
    }
    
    
}
