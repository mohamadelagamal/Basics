package session5;

public class Accountant extends Employee {

    private boolean certificationExcel;

    public Accountant(int id, String name, double salary, boolean certificationExcel) {
        super(id, name, salary);
        this.certificationExcel=certificationExcel;
    }

    // Accountant use to create object to store data


    public boolean isCertificationExcel() {
        return certificationExcel;
    }

    public void setCertificationExcel(boolean certificationExcel) {
        this.certificationExcel = certificationExcel;
    }

    @Override
    public double calculateSalary() {
        return  getSalary() *2 ;
    }
}
