import java.util.Scanner;


public class ProjectFinal {

    public static void main(String[] args) {
        Factory factoryObject =new Factory();
     
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        double bonus = 0;
        while(exit == false){
        System.out.println("choose one one of the following options: ");
            System.out.println("[1] to check for an employee: ");
            System.out.println("[2] to check for an trainee: ");
            System.out.println("[3] to check for an part time employee: ");
            System.out.println("[4] to add an employee: ");
            System.out.println("[5] to add an trainee: ");
            System.out.println("[6] to add an part time employee: ");
            System.out.println("[7] to Dispaly data for all employees: ");
            System.out.println("[8] to Dispaly data for all trainees: ");
            System.out.println("[9] to Dispaly data for all part time employees: ");
            System.out.println("[10] to Dispaly how many numbers for every thing: ");
            System.out.println("[11] to exit the program: ");
            
        Scanner sc = new Scanner (System.in);
        int hw=sc.nextInt();    
            
        switch (hw){
            case 1:
                for (int i = 0; i < 1; i++) {
                    System.out.println("enter the ID of employee you what to check ");
                    int employeeID = input.nextInt();
                    boolean employeeValid= factoryObject.CheckEmployeeID(employeeID);
                    if(employeeValid==false){
                        System.out.println("the employee you looking for doesnot exist. ");
                        System.out.println("if you want to creat new one prees 4. ");
               
                    break;
                    }
                    else {
                    
                     System.out.println("this employee in the factory. ");
                    break;
                    }
                    
                }
             
            break;
            
            case 2: 
                 for (int i = 0; i < 1; i++) {
                    System.out.println("enter the ID of trainee you what to check ");
                    int traineeID = input.nextInt();
                    boolean traineeValid= factoryObject.CheckTraineeID(traineeID);
                    if(traineeValid==false){
                        System.out.println("the trainee you looking for doesnot exist. ");
                        System.out.println("if you want to creat new one prees 5. ");
               
                    break;
                    }
                    else {
                    
                     System.out.println("this trainee in the factory. ");
                    }   
                }
                 break;
               
            case 3:
             for (int i = 0; i < 1; i++) {
                    System.out.println("enter the ID of part time employee you what to check ");
                    int parTimeEmployeeID = input.nextInt();
                    boolean parTimeEmployeeValid= factoryObject.CheckPartTimeEmployeeID(parTimeEmployeeID);
                    if(parTimeEmployeeValid==false){
                        System.out.println("the part time employee you looking for doesnot exist. ");
                        System.out.println("if you want to creat new one prees 6. ");
               
                    break;
                    }
                    else {
                    
                     System.out.println("this part time employee in the factory. ");
                    }  
                    
                }
             
               break;
             
            case 4:
                System.out.println("enter the name of employee: ");   
                String employeeName = input.next();
                System.out.println("enter the ID of employee: ");   
                int employeeID = input.nextInt();
                System.out.println("enter the salary of employee per year: ");   
                double employeeSalary = input.nextDouble();
                System.out.println("enter the rank of this employee: \n [1] professor: \n [2] associate professor: \n [3] assistant professor: ");
                int rank = input.nextInt();
                if(rank == 1){
                bonus = employeeSalary+10000;
                
                }
                if(rank ==2){ 
                bonus = employeeSalary +5000;
                
                }
                if(rank ==3){
                bonus = employeeSalary +2500;
                }
                
                factoryObject.addEmployee(employeeName, employeeID, bonus);
                break;
                
                
              
            case 5:
                System.out.println("enter the name of trainee: ");   
                String traineeName = input.next();
                System.out.println("enter the ID of trainee: ");   
                int traineeID = input.nextInt();
                System.out.println("enter the salary of trainee: ");   
                double traineeSalary = input.nextDouble();
                factoryObject.addTrainee(traineeName, traineeID, traineeSalary);
                break;
                
                
               
            case 6:
                System.out.println("enter the name of part time employee: ");   
                String partEmployeeName = input.next();
                System.out.println("enter the ID of part time employee: ");   
                int partEmployeeID = input.nextInt();
                System.out.println("enter the hours of part time employee: ");   
                int partEmployeeHours = input.nextInt();
                System.out.println("enter the wages of part time employee per year: ");   
                double partEmployeeWages = input.nextDouble();
                factoryObject.addPartTimeEmployee(partEmployeeName, partEmployeeID,0.06, partEmployeeHours, partEmployeeWages);
                
                break;
               
                
            case 7:
                factoryObject.displayEmployeeData();
                      
               break;
                
            case 8:
                factoryObject.dispalyTraineeData();
                
                break;
                
                
            case 9:
                factoryObject.displayPartTimeEmployeeData();
                
                break;
                
                
            case 10:
                System.out.println(factoryObject.toString());
                
                break;
            case 11:
                exit = true;
                break;
            case 12:
                for (int i = 0; i < 1; i++) {
                    System.out.println("enter the ID of employee you what to check ");
                    int ID = input.nextInt();
                   factoryObject.FiredEmployeeID(ID);
                    
                        System.out.println("this employee has been fired: ");
              

                    
                }
             
            break;
                
            }
        
        }
      
    }
    
}
