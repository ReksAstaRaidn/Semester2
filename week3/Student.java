package JavaSem2.week3;

// Chapter 8: Classes and Objects (Blueprint)
public class Student {
    
    // 1. ENCAPSULATION: Private fields (State)
    // Melindungi data agar tidak bisa diubah langsung dari luar class
    private String name;
    private int score;
    private int nim; 
    private int attendance;


    // 2. CONSTRUCTOR: Method khusus untuk inisialisasi objek baru
    // Namanya sama persis dengan nama class, tanpa return type
    public Student(String name, int score, int nim, int attendance) {
        // 3. KEYWORD 'this': Merujuk pada field milik objek saat ini (mengatasi shadowing)
        this.name = name;
        this.nim = nim;
        this.attendance = attendance;
        
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

    public int getNim() {
        return this.nim;
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
            return "A";
        } else if (this.score >= 70) {
            return "B";
        } else if (this.score >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
        public boolean isEligible(){
                if (this.attendance >= 12) {
                    return true;
                } else {
                    return false;
                } 
        }
    // 7. toString() METHOD: Mengembalikan representasi String dari objek
    // Memudahkan saat objek dicetak dengan System.out.println()
    public String toString() {
        String status = "";
        if (!isEligible()) {
            status = "  [BLOKIR]";
        }
        return "Mahasiswa: " + this.name + status +" | Attendance: " + this.attendance + " | NIM: " + this.nim + " | Nilai: " + this.score + " (" + getLetterGrades() + ")";
    }
    
}   