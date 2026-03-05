package JavaSem2.week4.OOP3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


 public class ClassAnalyzerOOP3 {
     
     public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
         
         System.out.println("=== Sistem Analisis Nilai Mahasiswa OOP ===");     
         System.out.println("Mencakup Tugas Level 1, 2, dan 3.");   
        System.out.println("--------------------------------------------");
         System.out.print("Masukkan jumlah mahasiswa: ");
         int numStudents = console.nextInt();
          
          // Membuat Array of Objects (Baru membuat 'laci' kosongnya)
          Student1[] classList = new Student1[numStudents];          
       
         for (int i = 0; i < classList.length; i++) {
             System.out.println("Data Mahasiswa ke-" + (i + 1));
              System.out.print("Nama : ");
             String name = console.next();
              
             System.out.print("Nilai: ");
              int nilai = console.nextInt();
             
              // PENTING: Instansiasi objek dan memasukkannya ke dalam array
              classList[i] = new Student1(name, nilai);
            }

              System.out.println("\n--- Analisis Awal ---");

            int[] scores = new int[classList.length];
                for (int i = 0; i < classList.length; i++) {
                scores[i] = classList[i].getScore();
            }
            System.out.println("Data Nilai Mentah: " + Arrays.toString(scores));

            String[] nama = new String[classList.length];
                for (int i = 0; i < classList.length; i++) {
                nama[i] = classList[i].getName();
            }
             System.out.println("Data Nilai Mentah: " + Arrays.toString(nama));

             //average nilai 
            double average = 0;             
            for (int i = 0; i < scores.length; i++) {
                average += scores[i];
            }
            average /= scores.length;
            System.out.println("Rata-rata kelas: " + average);
  
       // Fitur Curving: 1. Mencari nilai maksimal dengan Getter
       int nilaiMax = 100;
         int maxScore = 0;
         for (int i = 0; i < classList.length; i++) {   
              if (classList[i].getScore() > maxScore) {
                 maxScore = classList[i].getScore();
              }
         }
          
         System.out.println("Nilai tertinggi: " + maxScore);

         int passCount = 0;
         for (int i = 0; i < scores.length; i++) {
             if (scores[i] >= 60) {
                 passCount++;
             }
            }
    
            int failCount = scores.length - passCount;
            double passPercentage = (double) passCount / scores.length * 100;

            System.out.println("Jumlah Lulus: " + passCount);
            System.out.println("Jumlah Gagal: " + failCount);
            System.out.println("Persentase Lulus: " + passPercentage);

            System.out.println("[Bonus] Lucky Draw: ");
                if (classList.length == 0) {
                console.close();
                return;
            }
            Random rand = new Random();
            int luckyIndex = rand.nextInt(classList.length);
            if (classList[luckyIndex].getScore() < maxScore) {
                classList[luckyIndex].setScore(classList[luckyIndex].getScore() + 5);
            }
            System.out.println("Selamat kepada " + classList[luckyIndex].getName() + " mendapat bonus +5 poin!");


          // Fitur Curving: 2. Menghitung selisih dan memodifikasi objek dengan Setter
          int curve = nilaiMax - maxScore;
          System.out.println("---Pemrosesan Nilai Akhir---");
          if (curve > 0) {
              System.out.println("Menerapkan curve sebesar +" + curve + " poin.");
              for (int i = 0; i < classList.length; i++) {
                  int currentScore = classList[i].getScore();
                 classList[i].setScore(currentScore + curve);
            }
         } else {
             System.out.println("\n[Info] Tidak ada curve yang diterapkan.");
         }
         
         // Mencetak Rapor Akhir
        System.out.println("\n--- Rapor Akhir ---");
          for (int i = 0; i < classList.length; i++) {
              // Otomatis memanggil method toString() dari class Student
              System.out.println(classList[i]); 
          }
        console.close();
        }  
  }