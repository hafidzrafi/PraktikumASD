package Jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        StackTugasMahasiswa19 stack = new StackTugasMahasiswa19(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.print(
                "\nMenu:" +
                "\n1. Mengumpulkan Tugas" +
                "\n2. Menilai Tugas" +
                "\n3. Melihat Tugas Teratas" +
                "\n4. Melihat Tugas Terbawah" +
                "\n5. Melihat Daftar Tugas" +
                "\n6. Hitung Jumlah Tugas" +
                "\nPilih: "
            );
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa19 mhs = new Mahasiswa19(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa19 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiswa19 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    Mahasiswa19 lihatBawah = stack.peekBawah();
                    if (lihatBawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihatBawah.nama);
                    }
                    break;
                case 5:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 6:
                    System.out.println("\nJumlah Tugas: " + stack.hitungStack());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6);
        scan.close();
    }
}
