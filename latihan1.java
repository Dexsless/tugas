import java.util.Scanner;
public  class latihan1 {
    public static void main(String[] args) {
        float harga, pertalite, pertamax, solar;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Uang: ");
        harga = input.nextFloat();
        pertalite = harga / 10000;
        pertamax = harga / 12000;
        solar = harga / 9000;

        System.out.println("Jumlah Liter Pertalite yang dapat dibeli: " + pertalite + " Liter");
        System.out.println("Jumlah Liter Pertamax yang dapat dibeli: " + pertamax + " Liter");
        System.out.println("Jumlah Liter Solar yang dapat dibeli: " + solar + " Liter");
        input.close();
    }
}