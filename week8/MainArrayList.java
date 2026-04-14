import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
    // 1. Membuat ArrayList untuk menampung String
        ArrayList<String> names = new ArrayList<String>();
        
        // 2. Menambahkan elemen
        names.add("Andi");
        names.add("Budi");
        names.add("Citra");
        
        System.out.println("Isi list awal: " + names); // Output otomatis dibungkus kurung siku []
        System.out.println("Jumlah elemen: " + names.size());

        // 3. Menyisipkan elemen di indeks ke-1 (Budi dan Citra akan bergeser)
        names.add(1, "Denis");
        System.out.println("Setelah disisipkan: " + names);
        
        // 4. Menghapus elemen (Misal menghapus Budi di indeks ke-2)
        names.remove(2);
        System.out.println("Setelah dihapus: " + names);
        
        // 5. Mengambil dan Mengganti elemen
        String namaPertama = names.get(0);
        System.out.println("Nama pertama: " + namaPertama);
        
        names.set(0, "Anton"); // Mengganti Andi menjadi Anton
        System.out.println("Setelah diubah: " + names);

    }
}
