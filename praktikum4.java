import java.util.Scanner;
public class praktikum4 {
    public static void main(String[] args) {
        float a,b,plus,minus,kali,bagi;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        a = input.nextFloat();
        System.out.print("Masukkan nilai b: ");
        b = input.nextFloat();

        plus = a + b;
        minus = a - b;
        kali = a * b;
        bagi = (float) a / b;

        System.out.println("Hasil penjumlahan a + b = " + plus);
        System.out.println("Hasil pengurangan a - b = " + minus);
        System.out.println("Hasil perkalian a * b = " + kali);
        System.out.println("Hasil pembagian a / b = " + bagi);
        input.close();
    }
}
