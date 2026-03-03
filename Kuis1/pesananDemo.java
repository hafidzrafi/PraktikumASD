package Kuis1;

import java.util.Scanner;

public class pesananDemo {
    static Scanner input = new Scanner(System.in);
    static pesanan[] daftarPesanan = new pesanan[100];
    static int jumlahPesanan = 0;

    static void inputPesanan() {
        System.out.println("\n============ Input Pesanan Baru ============");

        System.out.println("Masukkan data pesanan ke-" + (jumlahPesanan+1));
        System.out.print("ID Pesanan     : ");
        String id = input.nextLine();
        System.out.print("Nama Pesanan   : ");
        String nama = input.nextLine();
        System.out.print("Harga Pesanan  : ");
        int harga = input.nextInt();
        input.nextLine();
        System.out.print("Jumlah Pesanan : ");
        int jumlah = input.nextInt();
        input.nextLine();
        System.out.println("-----------------------------------------------");
        
        daftarPesanan[jumlahPesanan] = new pesanan(id, nama, harga, jumlah);
        jumlahPesanan++;
    }

    static void tampilkanPesanan() {
        System.out.println("\n============ Daftar Pesanan ============");

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i+1));
            daftarPesanan[i].tampilInformasi();
            System.out.println("----------------------------------------");
        }
    }

    static void hitungTotalHargaDanKembalian() {
        System.out.println("\n============ Hitung Total Harga dan Kembalian ============");

        System.out.print("Masukkan jumlah uang yang dibayar: ");
        int uangBayar = input.nextInt();
        input.nextLine();

        int totalHarga = pesanan.totalHargaKeseluruhan(daftarPesanan);
        int kembalian = pesanan.kembalian(daftarPesanan, uangBayar);

        System.out.println("Total Harga : " + totalHarga);
        System.out.println("Kembalian   : " + kembalian);
    }
    
    public static void main(String[] args) {

        System.out.println("===== Cafe =====");

        for (int i = 0; i < 100; i++) {
            daftarPesanan[i] = new pesanan();
        }

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input Pesanan");
            System.out.println("2. Tampilkan Pesanan");
            System.out.println("3. Hitung Total Harga dan Kembalian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    inputPesanan();
                    break;
                case 2:
                    tampilkanPesanan();
                    break;
                case 3:
                    hitungTotalHargaDanKembalian();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    return;
            }
        }
    }
}
