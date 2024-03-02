import java.util.Scanner;

class DataTypes1 {
    public static void main(String[] args){
        String name;
        int age;
        float balance;
        double salary;
        long phoneNumber;
        short height;
        byte weight;
        boolean student;
        char grade;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Enter your age: ");
        age = scan.nextInt(); // range -2,147,483,648 to 2,147,483,647
        System.out.println("Enter your balance: ");
        balance = scan.nextFloat(); //
        System.out.println("Enter your salary: ");
        salary = scan.nextDouble(); // range -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println("Enter your phone number: ");
        phoneNumber = scan.nextLong(); // range -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println("Enter your height: ");
        height = scan.nextShort(); // range -32,768 to 32,767
        System.out.println("Enter your weight: ");
        weight = scan.nextByte(); // range -128 to 127
        System.out.println("Are you a student? ");
        student = scan.nextBoolean(); // 1 bit
        System.out.println("Enter your grade: ");
        grade = scan.next().charAt(0); // 2 byte : range 0 to 65,535
        

    }
}