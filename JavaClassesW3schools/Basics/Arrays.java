import java.util.Scanner;

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
        for(int i: prices){ // not working this way of input
            i = cin.nextInt();
        }
        // for(int i = 0; i<prices.length; ++i){
        //     prices[i] = cin.nextInt();
        // }
        for(int i : prices){
            System.out.print(i + ", ");
        }
    }
}