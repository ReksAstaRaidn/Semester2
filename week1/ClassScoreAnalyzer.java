import java.util.Scanner; // Chapter 3: Interactive Programming
import java.util.Arrays;   // Chapter 7: Arrays
import java.util.Random;   // Chapter 5: Program Logic

public class ClassScoreAnalyzer {

    // Chapter 2: Constants
    public static final int MAX_SCORE = 100;
    public static final int BONUS_THRESHOLD = 85;

    // Chapter 1: Main method
    public static void main(String[] args) {
        intro();

        Scanner console = new Scanner(System.in);
        
        // Chapter 2 & 3: Variables, Parameters
        int numStudents = getStudentCount(console);

        // Chapter 7: Array Declaration
        int[] scores = new int[numStudents];

        // Chapter 7: Array Traversal (Input)
        inputScores(console, scores);

        System.out.println("\n--- Hasil Analisis ---");
        
        // Chapter 7: Printing Arrays
        System.out.println("Data Mentah: " + Arrays.toString(scores));

        // Chapter 4: Conditional & Cumulative Algorithms
        double average = calculateAverage(scores);
        int max = findMax(scores);

        // Chapter 3: System.out.printf
        System.out.printf("Rata-rata kelas: %.2f\n", average);
        System.out.println("Nilai tertinggi: " + max);

        giveRandomBonus(scores); // Chapter 5 & 7 mixed
    }

    // Chapter 1: Static method
    public static void intro() {
        System.out.println("Selamat datang di Program Analisis Nilai (Review Sem 1)");
        System.out.println("Program ini mencakup materi Ch 1 - Ch 7.");
        System.out.println("-----------------------------------------------------");
    }

    // Chapter 3, 4, 5: Return values, Scanner, While loop
    public static int getStudentCount(Scanner console) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        
        // Chapter 5: Sentinel Loop / Input Validation
        while (!console.hasNextInt()) {
            console.next(); // discard bad input
            System.out.print("Input salah. Masukkan angka bulat: ");
        }
        return console.nextInt();
    }

    // Chapter 7: Arrays as Parameters
    public static void inputScores(Scanner console, int[] data) {
        // Chapter 2: For loop
        for (int i = 0; i < data.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            int score = console.nextInt();

            // Chapter 4: Nested If/Else (Validation)
            if (score < 0 || score > MAX_SCORE) {
                System.out.println("Error: Nilai harus 0-" + MAX_SCORE + ". Coba lagi.");
                i--; // Mundurkan counter
            } else {
                data[i] = score;
            }
        }
    }

    // Chapter 4 & 7: Cumulative sum algorithm
    public static double calculateAverage(int[] data) {
        if (data.length == 0) return 0.0;
        
        int sum = 0;
        for (int n : data) { // Enhanced for loop
            sum += n;
        }
        return (double) sum / data.length;
    }

    // Chapter 7: Array algorithm (Find Max)
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

    // Chapter 5: Random class
    public static void giveRandomBonus(int[] data) {
        Random rand = new Random();
        int luckyIndex = rand.nextInt(data.length);
        
        System.out.println("\nLucky Draw (Chapter 5):");
        System.out.println("Mahasiswa indeks ke-" + luckyIndex + " mendapat bonus +5 poin!");
        
        data[luckyIndex] = Math.min(data[luckyIndex] + 5, MAX_SCORE);
        System.out.println("Nilai baru: " + data[luckyIndex]);
    }
}