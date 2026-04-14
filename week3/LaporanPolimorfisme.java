package JavaSem2.week3;

public class LaporanPolimorfisme {
    
    public static void main(String[] args) {
        System.out.println("=== LAPORAN KELAS (POLIMORFISME) ===\n");

        Student[] daftarKelas = new Student[4];

        
        daftarKelas[0] = new Student("Andi", 85, 101, 14);
        daftarKelas[1] = new Student("Budi", 70, 102, 10); 
        
        daftarKelas[2] = new AsistenLab(201, "Citra", 90, 15, 600000);
        daftarKelas[3] = new AsistenLab(202, "Diana", 88, 14, 550000);

        for (int i = 0; i < daftarKelas.length; i++) {
            System.out.println(daftarKelas[i]);
        }
    }
}

