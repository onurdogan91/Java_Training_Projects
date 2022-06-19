import java.util.Scanner;

public class Denemeeeee {
    public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);

        int number;
        int check = 0;
        int total = 0;
        while(check == 0)
        {
            System.out.println("Bir sayi giriniz : ");
            number = input.nextInt();
            if(number % 2 == 0) {
                    total += number;
            }
            else
                check = 1;
        }

        System.out.println("Toplam : " + total);*/

        Scanner kb = new Scanner(System.in);

        int sum = 0;

        for (;;) {
            System.out.print("Bir sayi giriniz: ");
            int n = kb.nextInt();

            if (n % 2 != 0)
                break;

            if (n % 4 == 0)
                sum += n;
        }
        System.out.printf("%d%n", sum);
    }
}
