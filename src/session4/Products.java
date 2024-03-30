package session4;

public class Products {
    
    int id;
    String name;
    double price;

    // function -> type , name , parameters
    void printItems(){
        System.out.println("id -> "+id + "  name -> "+name+ "  price -> "+price);
    }

    // constructor , attributes , methods
    Products( ){ // default constructor -> used to initialize the object
        id = 1;
        name = "pepsi";
        price= 20.0;
    }

    // 2
    Products(int id, String name, double price){ // parameterized constructor

        // update id
        this.id = id;
        this.name = name;
        this.price = price;

    }

    
}
