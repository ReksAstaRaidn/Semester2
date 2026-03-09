package JavaSem2.week5;

public class BankMain {
    public static void main(String[] args) {
        System.out.println("=== Bank Account===");

        BankAcccount akun1 = new BankAcccount("Reksa", 500);

        System.out.println("Nasabah: " + akun1.getName() + " memiliki saldo: " + "Rp " + akun1.getBalance());
        System.out.println("---------------------------------");

        akun1.deposit(200);
        akun1.withdraw(100);

        System.out.println("---------------------------------");
        System.out.println("Nasabah: " + akun1.getName() + " memiliki saldo: " + "Rp " + akun1.getBalance());
    }
    
}
