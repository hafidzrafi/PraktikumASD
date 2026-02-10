package Jobsheet1;

import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NIM: ");
        long nim = input.nextLong();

        long n = nim % 100;
        System.out.println("N: " + n);
        

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            } else if (i % 3 == 0) {
                System.out.print("#");
            } else if (i % 2 != 0) {
                System.out.print("*");
            } else {
                System.out.print(i);
            }

            System.out.print(" ");
        }

        input.close();
    }
}
