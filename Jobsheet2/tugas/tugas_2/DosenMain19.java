package Jobsheet2.tugas.tugas_2;

public class DosenMain19 {
    public static void main(String[] args) {
        Dosen19 dosen1 = new Dosen19();
        dosen1.idDosen = "A1";
        dosen1.nama = "Fatih";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 1709;
        dosen1.bidangKeahlian = "Math";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        System.out.println("Masa Kerja : " + dosen1.hitungMasaKerja(2051) + " tahun");;
        dosen1.ubahKeahlian("English");
        dosen1.tampilInformasi();
        
        Dosen19 dosen2 = new Dosen19("A2", "Rahmat", false, 2025, "Biology");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        System.out.println("Masa Kerja : " + dosen2.hitungMasaKerja(2051) + " tahun");;
        dosen2.ubahKeahlian("Physic");
        dosen2.tampilInformasi();

    }
}
