import java.math.BigDecimal;
public class DataTypes {
    public static void main(String[] args) {
        
        // all data types
        System.out.println("Hello");
        String name = "Golam Rabbani"; //Non-primitive, also array
        int age = 23;
        //Integer age2 = 4294967295; // Wrapper class
        float balance = 10.5f;
        double salary = 2344232.234;
        BigDecimal salary2 = new BigDecimal("2344232.234");
        long phoneNumber = 1234567890;
        Long phoneNumber2 = 1234567890L; 
        short height = 5; // 2 byte weight : range -32,768 to 32,767
        byte weight = 60; // 1 byte : range -128 to 127
        // int, float, double, char, boolean, long, short, byte
        boolean student = true; // 1 bit
        char grade = 'A'; // 2 byte : range 0 to 65,535

        System.out.println(name + " is " + age + " years old." + " His balance is " + balance + " and salary is " + salary + " and phone number is " + phoneNumber + " and height is " + height + " and weight is " + weight + " and he is a student " + student + " and his grade is " + grade + ".");

    }
}