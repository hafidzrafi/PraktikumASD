package Jobsheet3;

import java.util.Scanner;

public class MatakuliahDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jumlah matakuliah : ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading the integer
        Matakuliah19[] arrayOfMatakuliah19 = new Matakuliah19[n];

        for (int i = 0; i < arrayOfMatakuliah19.length; i++) {
            System.out.println("Masukkan data matakuliah ke-" + (i + 1));
            arrayOfMatakuliah19[i] = new Matakuliah19();
            arrayOfMatakuliah19[i].tambahData(sc);
            System.out.println("-------------------------------------");
        }

        for (int i = 0; i < arrayOfMatakuliah19.length; i++) {
            System.out.println("Data matakuliah ke-" + (i + 1));
            arrayOfMatakuliah19[i].cetakInfo();
            System.out.println("-------------------------------------");
        }
        sc.close();
    }
}
