import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        double a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayı değeri giriniz :");
        a = input.nextDouble();
        System.out.println("İkinci sayı değerini giriniz :");
        b = input.nextDouble();
        System.out.println("Üçüncü sayı değerini giriniz :");
        c = input.nextDouble();

        if ((a>b) && (a>c)){
            if (b>c){
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if ((b>a) && (b>c)) {
            if (a>c){
                System.out.println("b > a > c");
            }else {
                System.out.println("b > c > a");
            }
        } else if ((c > b) && (c > a)) {
            if (a > b){
                System.out.println("c > a > b");
            }else {
                System.out.println("c > b > a");
            }

        }
    }
}
