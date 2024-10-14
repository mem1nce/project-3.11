import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz? ");
        int n = input.nextInt();

        int max = Integer.MIN_VALUE;  // Başlangıçta en küçük değeri atıyoruz
        int min = Integer.MAX_VALUE;  // Başlangıçta en büyük değeri atıyoruz

        // Kullanıcıdan N adet sayı alıyoruz
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int number = input.nextInt();

            // En büyük sayıyı bulma
            if (number > max) {
                max = number;
            }

            // En küçük sayıyı bulma
            if (number < min) {
                min = number;
            }
        }

        // Sonuçları ekrana yazdırma
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
