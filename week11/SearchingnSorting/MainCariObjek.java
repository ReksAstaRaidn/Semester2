package SearchingnSorting;

import java.util.ArrayList;
import java.util.Collections;

public class MainCariObjek {

    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Zebra");
        daftarNama.add("Andi");
        daftarNama.add("Charlie");
        daftarNama.add("Budi");

        System.out.println("Daftar awal: " + daftarNama);

        // 1. Wajib diurutkan (Sort) terlebih dahulu sebelum Binary Search
        Collections.sort(daftarNama); 
        System.out.println("Daftar setelah diurutkan: " + daftarNama);

        // 2. Lakukan Binary Search
        String target = "Charlie";
        int posisi = Collections.binarySearch(daftarNama, target);
        
        if (posisi >= 0) {
            System.out.println(target + " ditemukan pada indeks " + posisi);
        } else {
            System.out.println(target + " tidak ditemukan.");
        }
    }
}
