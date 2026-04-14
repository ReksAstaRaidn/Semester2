package JavaSem2.week9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSet {
    public static void main(String[] args) {
        ArrayList<String> daftarPendaftar = new ArrayList<>();
        daftarPendaftar.add("Budi");
        daftarPendaftar.add("Andi");
        daftarPendaftar.add("Budi"); // Duplikat
        daftarPendaftar.add("Citra");
        daftarPendaftar.add("Andi"); // Duplikat

        System.out.println("Daftar Awal (List): " + daftarPendaftar);

        // 1. Memasukkan ke HashSet (Duplikat hilang, urutan acak)
        Set<String> setUnik = new HashSet<>(daftarPendaftar);
        System.out.println("Daftar Unik (HashSet): " + setUnik);

        // 2. Memasukkan ke TreeSet (Duplikat hilang, urutan alfabetis)
        Set<String> setTerurut = new TreeSet<>(daftarPendaftar);
        System.out.println("Daftar Terurut (TreeSet): " + setTerurut);
    }
}
