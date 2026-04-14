public class LatihanJumlahDigit {

    // 1. Metode rekursif untuk menghitung jumlah digit
    public static int jumlahDigit(int n) {
        
        // 4. Base Case: Jika angka hanya tinggal 1 digit (kurang dari 10)
        if (n < 10) {
            return n;
        } 
        
        // 3. Recursive Case: 
        // Menggunakan % 10 untuk mendapat digit terakhir
        // Menggunakan / 10 untuk mengirim sisa angka ke panggilan rekursif
        else {
            return (n % 10) + jumlahDigit(n / 10);
        }
    }

    public static void main(String[] args) {
        // Uji coba sesuai contoh pada instruksi
        int angka = 348;
        int hasil = jumlahDigit(angka);
        
        System.out.println("Jumlah digit dari " + angka + " adalah: " + hasil); 
        // Output yang diharapkan: 15
    }
}