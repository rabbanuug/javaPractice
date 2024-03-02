import java.util.*;
public class PrintDigits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        //123
        //print 1 2 3
        int number = scan.nextInt();
        int temp = number;
        int count = 0;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        temp = number;
        int divisor = (int)Math.pow(10,count-1);
        while(temp>0){
            int digit = temp/divisor;
            System.out.println(digit);
            temp = temp%divisor;
            divisor = divisor/10;
        }


    }
}