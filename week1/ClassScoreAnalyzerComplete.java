    import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ClassScoreAnalyzerComplete {

    public static final int MAX_SCORE = 100;
    public static final int PASSING_GRADE = 60;

    public static void main(String[] args) {
        intro();
        Scanner console = new Scanner(System.in);
        
        int numStudents = getStudentCount(console);

        // [Level 2] Parallel Arrays: Array nama & nilai
        String[] names = new String[numStudents];
        int[] scores = new int[numStudents];

        // [Level 2] Update parameter method input
        inputData(console, names, scores);

        System.out.println("\n--- Analisis Awal ---");
        System.out.println("Data Nilai Mentah: " + Arrays.toString(scores));
        
        double average = calculateAverage(scores);
        int max = findMax(scores);

        System.out.printf("Rata-rata kelas : %.2f\n", average);
        System.out.println("Nilai tertinggi : " + max);

        // [Level 1] Statistik kelulusan
        printPassFailStats(scores);

        giveRandomBonus(names, scores);

        // [Level 3] Curving dan Rapor Akhir
        System.out.println("\n--- Pemrosesan Nilai Akhir ---");
        applyCurve(scores);
        printGrades(names, scores);
    }

    public static void intro() {
        System.out.println("=== Sistem Analisis Nilai Mahasiswa (Kunci Jawaban) ===");
        System.out.println("Mencakup Tugas Level 1, 2, dan 3.");
        System.out.println("-------------------------------------------------------");
    }

    public static int getStudentCount(Scanner console) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        while (!console.hasNextInt()) {
            console.next();
            System.out.print("Input salah. Masukkan angka bulat: ");
        }
        return console.nextInt();
    }

    // [Level 2] Modifikasi: Parameter String[] names
    public static void inputData(Scanner console, String[] names, int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            
            System.out.print("Nama : ");
            names[i] = console.next(); // Chapter 3 Scanner

            System.out.print("Nilai: ");
            int score = console.nextInt();
            
            if (score < 0 || score > MAX_SCORE) {
                System.out.println("Error: Nilai harus 0-" + MAX_SCORE + ". Coba lagi.");
                i--;
            } else {
                data[i] = score;
            }
        }
    }

    // [Level 1] Jawaban: Method Lulus/Gagal
    public static void printPassFailStats(int[] data) {
        int passCount = 0;
        
        for (int score : data) {
            if (score >= PASSING_GRADE) {
                passCount++;
            }
        }
        
        int failCount = data.length - passCount;
        double percentage = 0.0;
        
        if (data.length > 0) {
            percentage = (double) passCount / data.length * 100;
        }

        System.out.println("Jumlah Lulus : " + passCount);
        System.out.println("Jumlah Gagal : " + failCount);
        System.out.printf("Persentase Lulus: %.1f%%\n", percentage);
    }

    public static double calculateAverage(int[] data) {
        if (data.length == 0) return 0.0;
        int sum = 0;
        for (int n : data) {
            sum += n;
        }
        return (double) sum / data.length;
    }

    public static int findMax(int[] data) {
        if (data.length == 0) return 0;
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public static void giveRandomBonus(String[] names, int[] data) {
        if (data.length == 0) return;
        Random rand = new Random();
        int luckyIndex = rand.nextInt(data.length);
        
        System.out.println("\n[Bonus] Lucky Draw:");
        System.out.println("Selamat kepada " + names[luckyIndex] + " mendapat bonus +5 poin!");
        
        data[luckyIndex] = Math.min(data[luckyIndex] + 5, MAX_SCORE);
    }

    // [Level 3] Jawaban: Curving Nilai
    public static void applyCurve(int[] data) {
        int currentMax = findMax(data);
        int curveAmount = MAX_SCORE - currentMax;

        if (curveAmount > 0) {
            System.out.println("Menerapkan curve sebesar +" + curveAmount + " poin.");
            
            for (int i = 0; i < data.length; i++) {
                data[i] = data[i] + curveAmount;
                if (data[i] > MAX_SCORE) {
                    data[i] = MAX_SCORE;
                }
            }
        } else {
            System.out.println("Nilai sudah maksimal. Tidak ada curve.");
        }
    }

    // [Level 3] Jawaban: Konversi ke Huruf Mutu
    public static void printGrades(String[] names, int[] data) {
        System.out.println("\n--- RAPOR AKHIR ---");
        
        for (int i = 0; i < data.length; i++) {
            String grade;
            int s = data[i];

            if (s >= 85) {
                grade = "A";
            } else if (s >= 70) {
                grade = "B";
            } else if (s >= 60) {
                grade = "C";
            } else {
                grade = "D";
            }

            System.out.printf("%-10s | Nilai: %3d | Grade: %s\n", names[i], s, grade);
        }
    }
}
