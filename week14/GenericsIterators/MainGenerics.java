package GenericsIterators;
public class MainGenerics {
    
    public static void main(String[] args) {
        // 1. Menguji Generics dengan String
        MyLinkedList<String> listNama = new MyLinkedList<>();
        listNama.add("Alice");
        listNama.add("Bob");
        listNama.add("Charlie");

         System.out.println("=== Iterasi For-Each Loop ===");
        // Bekerja secara otomatis karena kita mengimplementasikan Iterable!
        for (String nama : listNama) {
            System.out.println(nama);
        }
        listNama.remove("Bob");

         System.out.println("\n=== Iterasi For-Each Loop Setelah Penghapusan ===");
        for (String nama : listNama) {
            System.out.println(nama);
        }

        // 2. Menguji Generics dengan Wrapper Class (Integer)
        MyLinkedList<Integer> listAngka = new MyLinkedList<>();
        listAngka.add(100);
        listAngka.add(200);

        System.out.println("\n=== Iterasi Manual Menggunakan Iterator ===");
        java.util.Iterator<Integer> penjelajah = listAngka.iterator();
        
        while (penjelajah.hasNext()) {
            int angka = penjelajah.next();
            System.out.println("Angka: " + angka);
        }

        listAngka.remove(200);
            System.out.println("\n=== Iterasi Manual Setelah Penghapusan ===");
        penjelajah = listAngka.iterator(); // Dapatkan iterator baru setelah modifikasi
        while (penjelajah.hasNext()) {
            int angka = penjelajah.next();
            System.out.println("Angka: " + angka);
        }
    }
}


