package Jobsheet9.tugas;

import java.util.Scanner;

public class SuratDemo {
    public static void main(String[] args) {
        StackSurat19 stack = new StackSurat19(5);
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.print(
                "\nMenu:" +
                "\n1. Terima Surat Izin" +
                "\n2. Proses Surat Izin" +
                "\n3. Lihat Surat Izin Terakhir" +
                "\n4. Cari Surat" +
                "\n0. Keluar" +
                "\nPilih: "
            );
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\nMasukkan Surat");
                    System.out.print("ID Surat: ");
                    String idSurat = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin: ");
                    char jenisIzin = input.nextLine().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = input.nextInt();

                    Surat19 surat = new Surat19(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.push(surat);

                    System.out.printf("Surat dari %s berhasil diterima\n", surat.namaMahasiswa);
                    break;
                case 2:
                    Surat19 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("\nMemproses Surat");
                        System.out.printf("Surat dari %s dengan id %s berhasil di proses\n", diproses.namaMahasiswa, diproses.idSurat);
                    }
                    break;
                case 3:
                    Surat19 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir:");
                        lihat.print();
                    }
                    break;
                case 4:
                    System.out.print("\nMasukkan Nama yang dicari: ");
                    nama = input.nextLine();
                    System.out.println("\nHasil Pencarian:");
                    stack.searching(nama);
                    break;
                case 0:
                    System.out.println("\nTerima kasih kawan!");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid.");
            }
        } while (pilih != 0);
        input.close();
    }
}
