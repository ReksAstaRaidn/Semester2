public class Marketer extends Employee {

    public Marketer(int years) {
        super(years);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 10000.0;  // $60,000.00 / year
    }

    public void advertise() {
        System.out.println("Act now while supplies last!");
    }
}
