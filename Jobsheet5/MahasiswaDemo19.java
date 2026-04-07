package Jobsheet5;
import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19();
        Mahasiswa19[] listMhs = new Mahasiswa19[5];

        for (int i = 0; i < listMhs.length; i++) {
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

            listMhs[i] = new Mahasiswa19(nim, nama, kelas, ipk);
        }

        for (int i = 0; i < listMhs.length; i++) {
            list.tambah(listMhs[i]);
        }

        // System.out.println("Data mahasiswa sebelum sorting: ");
        // list.tampil();

        // System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC)");
        // list.selectionSort();
        // list.tampil();
        
        System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
        
        input.close();
    }
}
