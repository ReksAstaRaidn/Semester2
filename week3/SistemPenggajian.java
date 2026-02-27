package JavaSem2.week3;

public class SistemPenggajian {
    public static void main(String[] args) {
        System.out.println("=== SISTEM PENGGAJIAN KAMPUS ===\n");

        // Polimorfisme tingkat lanjut: Array bertipe Interface!
        // Array ini bisa menampung OBJEK APAPUN dari CLASS MANAPUN, 
        // asalkan class tersebut meng-implements Payable.
        Payable[] daftarGaji = new Payable[3];

        // Indeks 0 dan 1 diisi oleh AsistenLab (Turunan Student)
        daftarGaji[0] = new AsistenLab(201, "Citra", 90, 15, 600000);
        daftarGaji[1] = new AsistenLab(202, "Diana", 88, 14, 550000);
        
        // Indeks 2 diisi oleh Dosen (Bukan turunan Student)
        daftarGaji[2] = new Dosen("Pak Budi", "123456789", 500000, 12);

        int totalPengeluaran = 0;

        // Looping untuk memproses pembayaran
        for (int i = 0; i < daftarGaji.length; i++) {
            Payable penerima = daftarGaji[i];
            
            // Memanggil method yang dijamin ADA oleh kontrak interface
            int gaji = penerima.hitungGajiBersih();
            totalPengeluaran += gaji;

            // Mencetak rincian (otomatis memanggil toString() masing-masing objek asli)
            System.out.println(penerima.toString() + " | Cair: Rp" + gaji);
        }

        System.out.println("\n------------------------------------------------");
        System.out.println("Total Pengeluaran Kampus: Rp" + totalPengeluaran);
    }
}

