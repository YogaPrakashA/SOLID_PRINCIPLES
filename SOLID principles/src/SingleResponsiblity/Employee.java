package SingleResponsiblity;

// violated single Responsibility principle rule of SOLID
public class Employee {

    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {

    }

    public int salaryCalculation() {
        return salary * 2000;
    }

    public void generateReport() {
        System.out.println("Report generate Successfully....");
    }

}

