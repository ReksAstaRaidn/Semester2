package JavaSem2.week3;

public class TestTahap1 {
    public static void main(String[] args) {
        System.out.println("=== UJI COBA INHERITANCE (TAHAP 1) ===");

        // 1. Membuat objek mahasiswa biasa
        Student mhs1 = new Student("Andi", 85, 101, 14);
        System.out.println("Data Mhs Reguler : " + mhs1.toString());

        System.out.println("\n------------------------------------------------\n");

        // 2. Membuat objek Asisten Lab
        AsistenLab aslab1 = new AsistenLab(202, "Budi", 95, 15, 500000);
        
        // Membuktikan pewarisan (AsistenLab bisa memakai method milik Student)
        System.out.println("Data Asisten Lab : " + aslab1.toString());
        System.out.println("Nilai Budi       : " + aslab1.getScore()); // Warisan
        
        // Membuktikan behavior khusus subclass
        aslab1.mengajar("Pemrograman 2"); 

        // aslab1.setScore(105); // Validasi warisan tetap berjalan!
    }
}

