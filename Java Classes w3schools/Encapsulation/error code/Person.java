public class Person{
    // code copy 1 line up or down | Shift+Alt+Up Arrow
    
    // public String name; // if it is public, this code will not show any error
    private String name; // as it is private, this code will show error. have to take another action
    
    
    //getter
    public String getName(){
        return name;
    }

    //Setter 
    public void setName(String newName){
        this.name = newName;
    }
}