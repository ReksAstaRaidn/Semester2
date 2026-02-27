package JavaSem2.week3;

public class LaporanPolimorfisme {
    
    public static void main(String[] args) {
        System.out.println("=== LAPORAN KELAS (POLIMORFISME) ===\n");

        // 1. Membuat Array bertipe Superclass (Student)
        Student[] daftarKelas = new Student[4];

        // 2. Mengisi array dengan tipe objek yang BERBEDA-BEDA
        // Ini adalah Polimorfisme: Variabel tipe Superclass bisa diisi objek Subclass
        daftarKelas[0] = new Student("Andi", 85, 101, 14);
        daftarKelas[1] = new Student("Budi", 70, 102, 10); // Akan kena [BLOKIR]
        
        // Memasukkan subclass ke tipe array superclass
        daftarKelas[2] = new AsistenLab(201, "Citra", 90, 15, 600000);
        daftarKelas[3] = new AsistenLab(202, "Diana", 88, 14, 550000);

        // 3. Menelusuri array dan mencetak output
        for (int i = 0; i < daftarKelas.length; i++) {
            // Momen "Keajaiban" Polimorfisme terjadi di baris ini
            System.out.println(daftarKelas[i]);
            
            // Catatan: System.out.println otomatis memanggil daftarKelas[i].toString()
        }
        
        /*
         * KESIMPULAN MAHASISWA:
         * Meskipun array-nya bertipe 'Student', saat program dijalankan, 
         * Java cukup pintar untuk melihat wujud ASLI dari objek tersebut.
         * Jika indeks itu berisi AsistenLab, maka toString() milik AsistenLab 
         * yang akan dipanggil (yang ada tulisan Honor-nya).
         */
    }
}

