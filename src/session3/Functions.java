package session3;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        // program -> input , output
        // function -> input , output

        // input user
        Scanner input = new Scanner(System.in);
        System.out.println("enter two number ");
        int numberOne = input.nextInt();
        //int numberTwo = input.nextInt();
//
//        int result = add(number,numberTwo);
//
//        System.out.println(result);

//        float result = getMaxNumber(numberOne,numberTwo);
//
//        System.out.println(result);

//        float result = getFactorial(numberOne);
//        System.out.println(result);


       isPrime(numberOne);

    }
    // function
    // input -> two number
    // output -> return sum

    // function_type , name , (parameters) {
    //  function body
    // }
   static int add(int numberOne,int numberTwo){
        return numberOne+numberTwo; // 5
    }

    // functions
    // input -> two numbers
    // output -> max number
    static float getMaxNumber(float numberOne,float numberTwo){
        if (numberOne>numberTwo){
            return numberOne;
        }else {
            return numberTwo;
        }

    }

    // function
    // input-> number
    // output-> factorial of this number
    // 3 -> 3*(3-1)*(3-2) = 6


    // void is a return type of function that does not return any value
    static int getFactorial (int number){
        // create
        int result = 1;
        for (int i=1; i<=3; i++ ){
            // code
            result = result *i ;
        }
        return result;
    }

    // function
    // input-> number
    // output-> is prime or not
    static void isPrime(int number){

        // 13%2 -> 1 odd
        // 12 %2 -> 0 even
        int counter = 0;
        for (int i=1;i<=number;i++){
            if (number%i ==0){
                // counter use to count how many times number is divisible
                counter = counter +1 ;
            }
        }
        if (counter==2){
            System.out.println("Number is Prime");
        }else {
            System.out.println("number not prime");
        }

    }
}
