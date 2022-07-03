import java.util.Scanner;

public class Palindrom {
    static int palindrom(int number){
        int lastNumber;
        int newNumber = 0;

        while (number != 0){
            lastNumber = number %10;
            newNumber = (newNumber *10) + lastNumber;
            number /= 10;
        }
        return newNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz :");
        int n = input.nextInt();
        if (n == palindrom(n)){
            System.out.println("Sayı Palindromdur...");
        }else {
            System.out.println("Sayı Palindrom Degildir...");
        }
    }
}
