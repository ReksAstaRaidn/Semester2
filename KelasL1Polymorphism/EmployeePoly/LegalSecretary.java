public class LegalSecretary extends Secretary {

    public LegalSecretary(int years) {
        super(years);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 5000.0;  // $55,000.00 / year
    }

    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }
}
