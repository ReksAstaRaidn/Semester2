package JavaSem2.week4;
import java.util.Scanner;

import JavaSem2.week2.Student;

import java.util.Random;

 public class ClassAnalyzerOOP2 {
     
     public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
         
         System.out.println("=== Sistem Nilai OOP ===");        
         System.out.print("Masukkan jumlah mahasiswa: ");
         int numStudents = console.nextInt();
          
          // Membuat Array of Objects (Baru membuat 'laci' kosongnya)
          Student[] classList = new Student[numStudents];
          
        System.out.println("\n--- Input Data ---");
         for (int i = 0; i < classList.length; i++) {
             System.out.println("Mahasiswa ke-" + (i + 1));
              System.out.print("Nama : ");
             String name = console.next();

            System.out.print("NIM : ");
            int nim = console.nextInt();

            System.out.println("Jumlah kehadiran (dalam pertemuan): ");
            int attendance = console.nextInt();
              
             System.out.print("Nilai: ");
              int score = console.nextInt();
             
              // PENTING: Instansiasi objek dan memasukkannya ke dalam array
              classList[i] = new Student(name, score, nim, attendance);
          }
          
       // Fitur Curving: 1. Mencari nilai maksimal dengan Getter
         int nilaiMax = 100;
         int cariMax= 0;
         for (int i = 0; i < classList.length; i++) {   
              if (classList[i].getScore() > cariMax) {
                 cariMax = classList[i].getScore();
              }
         }
          
          // Fitur Curving: 2. Menghitung selisih dan memodifikasi objek dengan Setter
          int curve =  nilaiMax - cariMax;
          if (curve > 0) {
              System.out.println("\n[Info] Menerapkan curve sebesar +" + curve + " poin.");
              for (int i = 0; i < classList.length; i++) {
                  int currentScore = classList[i].getScore();
                 classList[i].setScore(currentScore + curve);
            }
         } else {
             System.out.println("\n[Info] Tidak ada curve yang diterapkan.");
         }
        
        //lucky draw
         if (classList.length == 0) {
             console.close();
             return; 
         }

         Random rand = new Random();
         int luckyIndex = rand.nextInt(classList.length);
         if (classList[luckyIndex].getScore() < nilaiMax) {
         classList[luckyIndex].setScore(classList[luckyIndex].getScore() + 5);
         }
         System.out.println("\n[Info] Mahasiswa " + classList[luckyIndex].getName() + " mendapat bonus " + (nilaiMax - cariMax) + " poin.");

         
         // Mencetak Rapor Akhir
        System.out.println("\n--- Rapor Akhir Kelas ---");
          for (int i = 0; i < classList.length; i++) {
              // Otomatis memanggil method toString() dari class Student
              System.out.println(classList[i]); 
          }
        console.close();
        }  
  }


