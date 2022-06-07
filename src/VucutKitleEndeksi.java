import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        double length;
        double weight;

        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu 'M' cinsinden giriniz : ");
        length = input.nextDouble();
        System.out.println("Kilonuzu 'KG' cinsinden giriniz : ");
        weight = input.nextDouble();

        double kitleindexi;
        kitleindexi = weight / (length * length);
        System.out.println("Kitle İndexsiniz : " + kitleindexi +"\tkg/metrekare");

    }

}
