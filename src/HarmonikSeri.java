import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz : ");
        double n = input.nextDouble();
        double result = 0.0;
        for (double i = 1.0; i <= n; i++){
            result += (1/i);
        }

        System.out.println("Sonuc : " + result);
    }
}
