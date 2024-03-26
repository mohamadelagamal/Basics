package session1;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        // input -> two number
        // output -> print max

        Scanner input = new Scanner(System.in);
        // print
        System.out.println("please enter two number ");

        double numberOne = input.nextDouble();
        double numberTwo = input.nextDouble();

        if (numberOne > numberTwo){
            System.out.println(numberOne);
        } else if (numberTwo > numberOne) {
            System.out.println(numberTwo);
        }else {
            System.out.println("sorry Invalid numbers ");
        }
    }
}
