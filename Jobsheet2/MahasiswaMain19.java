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

        Mahasiswa19 mhs2 = new Mahasiswa19("Tora Santaro", "123456789", 3.73, "TI - 1H");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa19 mhsHafidz = new Mahasiswa19("Hafidz Rafi", "254107020084", 3.6, "TI - 1G");
    }
}
