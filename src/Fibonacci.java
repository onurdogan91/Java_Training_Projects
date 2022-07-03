import java.util.Scanner;
public class Fibonacci {
    static int fibonacci(int number){
        int newNumber;
        if (number == 1){
            return 1;
        }else if (number == 2){
            return 1;
        }else {
            newNumber = fibonacci(number -1) + fibonacci(number -2);
            return newNumber;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz :");
        int n = input.nextInt();
        System.out.println("Sonuc :" + fibonacci(n));
    }
}
