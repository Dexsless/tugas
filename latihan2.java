import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
        
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid");
        } else if (nilai > 60) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
        
        input.close();
    }
}
