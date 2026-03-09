package JavaSem2.week5;

public class BankAcccount {

    private String name;
    private double balance;

    public BankAcccount(String name, double balance) {
        this.name = name;
        this.balance = balance;        
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit berhasil: Rp " + amount + " | Saldo saat ini: Rp " + this.balance);
        } else {
            System.out.println("Error: Deposit harus lebih besar dari 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance -= amount;
                System.out.println("Penarikan berhasil: Rp " + amount + " | Saldo saat ini: Rp " + this.balance);
            } else {
                System.out.println("Saldo tidak mencukupi");
            }
        } else {
            System.out.println("Error: Penarikan harus lebih besar dari 0.");
        }
    }
}


