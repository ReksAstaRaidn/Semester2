// File: MainBintang.java
public class MainBintang {
    
    // Metode Rekursif untuk mencetak bintang
    public static void tulisBintang(int n) {
        // 1. Base Case: Jika n adalah 0, tidak ada bintang yang perlu dicetak, cukup pindah baris
        if (n == 0) {
            System.out.println(); 
        } 
        // 2. Recursive Case: Cetak 1 bintang, lalu minta metode ini mencetak sisanya (n-1)
        else {
            System.out.print("*");
            tulisBintang(n - 1); // Memanggil dirinya sendiri!
        }
    }

    public static void main(String[] args) {
        System.out.print("Cetak 5 bintang: ");
        tulisBintang(5);
        
        System.out.print("Cetak 2 bintang: ");
        tulisBintang(2);
    }
}
