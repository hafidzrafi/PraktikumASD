package Jobsheet3.tugas.tugas_2;

import Jobsheet3.tugas.tugas_1.Dosen19;

public class DataDosen19 {
    public static void dataSemuaDosen(Dosen19[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Kode Dosen    : " + arrayOfDosen[i].kode);
            System.out.println("Nama Dosen    : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin : " + (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia Dosen    : " + arrayOfDosen[i].usia);
            System.out.println("------------------------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        double usiaP = 0, usiaW = 0;
        double rerataPria = 0;
        double rerataWanita = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                pria++;
                usiaP += arrayOfDosen[i].usia;
            } else {
                wanita++;
                usiaW += arrayOfDosen[i].usia;
            }
        }
        if (pria > 0) {
            rerataPria = usiaP/pria;
        } if (wanita > 0) {
            rerataWanita = usiaW/wanita;
        }

        System.out.println("Rerata usia Dosen Pria   : " + rerataPria);
        System.out.println("Rerata usia Dosen Wanita : " + rerataWanita);
    }

    public static void infoDosenPalingTua(Dosen19[] arrayOfDosen) {
        Dosen19 tua = arrayOfDosen[0];

        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.usia > tua.usia) tua = dosen;
        }

        System.out.println("Dosen paling tua adalah");
        System.out.println("Kode Dosen    : " + tua.kode);
        System.out.println("Nama Dosen    : " + tua.nama);
        System.out.println("Jenis Kelamin : " + (tua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia Dosen    : " + tua.usia);
        System.out.println("------------------------------------------");

    }
    
    public static void infoDosenPalingMuda(Dosen19[] arrayOfDosen) {
        Dosen19 muda = arrayOfDosen[0];
    
        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.usia < muda.usia) muda = dosen;
        }

        System.out.println("Dosen paling muda adalah");
        System.out.println("Kode Dosen    : " + muda.kode);
        System.out.println("Nama Dosen    : " + muda.nama);
        System.out.println("Jenis Kelamin : " + (muda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia Dosen    : " + muda.usia);
        System.out.println("------------------------------------------");

    }
}
