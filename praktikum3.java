// package praktikum3;

import java.util.Scanner;

public class praktikum3 {

    public static void main(String[] args) {
        int angka;
        int angka2;
        int hasil;

        System.out.print("Masukkan Angka: ");
        Scanner input = new Scanner(System.in);
        angka = input.nextInt();
        System.out.print("Masukkan Angka kedua: ");
        angka2 = input.nextInt();
        hasil = angka + angka2;
        System.out.println("Angka yang dimasukkan adalah: " + hasil);

        input.close();
    }
}
