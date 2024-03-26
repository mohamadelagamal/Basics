package session1;

import java.util.Scanner;

public class SampleCalculator {
    public static void main(String[] args) {

        // input : two numbers
        // print menu
        // press 1 to +
        // press 2 to *
        // press 3 to -
        // press 4 to /
        // output : print  result

        Scanner input = new Scanner(System.in);

        System.out.println("please enter two number");
        // get numbers

        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        // show menu
        System.out.println("press 1 to + ");
        System.out.println("press 2 to *");
        System.out.println("press 3 to -");
        System.out.println("press 4 to /");
        int operator = input.nextInt();

        if (operator==1){
            System.out.println(numberOne+numberTwo);
        } else if (operator==2) {
            System.out.println(numberOne * numberTwo);
        } else if (operator == 3) {
            System.out.println(numberOne-numberTwo);
        } else if (operator==4){

           if (numberTwo==0){
                System.out.println("you have a problem "+numberTwo);
            }else {
                System.out.println(numberOne/numberTwo);
            }

        } else {
            System.out.println("invalid number");
        }

    }
}
