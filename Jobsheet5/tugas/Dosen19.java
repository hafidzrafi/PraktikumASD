package Jobsheet5.tugas;

public class Dosen19 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen19(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    
    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Kode: " + kode);
        if (jenisKelamin) {
            System.out.println("Jenis Kelamin: Laki-laki");
        } else {
            System.out.println("Jenis Kelamin: Perempuan");
        }
        System.out.println("Usia: " + usia);

    }
}
