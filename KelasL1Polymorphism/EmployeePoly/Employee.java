public class Employee {
    private int years;  

    public Employee(int initialYears) {
        years = initialYears;
    }

    public int getHours() {
        return 40;  // works 40 hours / week
    }

    public double getSalary() {
        return 50000.0;  // $50,000.00 / year (after $10,000 raise)
    }

    public int getVacationDays() {
        return 10 + getSeniorityBonus();
    }

    public int getSeniorityBonus() {
        return 2 * years;  // 2 extra vacation days per year worked
    }

    public String getVacationForm() {
        return "yellow";  // use the yellow form
    }

    public int getYears() {
        return years;
    }
}
