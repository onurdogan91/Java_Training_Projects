import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        System.out.println("Ürün Fiyatları :\n" + "Armut : 2,14 TL\n" + "Elma : 3,67 TL\n" + "Domates : 1,11 TL\n" + "Muz : 0,95 TL\n" + "Patlıcan : 5,00 TL");

        double armut, elma, domates, muz, patlican;
        Scanner input = new Scanner(System.in);
        System.out.println("Alınan Armut Miktarını Giriniz :");
        armut = input.nextDouble();
        System.out.println("Alınan Elma Miktarını Giriniz :");
        elma = input.nextDouble();
        System.out.println("Alınan Domates Miktarını Giriniz :");
        domates = input.nextDouble();
        System.out.println("Alınan Muz Miktarını Giriniz :");
        muz = input.nextDouble();
        System.out.println("Alınan Patlıcan Mitarını Giriniz :");
        patlican = input.nextDouble();

        double total,armutP,elmaP,domatesP,muzP,patlicanP;
        armutP = 2.14;
        elmaP = 3.67;
        domatesP = 1.11;
        muzP = 0.95;
        patlicanP = 5.00;
        total = (armut*armutP) + (elma*elmaP) + (domates*domatesP) + (muz*muzP) + (patlican*patlicanP);
        System.out.println("Toplam Ücret :" + total);

    }
}
