package session1;

import java.util.Scanner;

public class ConvertSecond {


    public static void main(String[] args) {

        // input -> second  3666
        // output -> hour , minutes , second

        // hour = 60 minutes , minutes = 60 second
        Scanner input = new Scanner(System.in);

        System.out.println("please enter second ");
        int second = input.nextInt(); // 3666
        // get hour
        int hour = second/ (3600);
        System.out.println("hour "+hour);
        // get minutes
        second = second % 3600 ; // update 66
        int minute = second / 60 ;
        System.out.println("minute "+minute);
        // get second
        // update second
        second = second%60; //6
        System.out.println("second "+second);

    }


}
