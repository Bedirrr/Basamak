import java.util.Scanner;

public class Basamak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();
        int basamakToplami = 0;

        while (sayi != 0) {
            basamakToplami += sayi % 10;
            sayi /= 10;
        }

        System.out.println("Sayının basamakları toplamı: " + basamakToplami);
    }
}