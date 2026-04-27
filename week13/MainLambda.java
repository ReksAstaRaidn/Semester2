package JavaSem2.week13;

import java.util.Arrays;
import java.util.List;

public class MainLambda {
    
    public static void main(String[] args) {
         // Cara cepat membuat List berisi data
        List<String> mahasiswa = Arrays.asList("Andi", "Budi", "Citra", "Denis");

        System.out.println("=== Cara Tradisional (Imperatif) ===");
        for (int i = 0; i < mahasiswa.size(); i++) {
            System.out.println(mahasiswa.get(i));
        }

        System.out.println("\n=== Cara Fungsional (Deklaratif dengan Lambda) ===");
        // Membaca: "Untuk setiap elemen 'm' di dalam list, lakukan System.out.println(m)"
        mahasiswa.forEach(m -> System.out.println(m));
    }

}
