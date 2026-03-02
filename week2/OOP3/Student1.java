package OOP3;

// Chapter 8: Classes and Objects (Blueprint)
public class Student1 {
    
    // 1. ENCAPSULATION: Private fields (State)
    // Melindungi data agar tidak bisa diubah langsung dari luar class
    private String name;
    private int score;
    


    // 2. CONSTRUCTOR: Method khusus untuk inisialisasi objek baru
    // Namanya sama persis dengan nama class, tanpa return type
    public Student1(String name, int score) {
        // 3. KEYWORD 'this': Merujuk pada field milik objek saat ini (mengatasi shadowing)
        this.name = name;
        
       
        
        // Praktik baik: gunakan setter di dalam konstruktor agar validasi tetap berjalan
        this.setScore(score); 
        
    }

    // 4. ACCESSORS (Getters): Method untuk membaca data private
    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

   

    
   
    

    // 5. MUTATORS (Setters): Method untuk mengubah data private secara aman
    public void setScore(int score) {
        // Keuntungan Encapsulation: kita bisa menaruh logika validasi di sini
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("Error: Nilai untuk " + this.name + " tidak valid. Diset ke 0.");
            this.score = 0;
        }
    }

    // 6. BEHAVIOR (Instance Method): Fungsi yang dimiliki objek
    // Perhatikan: TIDAK ADA keyword 'static' di sini.
    public String getLetterGrades() {
        if (this.score >= 85) {
            return "Grade: A";
        } else if (this.score >= 70) {
            return "Grade: B";
        } else if (this.score >= 60) {
            return "Grade: C";
        } else {
            return "Grade: D";
        }
    }
        
        
            public int findMax(int[] scores) {
                if (scores.length == 0) return 0;
                int max = scores[0];
                for (int i = 1; i < scores.length; i++) {
                    if (scores[i] > max) {
                        max = scores[i];
                    }
                }
                return max;
    }
    // 7. toString() METHOD: Mengembalikan representasi String dari objek
    // Memudahkan saat objek dicetak dengan System.out.println()
    public String toString() {
        
        return  this.name + " | Nilai: " + this.score + " (" + getLetterGrades() + ")";
    }
    
}   