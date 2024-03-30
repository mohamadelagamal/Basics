package session4;

public class Products {

    // public , private
    private int id;
    private String name;
    private double price;

    // add name of company
     static String marketName;

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

    // return data from private id [ Product ] to Oop class

    public int getId() {
        return id;
    }


    // get id from Oop class and set it -> id
    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
            this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
