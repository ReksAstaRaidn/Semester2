package JavaSem2.week3;

// Sekarang Dosen mewarisi PegawaiKampus.
// Karena PegawaiKampus sudah implements Payable, Dosen otomatis juga Payable.
public class Dosen extends PegawaiKampus {
    
    private int tarifPerSks;
    private int jumlahSks;

    public Dosen(String nama, String nip, int tarifPerSks, int jumlahSks) {
        super(nama, nip); // Memanggil konstruktor abstract class PegawaiKampus
        this.tarifPerSks = tarifPerSks;
        this.jumlahSks = jumlahSks;
    }

    // WAJIB DIBUAT: Mengisi method abstrak dari kelas induknya
    public int hitungGajiBersih() {
        return this.tarifPerSks * this.jumlahSks;
    }

    // Overriding toString() untuk menambahkan jabatan
    public String toString() {
        return "Dosen: " + super.toString();
    }
}



