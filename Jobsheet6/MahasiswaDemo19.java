package Jobsheet6;
import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa");
        int jumMhs = input.nextInt();
        input.nextLine();

        MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19();

        for (int i = 0; i < jumMhs; i++) {
            System.out.print("NIM Mahasiswa " + (i+1) + " : ");
            String nim = input.nextLine();
            System.out.print("Nama Mahasiswa " + (i+1) + " : ");
            String nama = input.nextLine();
            System.out.print("Kelas Mahasiswa " + (i+1) + " : ");
            String kelas = input.nextLine();
            System.out.print("IPK Mahasiswa " + (i+1) + " : ");
            double ipk = input.nextDouble();
            input.nextLine();
            System.out.println("-------------------------------------------");

            list.tambah(new Mahasiswa19(nim, nama, kelas, ipk));
        }

        // System.out.println("Data mahasiswa sebelum sorting: ");
        // list.tampil();

        // System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC)");
        // list.selectionSort();
        // list.tampil();
        
        // System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT (ASC)");
        // list.insertionSort();
        // list.tampil();
        
        list.tampil();
        // melakukan pencarian data sequential
        // System.out.println("------------------------------------------------------------------");
        // System.out.println("Pencarian data");
        // System.out.println("------------------------------------------------------------------");
        // System.out.println("Masukkan IPK yang dicari : ");
        // System.out.print("IPK : ");
        // double cari = input.nextDouble();
        // input.nextLine();

        // System.out.println("Menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int) posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);
        
        // melakukan pencarian data Binary
        System.out.println("------------------------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        double cari = input.nextDouble();
        input.nextLine();
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("Menggunakan binary searching");
        System.out.println("------------------------------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        
        input.close();
    }
}
