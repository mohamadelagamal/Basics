package session2;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        // input - > two number
        // output ->  numberOne * numberTwo
        // don't use * use +

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Two number");

        int numberOne = input.nextInt(); // 2  -> 0 1 2
        int numberTwo = input.nextInt(); // 3

        int result = 0;
        for (int i =0; i<numberOne; i++){
            result = result + numberTwo;
        }
        System.out.println(result);


        // 2 * 3 = 6
        // 2+2+2  , 3+3
    }
}
