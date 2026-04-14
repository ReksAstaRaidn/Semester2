package SearchingnSorting;

import java.util.Arrays;

public class MainPencarian {

     // Implementasi Binary Search (Iteratif)
    public static int pencarianBiner(int[] data, int target) {
        int min = 0;
        int max = data.length - 1;
        
        while (min <= max) {
            int mid = (min + max) / 2; // Mencari indeks tengah
            
            if (data[mid] == target) {
                return mid; // Ditemukan! Kembalikan indeksnya
            } else if (data[mid] < target) {
                min = mid + 1; // Target ada di sebelah kanan, abaikan separuh kiri
            } else {
                max = mid - 1; // Target ada di sebelah kiri, abaikan separuh kanan
            }
        }
        return -1; // Tidak ditemukan
    }

     public static void main(String[] args) {
        // Ingat: Array HARUS terurut untuk Binary Search!
        int[] angka = {2, 7, 12, 25, 34, 45, 59, 63, 78, 88, 95};
        
        int targetCari = 63;
        int indeks = pencarianBiner(angka, targetCari);
        
        if (indeks != -1) {
            System.out.println("Angka " + targetCari + " ditemukan pada indeks: " + indeks);
        } else {
            System.out.println("Angka " + targetCari + " tidak ditemukan.");
        }

        // Java sudah menyediakan metode bawaan untuk ini:
        int indeksBawaan = Arrays.binarySearch(angka, 34);
        System.out.println("Pencarian menggunakan Arrays.binarySearch untuk 34: indeks " + indeksBawaan);
    }

    
}
