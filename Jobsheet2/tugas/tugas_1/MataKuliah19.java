package Jobsheet2.tugas.tugas_1;

public class MataKuliah19 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    MataKuliah19() {}

    MataKuliah19(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println(
            "Kode : " + kodeMK +
            "\nNama : " + nama +
            "\nSKS : " + sks +
            "\nJumlah Jam : " + jumlahJam
        );
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi " + sksBaru);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }
    
    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam baru : " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan");
        }
    }


}
