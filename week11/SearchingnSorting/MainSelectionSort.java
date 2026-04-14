package SearchingnSorting;

import java.util.Arrays;

public class MainSelectionSort {
    
     // Metode untuk menukar (swap) dua elemen dalam array
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

      // Implementasi Selection Sort
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            // Cari indeks elemen terkecil di sisa array
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            // Tukar elemen terkecil tersebut ke posisi depan (indeks i)
            swap(a, i, minIndex);
        }
    }
    
      public static void main(String[] args) {
        int[] nilai = {88, 34, 12, 95, 2, 63, 45, 7, 59, 25, 78};
        
        System.out.println("Sebelum sorting : " + Arrays.toString(nilai));
        
        selectionSort(nilai); // Proses pengurutan
        
        System.out.println("Setelah sorting : " + Arrays.toString(nilai));
    }
}
