package Jobsheet1;

import java.util.Scanner;

public class array {
    static String nilaiHuruf(double nilai) {
        String nilaiHuruf = "";
        if (80 < nilai && nilai <= 100) {
            nilaiHuruf = "A";
        } else if (73 < nilai && nilai <= 80) {
            nilaiHuruf = "B+";
        } else if (65 < nilai && nilai <= 73) {
            nilaiHuruf = "B";
        } else if (60 < nilai && nilai <= 65) {
            nilaiHuruf = "C+";
        } else if (50 < nilai && nilai <= 60) {
            nilaiHuruf = "C";
        } else if (39 < nilai && nilai <= 50) {
            nilaiHuruf = "D";
        } else if (nilai <= 39) {
            nilaiHuruf = "E";
        }

        return nilaiHuruf;
    }

    static double nilaiSetara(String nilaiHuruf) {
        double nilaiSetara = 0;
        switch (nilaiHuruf) {
            case "A":
                nilaiSetara = 4.0;
                break;
            case "B+":
                nilaiSetara = 3.5;
                break;
            case "B":
                nilaiSetara = 3.0;
                break;
            case "C+":
                nilaiSetara = 2.5;
                break;
            case "C":
                nilaiSetara = 2.0;
                break;
            case "D":
                nilaiSetara = 1.0;
                break;
            case "E":
                nilaiSetara = 0.0;
                break;
        }
        return nilaiSetara;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mataKuliah = new String[8];
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] nilaisetara = new double[mataKuliah.length];
        int[] sks = new int[mataKuliah.length];

        System.out.println(
            "===============================" +
            "\nProgram Menghitung IP Semester" +
            "\n==============================="
        );

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("masukkan nama Mata Kuliah ke-" + (i + 1) + ": ");
            mataKuliah[i] = input.nextLine();

            System.out.print("masukkan SKS untuk Mata Kuliah " + mataKuliah[i] + ": ");
            sks[i] = input.nextInt();
            input.nextLine();
        }

        System.out.println(
            "===============================" +
            "\nMasukkan Nilai Angka" +
            "\n==============================="
        );

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("masukkan nilai Angka untuk Mata Kuliah " + mataKuliah[i] + ": ");
            nilaiAngka[i] = input.nextDouble();
            input.nextLine();

            if (nilaiAngka[i] < 0 || nilaiAngka[i] > 100) {
                System.out.println("nilai tidak valid");
                i--;
                continue;
            }
            nilaiHuruf[i] = nilaiHuruf(nilaiAngka[i]);
            nilaisetara[i] = nilaiSetara(nilaiHuruf[i]);
        }

        System.out.println(
            "===============================" +
            "\nHasil Konversi Nilai" +
            "\n==============================="
        );

        System.out.printf(
            "%-38s %-12s %-14s %-10s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai" +
            "\n========================================================================================="
        );

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-14.2f %-14s %-12.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], nilaisetara[i]);
            
        }

        double totalskor = 0;
        double totalSKS = 0;

        for (int i = 0; i < mataKuliah.length; i++) {
            totalskor += nilaisetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalskor/totalSKS;

        System.out.println("=========================================================================================");
        System.out.printf("IP : %.2f", ip);

        input.close();
    }
}
