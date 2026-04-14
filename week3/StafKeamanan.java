package JavaSem2.week3;

// Kelas ini juga mewarisi PegawaiKampus (Abstract Class)
public class StafKeamanan extends PegawaiKampus {
    
    private int gajiPokok;
    private int jamLembur;
    private int tarifLembur;

    public StafKeamanan(String nama, String nip, int gajiPokok, int jamLembur, int tarifLembur) {
        super(nama, nip); // Memanggil konstruktor abstract class
        this.gajiPokok = gajiPokok;
        this.jamLembur = jamLembur;
        this.tarifLembur = tarifLembur;
    }

    // WAJIB DIBUAT: Implementasi hitungGajiBersih khusus untuk Staf Keamanan
    public int hitungGajiBersih() {
        return this.gajiPokok + (this.jamLembur * this.tarifLembur);
    }

    // Overriding toString()
    public String toString() {
        return "Staf Keamanan: " + super.toString();
    }
}
