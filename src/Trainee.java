

import java.util.ArrayList;

public class Trainee extends Person{

private double traineeSalary; 
private ArrayList<Trainee> traineeList = new ArrayList<Trainee>();

    public Trainee(){
    super(null, 0);   
 }

    public Trainee(String Name, int ID, double traineeSalary) {
        super(Name, ID);
        this.traineeSalary= traineeSalary;
    }

    public double getTraineeSalary() {
        return traineeSalary;
    }

    public void setTraineeSalary(double traineeSalary) {
        this.traineeSalary = traineeSalary;
    }

    
    @Override
    public void printPerson() {
        System.out.println("trainee name: "+ getName());
        System.out.println("trainee ID: "+ getID());
        System.out.println("trainee salary: "+ getTraineeSalary());
    }
}





    

