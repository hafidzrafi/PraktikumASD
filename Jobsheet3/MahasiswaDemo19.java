package Jobsheet3;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Mahasiswa19[] arrayOfMahasiswa19 = new Mahasiswa19[3];
        arrayOfMahasiswa19[0] = new Mahasiswa19();
        arrayOfMahasiswa19[0].nim = "1234567890";
        arrayOfMahasiswa19[0].nama = "Budi";
        arrayOfMahasiswa19[0].kelas = "TI-1A";
        arrayOfMahasiswa19[0].ipk = 3.5f;

        arrayOfMahasiswa19[1] = new Mahasiswa19();
        arrayOfMahasiswa19[1].nim = "0987654321";
        arrayOfMahasiswa19[1].nama = "Siti";
        arrayOfMahasiswa19[1].kelas = "TI-1B";
        arrayOfMahasiswa19[1].ipk = 3.8f;

        arrayOfMahasiswa19[2] = new Mahasiswa19();
        arrayOfMahasiswa19[2].nim = "1122334455";
        arrayOfMahasiswa19[2].nama = "Andi";
        arrayOfMahasiswa19[2].kelas = "TI-1C";
        arrayOfMahasiswa19[2].ipk = 3.2f;

        System.out.println("NIM     : " + arrayOfMahasiswa19[0].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa19[0].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa19[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa19[0].ipk);
        System.out.println("-------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa19[1].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa19[1].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa19[1].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa19[1].ipk);
        System.out.println("-------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa19[2].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa19[2].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa19[2].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa19[2].ipk);
        System.out.println("-------------------------------------");
    }
}
