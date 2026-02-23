package Jobsheet2.tugas.tugas_1;

public class MataKuliahMain19 {
    public static void main(String[] args) {
        MataKuliah19 math = new MataKuliah19();
        math.kodeMK = "A1";
        math.nama = "Matematika";
        math.sks = 4;
        math.jumlahJam = 6;

        math.tampilInformasi();
        math.ubahSKS(12);
        math.tambahJam(2);
        math.kurangiJam(3);
        math.tampilInformasi();
        
        MataKuliah19 english = new MataKuliah19("A2", "English", 3, 4);
        english.tampilInformasi();
        english.ubahSKS(8);
        english.tambahJam(5);
        english.kurangiJam(6);
        english.tampilInformasi();
    }
}
