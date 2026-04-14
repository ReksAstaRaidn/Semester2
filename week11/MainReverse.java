// File: MainReverse.java
public class MainReverse {
    
    public static String balikTeks(String s) {
        // Base Case: Jika teks kosong, tidak ada yang perlu dibalik
        if (s.isEmpty()) {
            return s;
        } 
        // Recursive Case: Ambil huruf pertama, lalu letakkan di paling belakang
        else {
            char hurufPertama = s.charAt(0);
            String teksSisa = s.substring(1); // Mengambil sisa teks setelah huruf pertama
            return balikTeks(teksSisa) + hurufPertama;
        }
    }

    public static void main(String[] args) {
        String kata = "REKURSI";
        System.out.println("Kata asli   : " + kata);
        System.out.println("Kata dibalik: " + balikTeks(kata));
    }
}
