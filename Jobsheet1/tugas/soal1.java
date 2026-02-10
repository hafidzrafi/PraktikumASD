package Jobsheet1.tugas;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] kota = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        while (true) {
            System.out.print("Masukkan KODE plat nomor (0 untuk keluar): ");
            char inputKode = input.nextLine().toUpperCase().charAt(0);
            boolean ada = false;

            if (inputKode == '0') {
                System.out.println("Program selesai.");
                break;
            }
    
            for (int i = 0; i < kode.length; i++) {
                if (inputKode == kode[i]) {
                    System.out.print("Kota : ");
                    for (int j = 0; j < kota[i].length; j++) {
                        System.out.print(kota[i][j]);
                    }
                    System.out.println();
                    ada = true;
                    break;
                }
                ada = false;
            }
            if (!ada) {
                System.out.println("Kode tidak ditemukan");
            }
            
        }
        input.close();
    }
}
