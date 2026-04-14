package CaseMethod1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataPeminjaman data = new DataPeminjaman();
        
        int pilihan;

        do {
            System.out.print(
                "\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===" +
                "\n1. Tampilkan Mahasiswa" +
                "\n2. Tampilkan Buku" +
                "\n3. Tampilkan Peminjaman" +
                "\n4. Urutkan Berdasarkan NIM (ASC)" +
                "\n5. Cari Berdasarkan NIM" +
                "\n0. Keluar" +
                "\nPilih: "
            );
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    data.tampilMahasiswa();
                    break;
                case 2:
                    System.out.println("\nDaftar Buku:");
                    data.tampilBuku();
                    break;
                case 3:
                    System.out.println("\nData Peminjaman:");
                    data.tampilPeminjaman(data.listPeminjaman);
                    break;
                case 4:
                    System.out.println("\nSetelah diurutkan (NIM Ascending):");
                    data.sortingNIM();
                    data.tampilPeminjaman(data.listPeminjaman);
                    break;
                case 5:
                    System.out.print("\nMasukkan NIM: ");
                    String nim = input.nextLine();
                    Peminjaman[] hasil = data.searchingNIM(nim);
                    data.tampilPeminjaman(hasil);
                    break;
                case 0:
                    System.out.println("\nTerima kasih Kawan!");
                    break;
                default:
                    System.out.println("\nInput tidak ada kawan!!");
                    break;
            }

        } while (pilihan != 0);
        input.close();
    }
}
