package Jobsheet3.tugas.tugas_1;

import java.util.Scanner;

import Jobsheet3.tugas.tugas_2.DataDosen19;

public class DosenDemo19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dosen19[] dosen = new Dosen19[3];

        for (int i = 0; i < dosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode                        : ");
            String kode = input.nextLine();
            System.out.print("Nama                        : ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin (pria/wanita) : ");
            String jenisKelamin = input.nextLine();
            System.out.print("Usia                        : ");
            int usia = input.nextInt();
            input.nextLine();

            if (jenisKelamin.equalsIgnoreCase("pria")) {
                dosen[i] = new Dosen19(kode, nama, true, usia);
            } else if (jenisKelamin.equalsIgnoreCase("wanita")) {
                dosen[i] = new Dosen19(kode, nama, false, usia);
            } else {
                System.out.println("Jenis kelamin tidak valid.");
            }

            System.out.println("------------------------------------------");
        }

        input.close();

        DataDosen19.dataSemuaDosen(dosen);
        DataDosen19.jumlahDosenPerJenisKelamin(dosen);
        DataDosen19.rerataUsiaDosenPerJenisKelamin(dosen);
        DataDosen19.infoDosenPalingTua(dosen);
        DataDosen19.infoDosenPalingMuda(dosen);
    }
}