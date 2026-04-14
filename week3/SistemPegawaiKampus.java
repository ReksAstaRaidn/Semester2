package JavaSem2.week3;

public class SistemPegawaiKampus {
    
    public static void main(String[] args) {
        System.out.println("=== SISTEM DATA PEGAWAI KAMPUS ===\n");

        // PEMBUKTIAN 1: Abstract Class tidak bisa diinstansiasi!
        // Jika baris di bawah ini komentar (//) nya dihilangkan, program akan ERROR.
        // PegawaiKampus pegawaiHantu = new PegawaiKampus("Hantu", "000"); 

        // PEMBUKTIAN 2: Tapi Abstract Class BISA dijadikan tipe data Array (Polimorfisme)
        PegawaiKampus[] daftarPegawai = new PegawaiKampus[3];

        // Mengisi array dengan subclass (Concrete Classes)
        daftarPegawai[0] = new Dosen("Dr. Budi", "NIP-101", 200000, 12);     // Dosen (200rb per SKS)
        daftarPegawai[1] = new Dosen("Prof. Siti", "NIP-102", 250000, 8);    // Dosen (250rb per SKS)
        
        // Staf Keamanan (Gaji pokok 2jt, lembur 10 jam x 50rb)
        daftarPegawai[2] = new StafKeamanan("Pak Joko", "NIP-901", 2000000, 10, 50000); 

        int totalGajiKampus = 0;

        // Looping untuk memproses semua pegawai
        for (int i = 0; i < daftarPegawai.length; i++) {
            
            PegawaiKampus p = daftarPegawai[i];
            
            // Polimorfisme bekerja di sini: 
            // Java akan memanggil hitungGajiBersih() milik Dosen atau StafKeamanan 
            // sesuai wujud asli objeknya, BUKAN memanggil method kosong milik PegawaiKampus.
            int gaji = p.hitungGajiBersih();
            totalGajiKampus += gaji;

            // Mencetak data
            System.out.println(p.toString() + " | Gaji: Rp" + gaji);
        }

        System.out.println("\n------------------------------------------------");
        System.out.println("Total Gaji Seluruh Pegawai: Rp" + totalGajiKampus);
    }
}

