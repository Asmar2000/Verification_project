
import java.util.ArrayList;
public class Employee extends Person {
    

    private double baseSalary;
 
    private ArrayList<Employee> EmployeeList = new ArrayList<Employee>();

    public Employee() {
        super(null, 0);
    }
    
    
    
    public Employee(String Name, int ID, double baseSalary) {
        super(Name, ID);
        
        this.baseSalary= baseSalary;
       
    } 
   

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
  
    
    @Override
    public void printPerson() {
        System.out.println("Employee name: "+ getName());
        System.out.println("Employee ID: "+ getID());
        System.out.println("Employee Base salary: "+ getBaseSalary());
    
    }
    
 
}

  


