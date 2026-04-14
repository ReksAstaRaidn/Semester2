package JavaSem2.week5;

import java.util.Collections;
import java.util.ArrayList;

public class TestBankSort {
    public static void main(String[] args) {
    ArrayList<BankAcccount> accounts = new ArrayList<>();

    accounts.add(new BankAcccount("Reksa", 500000));
    accounts.add(new BankAcccount("Dewi", 750000));
    accounts.add(new BankAcccount("Budi", 250000));

    System.out.println("Sebelum sorting:");
    System.out.println(accounts);

    Collections.sort(accounts);

    System.out.println("Setelah sorting:");
    System.out.println(accounts);

    }
   


}
