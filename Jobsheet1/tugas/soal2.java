package Jobsheet1.tugas;

import java.util.Scanner;

public class soal2 {
    static Scanner input = new Scanner(System.in);

    static void inputJadwal(String[][] jadwal) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("Jadwal ke-" + (i + 1));
            System.out.print("Masukkan Mata Kuliah: ");
            jadwal[i][0] = input.nextLine();
            System.out.print("Masukkan Ruangan: ");
            jadwal[i][1] = input.nextLine();
            System.out.print("Masukkan Hari: ");
            jadwal[i][2] = input.nextLine();
            System.out.print("Masukkan Waktu: ");
            jadwal[i][3] = input.nextLine();
        }
    }
    
    static void tampilkanJadwal(String[][] jadwal) {
        if (jadwal[0][0] == null) {
            System.out.println("Jadwal masih kosong");
            return;
        }
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("-----------------------");
            System.out.println("Jadwal ke-" + (i + 1));
            System.out.println("Mata Kuliah: " + jadwal[i][0]);
            System.out.println("Ruangan: " + jadwal[i][1]);
            System.out.println("Hari: " + jadwal[i][2]);
            System.out.println("Waktu: " + jadwal[i][3]);
            System.out.println("-----------------------");
        }
    }
    
    static void cariJadwal(String[][] jadwal, int kolom) {
        if (jadwal[0][0] == null) {
            System.out.println("Jadwal masih kosong");
            return;
        }
        System.out.print("Masukkan yang ingin dicari: ");
        String nilai = input.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][kolom].equalsIgnoreCase(nilai)) {
                System.out.println("-----------------------");
                System.out.println("Mata Kuliah: " + jadwal[i][0]);
                System.out.println("Ruangan: " + jadwal[i][1]);
                System.out.println("Hari: " + jadwal[i][2]);
                System.out.println("Waktu: " + jadwal[i][3]);
                System.out.println("-----------------------");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Jadwal tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        System.out.println("Jadwal Kuliah Mahasiswa");
        System.out.print("Masukkan jumlah jadwal kuliah : ");
        int n = input.nextInt();
        input.nextLine();

        String[][] jadwal = new String[n][4];

        while (true) {
            System.out.println("=======================");
            System.out.println("Pilih menu berikut:");
            System.out.println("1. Input Jadwal");
            System.out.println("2. Tampilkan Seluruh Jadwal");
            System.out.println("3. Cari Jadwal Berdasarkan Hari");
            System.out.println("4. cari jadwal berdasarkan mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = input.nextInt();
            input.nextLine();
            
            System.out.println("=======================");
            switch (pilihan) {
                case 1:
                    inputJadwal(jadwal);
                    break;
                case 2:
                    tampilkanJadwal(jadwal);
                    break;
                case 3:
                    cariJadwal(jadwal, 2);
                    break;
                case 4:
                    cariJadwal(jadwal, 0);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
