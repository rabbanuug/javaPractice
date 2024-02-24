import java.util.Scanner; // import the Scanner class
// java.util is a package, while Scanner is a class in that package

//import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String username = myObj.nextLine();

        System.out.println("Username is: "+ username);
    }
}