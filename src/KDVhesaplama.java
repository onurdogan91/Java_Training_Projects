import java.util.Scanner;

public class KDVhesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran;
        Scanner input = new Scanner(System.in);
        System.out.println("Ürün Fiyatını Giriniz :");
        tutar = input.nextDouble();

        boolean kdvDurumu;
        kdvDurumu = (0 < tutar) && (1000 > tutar);
        kdvOran = kdvDurumu ? 18 : 8;

        double kdvTutar = (tutar * kdvOran) / 100;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV Oranı" + kdvOran);
        System.out.println("KDV'li Tutar :" + kdvliTutar);
        System.out.println("KDV Tutarı :" + kdvTutar);
        System.out.println("KDV'siz Tutar" + tutar);
    }
}
