package session5;

public class Programmer extends Employee {

    private String frameWork;


    // get data form Main class
    public Programmer(int id, String name, double salary, String frameWork) {
        // store data
//        this.setId(id);
//        this.setName(name);
//        this.setSalary(salary);
        super(id,name,salary);
        this.frameWork = frameWork;
    }


    public String getFrameWork() {
        return frameWork;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }


    @Override
    public double calculateSalary() {
        return  getSalary()*3;
    }
}
