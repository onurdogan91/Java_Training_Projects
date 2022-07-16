import java.util.Scanner;

public class recExponentialNumber {

    static double expoNumber(double a, double b){
        double result = Math.pow(a,b);

        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base;
        double exponent;
        double total;

        boolean process = true;

        while (process) {
            System.out.println("Taban Degerini Giriniz :");
            base = input.nextDouble();
            System.out.println("Us Degerini Giriniz : ");
            exponent = input.nextDouble();

            total = expoNumber(base,exponent);
            System.out.println("Sonuc : " + total);

            System.out.println("Devam Etmek Istiyor musunuz ? Evet - e / Hayir - h");
            String deger = input.next();
            if (deger.equals("e")){
                process = true;
            }else {
                process = false;
                System.out.println("Islem Bitmistir!!!");
            }
        }

    }
}
