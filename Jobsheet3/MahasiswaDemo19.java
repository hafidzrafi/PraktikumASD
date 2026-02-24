package Jobsheet3;

import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa19[] arrayOfMahasiswa19 = new Mahasiswa19[3];
        String dummy;

        for (int i = 0; i < arrayOfMahasiswa19.length; i++) {
            arrayOfMahasiswa19[i] = new Mahasiswa19();

            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa19[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa19[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa19[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa19[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------------");
        }

        for (int i = 0; i < arrayOfMahasiswa19.length; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa19[i].cetakInfo();
            System.out.println("-------------------------------------");
        }
        sc.close();
    }
}
