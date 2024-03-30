package session3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {


        // array is a collection or similar type of elements

        // create -> data type , name  , set data

        // dynamic
        int [] numbers = {10, 20, 30, 40}; // -> sort items 1 -> 4
                        // 0 , 1 , 2 , 3 -> index -> sort items 0...3
      //  printArray(numbers);

        // static

        Scanner input = new Scanner(System.in);
        System.out.println("enter numbers of array");
        int number = input.nextInt(); // 12

        scanArray(number);



    }
    // input -> array
    // output -> print elements of array

     static void printArray (int [] numbers){
         for (int i=0; i < numbers.length;i++ ){

             System.out.println(  numbers[i]  );
         }
     }

     // scan Array
    // input -> number
    // output ->  print elements of array

    static void scanArray(int number){
        Scanner input = new Scanner(System.in);
        //static
        int [] numbersStaticArray = new int[number]; // array sort 5 items

        for (int i=0; i<numbersStaticArray.length; i++ ){

            // array[0] = 20
            // array[1] = 30 ........
            numbersStaticArray[i] = input.nextInt();
        }
     //   printArray(numbersStaticArray);
        System.out.println(Arrays.toString(numbersStaticArray));
    }
}
