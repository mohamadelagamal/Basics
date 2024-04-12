package session5;

public abstract class Employee {

    private int id ;
    private double salary;
    private  String name ;

    Employee(int id, String name, double salary){
        // store data
        this.id = id;
        this.salary = salary;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public double calculateSalary() {
//        return 0;
//    }
    public abstract double calculateSalary();

}
