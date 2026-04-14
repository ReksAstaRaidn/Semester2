public class DataPenghuni {
    public static void main(String[] args) {
        System.out.println("Program Data Penghuni Kost\n");

        Penghuni[] daftarPenghuni = new Penghuni[6]; 


        daftarPenghuni[0] = new Penghuni("Andi", 01, 62123, "Mahasiswa");
        daftarPenghuni[1] = new Penghuni("Budi", 02, 62456, "Mahasiswa");
        daftarPenghuni[2] = new Penghuni("Citra", 03, 62789, "Mahasiswa");
        daftarPenghuni[3] = new Penghuni("Dewi", 04, 62101, "Mahasiswa");

        
        daftarPenghuni[4] = new PenghuniKaryawan("Eka", 05, 62345, "Karyawan", "Shopee");
        daftarPenghuni[5] = new PenghuniKaryawan("Fina", 06, 62678, "Karyawan", "Tokopedia");

        System.out.println("Mahasiswa");
        for (int i = 0; i <= 3; i++) {
            System.out.println(daftarPenghuni[i]);
        }

        System.out.println();
        System.out.println("Karyawan");

        for (int i = 4; i < daftarPenghuni.length; i++) {
            System.out.println(daftarPenghuni[i]);
        }
    }
}
