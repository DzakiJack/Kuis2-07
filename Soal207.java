//Dzaki Attaqwa Akdaputra
//264107060115
//SIB 1-D
//Paket Soal Ganjil

import java.util.Scanner;

public class Soal207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSeluruh = 0, terbaik = 0, hariSepi = 0, totalPendapat = 0;
        double rata;

        System.out.print("Jumlah kantin : ");
        int n = sc.nextInt();
        System.out.print("Jumlah hari : ");
        int m = sc.nextInt();

        if (n <= 0 || m <= 0) {
            System.out.println("Jumlah kantin dan hari harus > 0.");

            sc.close();
            return;
            
        } else {
            for (int i = 1; i <= n; i++) {
                int total = 0;
                System.out.println("Kantin ke-" + i + ":");
                for (int j = 1; j <= m; j++) {
                    System.out.print(" Pendapatan hari ke-" + j + " : ");
                    int pendapatan = sc.nextInt();
                    if (pendapatan < 0) {
                        System.out.println(" Tidak boleh negatif. Ulangi input!");
                        j--;
                        continue;
                    }
                    total += pendapatan;

                    if (pendapatan < 100) {
                        hariSepi++;
                    }
                }

                if (total > totalPendapat) {
                    terbaik = i;
                    totalPendapat = total;
                }
                totalSeluruh += total;
                rata = (double) total / m;
                System.out.println("Kantin " + i + " - total: " + total + ", rata-rata per hari: " + rata);
            }

            System.out.println("================================================");
            System.out.println("Total seluruh kantin: " + totalSeluruh);
            System.out.println("Kantin terbaik      : " + terbaik);
            System.out.println("Hari sepi (<100)    : " + hariSepi);

        }
        sc.close();
    }
}