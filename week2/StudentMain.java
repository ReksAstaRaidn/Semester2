package JavaSem2.week2;



// Client Program untuk mendemonstrasikan Class Student
public class StudentMain {
    
    public static void main(String[] args) {
        System.out.println("=== Demonstrasi OOP: Chapter 8 ===");

        // MENCIPTAKAN OBJEK (Instantiation) menggunakan keyword 'new'
        // Memanggil Constructor dari class Student
        Student s1 = new Student("Andi", 80, 12345, 14);
        Student s2 = new Student("Budi", 105, 12346, 10); // Ini akan memicu pesan Error dari Setter

        // MENCETAK OBJEK: Otomatis memanggil method toString()
        System.out.println("\nData Awal:");
        System.out.println(s1); 
        System.out.println(s2);

        // MENGUBAH STATE: Menggunakan Mutator (Setter)
        System.out.println("\nMemperbaiki nilai Budi...");
        s2.setScore(95); 
        System.out.println(s2);

        System.out.println("\n-----------------------------------");
                                 
        // TRANORMASI DARI CHAPTER 7 KE CHAPTER 8
        // Dulu (Ch 7): String[] names dan int[] scores terpisah.
        // Sekarang (Ch 8): Satu array yang menyimpan objek Student.
        Student[] classList = new Student[3];
        
        classList[0] = s1;
        classList[1] = s2;
        classList[2] = new Student("Citra", 55, 12347, 1);

        System.out.println("Rapor Kelas (Menggunakan Array of Objects):");
        
        // Traversal array of objects
        for (int i = 0; i < classList.length; i++) {
            // Kita bisa memanggil behavior (instance method) dari setiap objek
            Student current = classList[i];
            
            // Contoh penggunaan Accessor (Getter)
            if (current.getScore() < 60) {
                System.out.println(current.getName() + " harus remedial.");
            } else {
                // Mencetak objek utuh (memanggil toString)
                System.out.println(current); 
            }
        }
    }
}

