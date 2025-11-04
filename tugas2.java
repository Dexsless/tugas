import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
        String huruf, ket;
        
        if (nilai >= 81 && nilai <= 100) {
            huruf = "A";
            ket = "Lulus";
        } else if (nilai >= 61 && nilai <= 80) {
            huruf = "B";
            ket = "Lulus";
        } else if (nilai >= 41 && nilai <= 60) {
            huruf = "C";
            ket = "Lulus";
        } else if (nilai >= 21 && nilai <= 40) {
            huruf = "D";
            ket = "Ulang";
        } else if (nilai >= 0 && nilai <= 20) {
            huruf = "E";
            ket = "Ulang";
        } else {
            huruf = "-";
            ket = "Nilai tidak valid";
        }
        
        System.out.println("\n=== HASIL KONVERSI NILAI ===");
        System.out.println("Nilai Angka : " + nilai);
        System.out.println("Nilai Huruf : " + huruf);
        System.out.println("Keterangan  : " + ket);
    }
}
