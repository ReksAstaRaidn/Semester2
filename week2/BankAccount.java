package JavaSem2.week2;

public class BankAccount {
    private String nama;
    private double saldo;

    public BankAccount(String nama, double saldo) {
        this.nama = nama;
        this.saldo = saldo;
        
    }

    public void setor (double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor berhasil. Saldo sekarang: " + saldo);
        } else {
            System.out.println("Jumlah setor harus positif.");
        }
    }
    public void tarik (double jumlah) {
        if (jumlah > 0) {
            if (saldo >= jumlah) {
                saldo -= jumlah;
                System.out.println("Tarik berhasil. Saldo sekarang: " + saldo);
            } else {
                System.out.println("Saldo tidak cukup mencukupi!.");
            }
        } else {
            System.out.println("Jumlah tarik harus positif.");
        }
    }
    public String toString() {
        return "Nama: " + nama + " | Saldo: " + saldo;
    }
    public void transfer(BankAccount tujuan, double jumlah) {
        if (jumlah > 0) {
            if (saldo >= jumlah) {
                this.tarik(jumlah);
                tujuan.setor(jumlah);
                System.out.println("Transfer berhasil. Saldo sekarang: " + saldo);
            } else {
                System.out.println("Saldo tidak cukup untuk transfer!.");
            }
        } else {
            System.out.println("Jumlah transfer harus positif.");
        }
    }
}

