
import java.util.ArrayList;

public class Factory  {
private String factoryName="K.SH";
private static int numberOfEmployee =0;
private static int numberOfTrainee =0;
private static int numberOfPartTimeEmployee =0;
private ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
private ArrayList<PartTimeEmployee> partTimeEmployeeList = new ArrayList<PartTimeEmployee>();
private ArrayList<Trainee> traineeList = new ArrayList<Trainee>();

    public Factory() {
    }

    public String getFaclotyName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public void addTrainee(String Name, int ID, double traineeSalary){
    Trainee stu = new Trainee(Name, ID, traineeSalary);
    traineeList.add(stu);
    numberOfTrainee++;
    }
    public void dispalyTraineeData(){   
     for (int i=0; i<traineeList.size();i++) {
    System.out.println((i+1)+"\n"+ "name of traineer: " +traineeList.get(i).getName()+"\n ID: "+ traineeList.get(i).getID()+" \n the salary due trainig: "+traineeList.get(i).getTraineeSalary());
    System.out.println("____________________________________");
    } 
  }
    
    
      public void addEmployee(String Name, int ID, double baseSalary){

      Employee emp = new Employee(Name,ID, baseSalary);
      EmployeeList.add(emp);
      numberOfEmployee++;
}
      public void displayEmployeeData(){
          for (int i = 0; i <EmployeeList.size(); i++) {
              System.out.println((i+1)+"\n"+ "name of employee: "+EmployeeList.get(i).getName()+"\n employee ID: "+EmployeeList.get(i).getID()+"\n employee base salary: "+EmployeeList.get(i).getBaseSalary());
              System.out.println("____________________________________");
          }
      
      }
      
      public void addPartTimeEmployee(String Name, int ID,double baseSalary, int hours, double wages){

      PartTimeEmployee par = new PartTimeEmployee(Name,ID,0.0,hours,wages);
      partTimeEmployeeList.add(par);
      numberOfPartTimeEmployee++;
}
      public void displayPartTimeEmployeeData(){
          for (int i = 0; i <partTimeEmployeeList.size(); i++) {
              System.out.println((i+1)+"\n"+ "Part Time Employee: "+partTimeEmployeeList.get(i).getName()+"\n Part Time Employee ID: "+partTimeEmployeeList.get(i).getID()+"\n part time employee hours: "+partTimeEmployeeList.get(i).getHours());
              System.out.println( "part time employee: "+partTimeEmployeeList.get(i).getWages()+"\n part tim employee salary: "+partTimeEmployeeList.get(i).getCalculateSalary() );
              System.out.println("____________________________________");
          }
      
      }
      
      
      
@Override
   public String toString(){
   
   return "the name of factory: "+ factoryName +"\n"+"total number Employee: "+ numberOfEmployee +"\n" +"total number trainee: "+ numberOfTrainee+"\n" +"total number of part time employee: "+numberOfPartTimeEmployee;
   }
      
    
   public boolean CheckTraineeID(int ID){
       for (int i = 0; i < traineeList.size(); i++) {
           if(ID == traineeList.get(i).getID()){
           
           return true;
           }
           
       } 
    return false;
   }
   
      public boolean CheckEmployeeID(int ID){
       for (int i = 0; i < EmployeeList.size(); i++) {
           if(ID == EmployeeList.get(i).getID()){
           
           return true;
           }
           
       } 
    return false;
   }
      public void FiredEmployeeID(int ID){
       for (int i = 0; i < EmployeeList.size(); i++) {
           if(ID == EmployeeList.get(i).getID()){
               continue;
           }
           
       } 
   
   }
   public boolean CheckPartTimeEmployeeID(int ID){
       for (int i = 0; i < partTimeEmployeeList.size(); i++) {
           if(ID == partTimeEmployeeList.get(i).getID()){
           
           return true;
           }
           
       } 
    return false;
   }
   
   

}
