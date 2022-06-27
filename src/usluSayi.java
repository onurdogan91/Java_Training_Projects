import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {

        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

        Scanner input = new Scanner(System.in);

        int taban;
        int ust;
        double sonuc = 1;
        int istek = 3;

        do {
            System.out.println("Taban Degerini Giriniz : ");
            taban = input.nextInt();
            System.out.println("Ust Degerini Giriniz : ");
            ust = input.nextInt();

            if (taban == 0 && ust == 0) {
                System.out.println("Gecersiz Giris");
            } else if (ust <= -1) {
                ust = ust * (-1);
                int i;
                for (i = 1; i <= ust;) {
                    i++;
                    sonuc = taban * sonuc;
                }
                sonuc = 1 / sonuc;
                System.out.println("Sonuc : " + sonuc);
            } else {
                for (int i = 1; i <= ust; i++) {
                    sonuc = taban * sonuc;
                }
                System.out.println("Sonuc : " + sonuc);
            }
                System.out.println("Tekrardan islem yapmak ister misiniz?/n 1 - evet/n 2 - hayir");
                istek = input.nextInt();

                    if (istek == 2) {
                        System.out.println("Isleminiz Bitmistir!!!");
                    } else if (istek == 1) {
                        System.out.println("Uygulama Tekrardan Baslatiliyor!!!");
                        sonuc = 1;
                    } else {
                        System.out.println("Yanlis Deger Girdiniz!!!");
                    }
        } while (istek == 1);
    }
}
