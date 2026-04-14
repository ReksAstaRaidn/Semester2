package JavaSem2.week9;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainMap {
    public static void main(String[] args) {
        // Deklarasi Map: <TipeKey, TipeValue>
        Map<String, Double> nilaiMahasiswa = new HashMap<>();

        // Menambahkan data menggunakan metode .put()
        nilaiMahasiswa.put("NIM001", 85.5);
        nilaiMahasiswa.put("NIM002", 90.0);
        nilaiMahasiswa.put("NIM003", 78.0);
        
        // Jika kita menggunakan .put() dengan Key yang sudah ada, Value akan TERTIMPA (Update)
        nilaiMahasiswa.put("NIM001", 95.0); 

        System.out.println("Data Map: " + nilaiMahasiswa);

        // Mengambil data berdasarkan Key menggunakan .get()
        System.out.println("Nilai NIM002: " + nilaiMahasiswa.get("NIM002"));

        // Menggunakan TreeMap agar terurut berdasarkan NIM
        Map<String, Double> nilaiTerurut = new TreeMap<>(nilaiMahasiswa);
        System.out.println("Data Terurut (TreeMap): " + nilaiTerurut);


        System.out.println("\n=== Cetak Rapor Mahasiswa ===");
        // .keySet() mengembalikan Set yang berisi semua kunci yang ada di dalam Map
        for (String nim : nilaiTerurut.keySet()) {
            double nilai = nilaiTerurut.get(nim);
            System.out.println("Mahasiswa " + nim + " mendapatkan nilai " + nilai);
        }
    }
}
