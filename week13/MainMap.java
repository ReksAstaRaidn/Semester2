package JavaSem2.week13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainMap {
    
    public static void main(String[] args) {
         List<String> kata = Arrays.asList("java", "python", "c++", "ruby");

        // Kita ingin membuat List baru di mana semua kata menjadi HURUF KAPITAL
        List<String> kataKapital = kata.stream()
                                       .map(k -> k.toUpperCase()) // Ubah tiap elemen
                                       .collect(Collectors.toList()); // Kumpulkan kembali jadi List

        System.out.println("Daftar awal: " + kata);
        System.out.println("Daftar kapital: " + kataKapital);

    }

}
