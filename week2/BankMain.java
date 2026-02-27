package JavaSem2.week2;
import java.util.Scanner;
public class BankMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount account1 = new BankAccount("Andi", 500000.0);
        BankAccount account2 = new BankAccount("Budi", 100000.0);


        
        System.out.println(account1);
        System.out.println(account2);

        System.out.println("\n--- Transfer dari Andi ke Budi ---");
        System.out.print("Masukkan jumlah transfer: ");
        double jumlahTransfer = input.nextDouble();
        account1.transfer(account2, jumlahTransfer);
            System.out.println("Saldo Andi setelah transfer: " + account1);
            System.out.println("Saldo Budi setelah transfer: " + account2);
            

        System.out.print("Masukkan jumlah setor: ");
        double jumlahSetor = input.nextDouble();
        account1.setor(jumlahSetor);
        System.out.println("Saldo setelah setor: " + account1);
        
        System.out.print("Masukkan jumlah tarik: ");
        double jumlahTarik = input.nextDouble();
        account1.tarik(jumlahTarik);

        System.out.println("Saldo setelah tarik: " + account1);

        input.close();
    }
    
}
