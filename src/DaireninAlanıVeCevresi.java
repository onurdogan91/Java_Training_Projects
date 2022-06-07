import java.util.Scanner;

public class DaireninAlanıVeCevresi {
    public static void main(String[] args) {

        double r,a;
        // r = yarıçap , a = merkez açı ölçüsü
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin Yarı Çapını Giriniz : ");
        r = input.nextDouble();

        System.out.println("Merkez açının ölçüsünü giriniz : ");
        a = input.nextDouble();

        double pi = 3.14;
        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double dilimAlan = (pi * (r*r))* (a/360);

        System.out.println("Dairenin alanı : " + alan );
        System.out.println("Dairenin Çevresi : " + cevre);
        System.out.println("Daire diliminin alanı : " + dilimAlan);

    }
}
