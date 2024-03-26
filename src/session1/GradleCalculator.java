package session1;

import java.util.Scanner;

public class GradleCalculator {

    public static void main(String[] args) {

        // input : gradle
        // output : B
        // gradle -> 100 to 90 -> A+
        // gradle -> 90 to 80 -> B+
        // gradle -> 80 to 70 -> D+
        // gradle -> 70 to 50 -> C+
        // gradle -> 50 to 0 -> F

        Scanner input = new Scanner(System.in);
        // get gradle
        System.out.println("please inter gradle");
        double gradle = input.nextDouble();
        // check
        if (gradle <= 100 && gradle > 90){
            System.out.println("A+");
        } else if (gradle <= 90 && gradle > 80) {
            System.out.println("B+");
        }else if (gradle <= 80 && gradle > 70){
            System.out.println("D+");
        }else if (gradle <= 70 && gradle >50){
            System.out.println("C+");
        }else if (gradle<=50 && gradle >=0){
            System.out.println("F");
        }else {
            System.out.println("sorry invalid number");
        }
    }
}
