package Jobsheet2.tugas.tugas_2;

public class Dosen19 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen19() {}

    public Dosen19(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println(
            "id Dosen : " + idDosen +
            "\nNama : " + nama +
            "\nStatus : " + statusAktif +
            "\nTahun Bergabung : " + tahunBergabung +
            "\nBidang Keahlian : " + bidangKeahlian
        );
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
