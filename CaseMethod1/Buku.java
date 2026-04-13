package CaseMethod1;

public class Buku {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    public Buku(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilBuku() {
        System.out.printf("Kode : %s | Judul: %s | Tahun: %d" , kodeBuku, judul, tahunTerbit);
    }
}
