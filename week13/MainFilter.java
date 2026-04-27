package JavaSem2.week13;

import java.util.Arrays;
import java.util.List;

public class MainFilter {
    public static void main(String[] args) {
        List<Integer> angka = Arrays.asList(5, 12, 8, 20, 7, 14, 3);

        System.out.println("=== Angka Genap > 10 ===");
        
        // Pipa (Pipeline) Stream:
        angka.stream()
             .filter(n -> n % 2 == 0) // Saring: hanya biarkan yang genap lewat
             .filter(n -> n > 10)     // Saring lagi: hanya biarkan yang > 10 lewat
             .forEach(n -> System.out.println(n)); // Cetak hasil akhirnya
    }
}
