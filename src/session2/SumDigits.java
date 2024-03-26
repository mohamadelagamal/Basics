package session2;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {

        // input -> 1234
        // output-> sum of all digits ( 1 +2 +3 + 4)

        Scanner input = new Scanner(System.in);
        System.out.println("enter number ");
        int number = input.nextInt(); // 15 -> 6

        // 15 %10 -> 5
        // 15/10 -> 1

        // 99 % 10 -> 9
        // 99 /10 -> 9

        int sum = 0 ;

        while (number!=0){
            // get end digit by %
            int digit = number %10 ;
            // set digit
            sum = sum + digit ;
            // delete
            number = number/10;

        }
        System.out.println("the summation of digits is  "+sum);



    }
}
