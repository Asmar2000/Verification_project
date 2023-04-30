


public class PartTimeEmployee extends Employee implements AntherSalary {
    private int hours;
    private double wages;

    public PartTimeEmployee() {
        super(null, 0,0);
    }

   
    
    
    public PartTimeEmployee( String Name, int ID, double baseSalary,int hours, double wages) {
        super(Name, ID, 0.0);
        this.hours = hours;
        this.wages = wages;
    }

 

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }
    
    @Override
    public double getCalculateSalary(){
        
        
        return getHours()*getWages();
  }  
    
    
    
    @Override
    public void printPerson()
    {
        
    System.out.println("the hours for part time employee "+getHours());
    System.out.println("the wages for part time employee"+getWages());
    System.out.println("the salary for part time employee"+getCalculateSalary());
    }

    
}
