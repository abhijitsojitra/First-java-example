public class First{
  
  private String name;
  
  public void setName(String n){
    name = n;
  }
  public String getName(){
    return name;
  }
  
  public static void main(String args[]){
    
    First f = new First();
    //set name member of this object
    f.setName("Visitor");
    // print the name
    System.out.println("Hello " + f.getName());      
  }
}
