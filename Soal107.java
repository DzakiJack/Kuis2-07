//Dzaki Attaqwa Akdaputra
//264107060115
//SIB 1-D
//Paket Soal Ganjil

import java.util.Scanner;

public class Soal107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, max = 0, min = 100, lulus = 0, tidakLulus = 0;
        double rata;
        
        System.out.print("Jumlah mahasiswa : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Nilai mahasiswa ke-" + i + " : ");
            int nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai harus 0-100. Ulangi input!");
                i--;
                continue;
            }
            total += nilai;
            if (nilai > max) {
                max = nilai;
            }
            if (nilai < min) {
                min = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        rata = (double) total / n;
        System.out.println("Rata-rata : " + rata);
        System.out.println("Nilai tertinggi : " + max);
        System.out.println("Nilai terendah : " + min);
        System.out.println("Lulus (>=60) : " + lulus);
        System.out.println("Tidak lulus  : " + tidakLulus);
    }
}