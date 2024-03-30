package session4;

import java.util.Scanner;

public class Oop {

    public static void main(String[] args) {

//        int ids []=  {1,2,3,4};
//        String names [] ={"apple","meat","pepsi","cola"};
//        double prices[] ={10,20,30,40};
        //boolean barCode[] ={true,true,false,false};

       // use function
     ///   printProducts(ids,names,prices,barCode); // 1


//        int number=5;

        // new -> used  dynamic allocation memory
        // send data form oop to product
        int id = 1;
        String name = "pepsi";
        double price = 20.0;

        Products products= new Products(id,name,price);

       products.printItems();

    }
    // to create function
    // input -> ids[], names[], prices[]
    // output -> print data
    static void printProducts(int ids[],String names[],double prices[],boolean barCode[]){ //2
        for (int i=0;i<ids.length;i++){
            System.out.println(ids[i]);
            System.out.println(names[i]);
            System.out.println(prices[i]);
            System.out.println(barCode[i]); //3
        }
    }
}
