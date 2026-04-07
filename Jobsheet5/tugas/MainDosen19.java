package Jobsheet5.tugas;
import java.util.Scanner;

public class MainDosen19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen19 data = new DataDosen19();
        int pilihan;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data");
            System.out.println("3. Sorting ASC (Bubble Sort: Muda ke Tua)");
            System.out.println("4. Sorting DSC (Selection Sort: Tua ke Muda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode          : "); String kode = sc.nextLine();
                    System.out.print("Nama          : "); String nama = sc.nextLine();
                    System.out.print("Laki-laki? (true/false): "); boolean jk = sc.nextBoolean();
                    System.out.print("Usia          : "); int usia = sc.nextInt();
                    
                    Dosen19 d = new Dosen19(kode, nama, jk, usia);
                    data.tambah(d);
                    break;

                case 2:
                    System.out.println("\n--- Daftar Dosen ---");
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC();
                    System.out.println("Data berhasil diurutkan (Muda ke Tua).");
                    break;

                case 4:
                    data.sortingDSC();
                    System.out.println("Data berhasil diurutkan (Tua ke Muda).");
                    break;
                
                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
        sc.close();
    }
}