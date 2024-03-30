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

   //     Products products= new Products(id,name,price);

     //  products.printItems();
//       products.id = 10;
//        System.out.println(products.id);
//
//        products.setId(100);
//        System.out.println( "this is id  "+products.getId());
//        // update name
//        products.setName("Cola");
//        System.out.println("this is name  "+products.getName());
//        // update price
//        products.setPrice(0);
//        System.out.println("this is price  "+ products.getPrice());


        // static
        Products productsOne = new Products();
        productsOne.marketName = "Carrefour";
        System.out.println(productsOne.marketName);


        Products productsTwo = new Products();

        System.out.println(productsTwo.marketName);







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
