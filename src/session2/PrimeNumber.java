package session2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        // input -> number
        // output -> is number prime or not
        // prime number is number divisible 1,itself

        // 5
        // 1 .......5
        // 5/1 true
        // 5/2 false
        // 5/3 false
        // 5/4 false
        // 5/5 true
        Scanner input = new Scanner(System.in);
        System.out.println("enter number ");
        int number = input.nextInt();

//        int counter =0;
//        for (int i =1; i<=number;i++){
//            // 12%i -> 0
//            // 13%i->1
//            if (number%i==0){
//                counter++;
//            }
//        }
//        if (counter==2){
//            System.out.println("This number is Prime");
//        }else {
//            System.out.println("this number is not Prime");
//        }

        // 6  1.........6
        boolean isPrime = true;
        for (int i=2; i<number; i++){
            if (number%i==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime==true){
            System.out.println("prime");
        }else {
            System.out.println("not Prime");
        }
    }
}
