public class Methods{
    public static void greet(){// void
        System.out.println("Good Morning");
    }
    public static void sum(int number1, int number2){ //non rt with parameters
        System.out.println(number1 + number2);
    }
    public static int multiply(int num1, int num2){
        return num1*num2;
    }
    public static void main(String[] args){
        greet();
        sum(1,2);
        System.out.println(multiply(5,4));
        
    }
}
