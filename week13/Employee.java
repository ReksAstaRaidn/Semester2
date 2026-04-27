package JavaSem2.week13;

public class Employee {

    private String name;
    private int salary;
    private int years;
    
    public Employee(String name, int salary, int years) {
        this.name = name;
        this.salary = salary;
        this.years = years;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getYears() {
        return this.years;
    }

    public String toString() {
        return "Employee: " + this.name + " | Salary: " + this.salary + " | Years: " + this.years;
    }
}
