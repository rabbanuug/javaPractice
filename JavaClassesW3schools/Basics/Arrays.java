import java.util.Scanner;
import java.util.Random;

public class Arrays{

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        for(int i: arr){
            // System.out.println(i); //line by line
            System.out.print(i + ", ");
        }
        System.out.println();

        int[] prices = new int[10];

        Scanner cin = new Scanner(System.in);
        // for(int i: prices){ // not working this way of input
        //     i = cin.nextInt();
        // }
        for(int i = 0; i<prices.length; ++i){
            prices[i] = cin.nextInt();
        }
        for(int i : prices){
            System.out.print(i + ", ");
        }
        System.out.println();
        //reverse order
        for(int i = prices.length-1; i>=0; --i){
            System.out.print(prices[i]+", ");
        }
        System.out.println();

        //present on even or odd position
        for(int i = 0; i<prices.length; i++){
            if(i%2==0) System.out.print(prices[i]+", ");
        } System.out.println();

        //print largest/smallest element
        Random r = new Random();
        for(int i = 0; i<prices.length; ++i){
            prices[i] = r.nextInt(100);
        }
        for(int i: prices){
            System.out.print(i +", ");
        }
        System.out.println();
        int mx = 0;
        for(int i: prices) if(i>mx) mx = i;
        System.out.println(mx);

        //sum of all items
        int sum = 0;
        for(int i : prices) sum += i;
        System.out.println(sum);

        //print odd, even numbers
        for(int i= 0; i<prices.length; ++i){
            if(prices[i]%2 == 0) System.out.print(prices[i]+", ");
        }
        



    }
}