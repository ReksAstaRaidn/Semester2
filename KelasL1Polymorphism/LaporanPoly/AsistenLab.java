// Menggunakan keyword 'extends' untuk mewarisi class Student
public class AsistenLab extends Student implements Payable {
    
    // Field khusus yang hanya dimiliki AsistenLab
    private int gaji;

    // Konstruktor AsistenLab
    public AsistenLab(int nim, String name, int score, int attendance, int gaji) {
        // WAJIB BARIS PERTAMA: Memanggil konstruktor superclass (Student)
        super(name, score, nim, attendance); 
        
        // Inisialisasi field milik subclass itu sendiri
        this.gaji = gaji;
    }

    // Accessor & Mutator khusus AsistenLab
    public int getGaji() {
        return this.gaji;
    }

    public void setGaji(int gaji) {
        if (gaji >= 0) {
            this.gaji = gaji;
        }
    }

    // Behavior khusus AsistenLab
    public void mengajar(String materi) {
        // Kita bisa menggunakan getter getName() yang diwarisi dari Student
        System.out.println(this.getName() + " sedang mengajar praktikum " + materi + ".");
    }

    // OVERRIDING: Mendefinisikan ulang method toString() dari kelas induk
    public String toString() {
        // Memanggil toString() asli milik Student dengan 'super.toString()'
        // Lalu menyambungnya dengan string tambahan
        return super.toString() + " | STATUS: Asisten Lab (Honor: Rp" + this.gaji + ")";
    }

    // WAJIB DIBUAT: Memenuhi kontrak dari interface Payable
    public int hitungGajiBersih() {
        return this.getGaji(); // Gaji bersih aslab diambil dari honornya
    }

}



