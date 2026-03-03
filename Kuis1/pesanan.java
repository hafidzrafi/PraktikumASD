package Kuis1;

public class pesanan {
    String id = "";
    String nama = "";
    int harga = 0;
    int jumlah = 0;

    public pesanan() {}

    public pesanan(String id, String nama, int harga, int jumlah) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public void tampilInformasi() {
        System.out.println("ID Pesanan : " + id);
        System.out.println("Nama       : " + nama);
        System.out.println("Harga      : " + harga);
        System.out.println("Jumlah     : " + jumlah);
        System.out.println("Total      : " + (harga * jumlah));
    }

    public static int totalHargaKeseluruhan(pesanan[] daftarPesanan) {
        int total = 0;
        for (pesanan p : daftarPesanan) {
            total += p.harga * p.jumlah;
        }
        return total;
    }

    public static int kembalian(pesanan[] daftarPesanan, int uangBayar) {
        int total = totalHargaKeseluruhan(daftarPesanan);
        return uangBayar - total;
    }
}
