import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total belanja: Rp ");
        double totalBelanja = input.nextDouble();
        double diskon;
        
        if (totalBelanja > 100000) {
            diskon = 0.10;
        } else if (totalBelanja >= 50000) {
            diskon = 0.05;
        } else {
            diskon = 0;
        }
        
        double potongan = totalBelanja * diskon;
        double totalBayar = totalBelanja - potongan;
        
        System.out.println("\n=== STRUK PEMBAYARAN ===");
        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Diskon        : " + (diskon * 100) + "%");
        System.out.println("Potongan      : Rp " + potongan);
        System.out.println("Total Bayar   : Rp " + totalBayar);
    }
}
