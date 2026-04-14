package JavaSem2.week5;

// File: MainPoint.java
public class MainPoint {
    public static void main(String[] args) {
        // Membuat objek Point p1 menggunakan constructor berparameter
        Point p1 = new Point(3, 8);
        
        System.out.println("Koordinat p1 awal:");
        System.out.println("X = " + p1.getX());
        System.out.println("Y = " + p1.getY());

        // Menggeser p1 sejauh 2 sumbu x dan -4 sumbu y
        p1.translate(2, -4);
        
        System.out.println("\nKoordinat p1 setelah digeser:");
        System.out.println("X = " + p1.getX());
        System.out.println("Y = " + p1.getY());
        // Menampilkan informasi titik menggunakan method print()
        System.out.println(p1);
    }
}

