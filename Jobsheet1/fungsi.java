package Jobsheet1;

public class fungsi {
    static int[][] bunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    static int[] harga = {75000, 50000, 60000, 10000};
    static int[] pendapatan = new int[4];

    static void pendapatan() {
        for (int i = 0; i < bunga.length; i++) {
            for (int j = 0; j < bunga[i].length; j++) {
                pendapatan[i] += (bunga[i][j] * harga[j]);
            }
        }
    }
    public static void main(String[] args) {
        pendapatan();

        System.out.println("Royal Garden\n======================");

        for (int i = 0; i < bunga.length; i++) {
            System.out.println("Toko Bunga ke-" + (i+1) + " : " + pendapatan[i]);
            System.out.print("Status : ");

            if (pendapatan[i] > 1500000) {
                System.out.println("Sangat baik");
            } else {
                System.out.println("Perlu Evaluasi");
            }
            System.out.println();
        }
    }
}
