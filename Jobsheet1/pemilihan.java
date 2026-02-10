package Jobsheet1;

import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] nilai = new double[4];
        String[] namaNilai = {"Tugas", "Kuis", "UTS", "UAS"};

        System.out.println(
        "Program Menghitung Nilai Akhir" +
        "\n=============================="
        );

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan Nilai " + namaNilai[i] + " : ");
            nilai[i] = input.nextDouble();
            
            if (nilai[i] < 0 || nilai[i] > 100) {
                System.out.println("nilai tidak valid");
                i--;
            }
        }
        System.out.println("==============================");

        double nilaiAkhir = (nilai[0]*0.2 + nilai[1]*0.2 + nilai[2]*0.3 + nilai[3]*0.3);
        String nilaiHuruf = "";

        if (80 < nilaiAkhir && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (73 < nilaiAkhir && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (65 < nilaiAkhir && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (60 < nilaiAkhir && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (50 < nilaiAkhir && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (39 < nilaiAkhir && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
        }

        System.out.println("==============================");
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("==============================");

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }

        input.close();
    }
}
