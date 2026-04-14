package PencarianRekeningBank;

import JavaSem2.week5.BankAcccount;
import java.util.ArrayList;
import java.util.Collections;

public class SistemPencarianBank {
    
    public static void main(String[] args) {
        ArrayList<BankAcccount> daftarRekening = new ArrayList<>();
        daftarRekening.add(new BankAcccount("Andi", 500000));
        daftarRekening.add(new BankAcccount("Budi", 750000));
        daftarRekening.add(new BankAcccount("Charlie", 300000));
        daftarRekening.add(new BankAcccount("Dewi", 900000));
        daftarRekening.add(new BankAcccount("Eka", 450000));
        daftarRekening.add(new BankAcccount("Fajar", 600000));

        System.out.println("Daftar rekening sebelum diurutkan:");
        for (BankAcccount acc : daftarRekening) {
            System.out.println(acc.getName() + " - Saldo: Rp " + acc.getBalance());
        }

        // Urutkan berdasarkan saldo (ascending)
        Collections.sort(daftarRekening);
        
        System.out.println("\nDaftar rekening setelah diurutkan berdasarkan saldo:");
        for (BankAcccount acc : daftarRekening) {
            System.out.println(acc.getName() + " - Saldo: Rp " + acc.getBalance());
        }

        
        int indeks = cariRekening(daftarRekening, 300000);
        if (indeks != -1) {
            System.out.println("\nRekening ditemukan pada indeks: " + indeks);
        } else {
            System.out.println("\nRekening tidak ditemukan.");
        }

    }

    public static int cariRekening(ArrayList<BankAcccount> list, double targetSaldo) {
        int min = 0;
        int max = list.size() - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            double midSaldo = list.get(mid).getBalance();

            if (midSaldo == targetSaldo) {
                return mid; // Ditemukan, kembalikan indeks
            } else if (midSaldo < targetSaldo) {
                min = mid + 1; // Cari di sebelah kanan
            } else {
                max = mid - 1; // Cari di sebelah kiri
            }
        }
        return -1; // Tidak ditemukan
    }
}
