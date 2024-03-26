package session2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // input -> number
        // output -> factorial of number
        // 5 -> 5 * (5-1) * (5-2) * (5-3) * (5-4)

        Scanner input = new Scanner(System.in);

        System.out.println("enter number ");
        int number = input.nextInt();

        int result = 1;
        for (int i=1; i<=number;i++){
            result = result * i ;
        }
        System.out.println(result);
    }
}
