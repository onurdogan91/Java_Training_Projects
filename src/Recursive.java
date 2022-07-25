import java.util.Scanner;

//faktöriyel alma metodu olmuşturma.

public class Recursive {

    static int fact(int n){

        if (n == 1){
            return 1;
        }

        int carp = (fact(n-1)  * n);
        return carp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz : ");
        int n = input.nextInt();
        message(fact(n));
    }

    static void message(int n){
        System.out.println("Sonuc : " + n);
    }
}
