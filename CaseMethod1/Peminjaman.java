package CaseMethod1;

public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    public Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    public void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            denda = 0;
        }
    }

    public void tampilPeminjaman() {
        System.out.printf("%s | %s | %s | Lama: %s | Terlambat: %d | Denda: %d" , mhs.nim, mhs.nama, buku.judul, lamaPinjam, terlambat, denda);
    }
}
