package CaseMethod1;

public class DataPeminjaman {
    Mahasiswa[] listMahasiswa;
    Buku[] listBuku;
    Peminjaman[] listPeminjaman;

    public DataPeminjaman() {
        listMahasiswa = new Mahasiswa[3];
        listMahasiswa[0] = new Mahasiswa("22001", "Andi", "Teknik Informatika");
        listMahasiswa[1] = new Mahasiswa("22002", "Budi", "Teknik Informatika");
        listMahasiswa[2] = new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis");

        listBuku = new Buku[4];
        listBuku[0] = new Buku("B001", "Algoritma", 2020);
        listBuku[1] = new Buku("B002", "Basis Data", 2019);
        listBuku[2] = new Buku("B003", "Pemrograman", 2021);
        listBuku[3] = new Buku("B004", "Fisika", 2024);

        listPeminjaman = new Peminjaman[5];
        listPeminjaman[0] = new Peminjaman(listMahasiswa[0], listBuku[0], 7); 
        listPeminjaman[1] = new Peminjaman(listMahasiswa[1], listBuku[1], 3);
        listPeminjaman[2] = new Peminjaman(listMahasiswa[2], listBuku[2], 10);        
        listPeminjaman[3] = new Peminjaman(listMahasiswa[2], listBuku[3], 6);
        listPeminjaman[4] = new Peminjaman(listMahasiswa[0], listBuku[1], 4);

        for (Peminjaman i : listPeminjaman) {
            i.hitungDenda();
        }
    }

    public void tampilMahasiswa() {
        for (Mahasiswa i : listMahasiswa) {
            i.tampilMahasiswa();
            System.out.println();
        }
    }

    public void tampilBuku() {
        for (Buku i : listBuku) {
            i.tampilBuku();
            System.out.println();
        }
    }
    
    public void tampilPeminjaman(Peminjaman[] data) {
        for (Peminjaman i : data) {
            if (i == null) continue;

            i.tampilPeminjaman();
            System.out.println();
        }
    }

    public void sortingDenda() {
        for (int i = 1; i < listPeminjaman.length; i++) {
            Peminjaman cek = listPeminjaman[i];
            int j = i-1;

            while (j >= 0 && cek.denda > listPeminjaman[j].denda) {
                listPeminjaman[j+1] = listPeminjaman[j];
                j--;
            }
            listPeminjaman[j+1] = cek;
        }
    }

    public void sortingNIM() {
        for (int i = 1; i < listPeminjaman.length; i++) {
            Peminjaman cek = listPeminjaman[i];
            int j = i-1;

            while (j >= 0 &&  cek.mhs.nim.compareTo(listPeminjaman[j].mhs.nim) < 0) {
                listPeminjaman[j+1] = listPeminjaman[j];
                j--;
            }
            listPeminjaman[j+1] = cek;
        }
    }

    public Peminjaman[] searchingNIM(String cari) {
        sortingNIM();
        
        Peminjaman[] hasil = new Peminjaman[listPeminjaman.length];
        int ketemu = -1;
        int low = 0;
        int high = listPeminjaman.length-1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            int cek = listPeminjaman[mid].mhs.nim.compareTo(cari);

            if (cek == 0) {
                ketemu = mid;
                break;
            } else if (cek > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (ketemu != -1) {
            int kiri = ketemu;
            while (kiri > 0 && listPeminjaman[kiri - 1].mhs.nim.equals(cari)) {
                kiri--;
            }

            int kanan = ketemu;
            while (kanan < listPeminjaman.length-1 && listPeminjaman[kanan + 1].mhs.nim.equals(cari)) {
                kanan++;
            }

            for (int i = 0, j = kiri; j <= kanan; i++, j++) {
                hasil[i] = listPeminjaman[j];
            }
        }
        return hasil;
    }
}
