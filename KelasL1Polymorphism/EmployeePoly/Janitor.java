public class Janitor extends Employee {

    public Janitor(int years) {
        super(years);
    }

    @Override
    public double getSalary() {
        return 30000.0 + 1500.0 * getYears();
    }

    @Override
    public int getSeniorityBonus() {
        return 1 * getYears();  // 1 bonus vacation day per year
    }

    public void clean() {
        System.out.println("Cleaning the premises — spotless guaranteed!");
    }
}
