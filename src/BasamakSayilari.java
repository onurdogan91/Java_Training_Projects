import java.util.Scanner;

public class BasamakSayilari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Girilen Sayinin Basamak Degerini Hesaplama");

        System.out.print("Sayi Giriniz: ");


        int num = input.nextInt();

        int total=0;

        while(num != 0)
        {
            total +=  (num%10);
            num /= 10;

        }

        System.out.println("Basamak Sayilari Toplami: " + total);
    }
}
