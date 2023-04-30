


public abstract class Person extends Factory {


    private String Name;
    private int ID;
Person(String Name,int ID ){
this.Name =Name;
this.ID =ID;
}



      public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
  public abstract void printPerson();
}
