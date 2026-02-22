package Jobsheet2;

public class MahasiswaMain19 {
    public static void main(String[] args) {
        Mahasiswa19 mhs1 = new Mahasiswa19();
        mhs1.nama = "Hafidz Rafi";
        mhs1.nim = "254107020084";
        mhs1.kelas = "TI - 1G";
        mhs1.ipk = 3.6;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SIB - 1A");
        mhs1.updateIpk(3.99);
        mhs1.tampilkanInformasi();
    }
}
