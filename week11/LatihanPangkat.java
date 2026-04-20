import java.util.Collection;

public class LatihanPangkat {

    // Metode rekursif untuk menghitung pangkat
    public static int hitungPangkat(int basis, int eksponen) {
        // Base Case: Angka berapapun jika dipangkatkan 0 hasilnya adalah 1
        if (eksponen == 0) {
            return 1;
        } 
        // Recursive Case: Kembalikan nilai basis * hitungPangkat(basis, eksponen - 1)
        else {
            return basis * hitungPangkat(basis, eksponen - 1);
        }
    }

    public static void main(String[] args) {
        // Uji program untuk menghitung 2 pangkat 3 (hasilnya harus 8)
        int hasil1 = hitungPangkat(2, 3);
        System.out.println("Hasil 2 pangkat 3 adalah: " + hasil1); 

        // Uji program untuk menghitung 3 pangkat 4 (hasilnya harus 81)
        int hasil2 = hitungPangkat(3, 4);
        System.out.println("Hasil 3 pangkat 4 adalah: " + hasil2); 
    }
}