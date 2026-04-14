// File: MainFaktorial.java
public class MainFaktorial {
    
    public static int hitungFaktorial(int n) {
        // Mencegah input negatif yang bisa membuat rekursi tak terbatas
        if (n < 0) {
            throw new IllegalArgumentException("Nilai tidak boleh negatif");
        }
        
        // Base Case: 0! adalah 1
        if (n == 0) {
            return 1;
        } 
        // Recursive Case: n * (n-1)!
        else {
            return n * hitungFaktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int hasil = hitungFaktorial(4);
        System.out.println("Hasil 4! adalah: " + hasil); // Output: 24
        System.out.println("Hasil 5! adalah: " + hitungFaktorial(5)); // Output: 120
    }
}
