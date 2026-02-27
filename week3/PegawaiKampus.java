package JavaSem2.week3;

// Menggunakan keyword 'abstract'. Kelas ini TIDAK BISA di-new!
// Kelas ini juga menyetujui kontrak Payable dari Tahap 3.
public abstract class PegawaiKampus implements Payable {
    
    private String nama;
    private String nip;

    // Abstract class BISA punya konstruktor untuk dipanggil oleh subclass (via super)
    public PegawaiKampus(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public String getNama() {
        return this.nama;
    }

    // METHOD ABSTRAK: Tidak ada kurung kurawal {}, langsung diakhiri titik koma.
    // Memaksa semua subclass untuk memikirkan sendiri cara hitung gajinya.
    public abstract int hitungGajiBersih();

    public String toString() {
        return "[" + this.nip + "] " + this.nama;
    }
}
