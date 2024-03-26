package session2;

import java.util.Scanner;

public class EndlessSummation {
    public static void main(String[] args) {

        // input -> numbers // is enter Zero(0)
        // output -> summation of numbers

        Scanner input = new Scanner(System.in);

        System.out.println("enter numbers ");
        int number =1 ;

        int result = 0;

        while (number!=0){
          number = input.nextInt();
          result = result +number ;
        }

        System.out.println("sum of all numbers is "+result);

    }
}
