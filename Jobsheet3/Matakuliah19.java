package Jobsheet3;

import java.util.Scanner;

public class Matakuliah19 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah19() {}

    public Matakuliah19(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(Scanner sc) {
        String dummy;
        System.out.print("Kode      : ");
        kode = sc.nextLine();
        System.out.print("Nama      : ");
        nama = sc.nextLine();
        System.out.print("SKS       : ");
        dummy = sc.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam: ");
        dummy = sc.nextLine();
        jumlahJam = Integer.parseInt(dummy);
    }

    void cetakInfo() {
        System.out.println("Kode        : " + this.kode);
        System.out.println("Nama        : " + this.nama);
        System.out.println("SKS         : " + this.sks);
        System.out.println("Jumlah Jam  : " + this.jumlahJam);
    }
}
