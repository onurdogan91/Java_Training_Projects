import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        System.out.println("Uçak Bileti Almak İçin Gerekli Bilgileri Giriniz");

        int age,mile,voyage;
        double perMile,price,totalPrice;

        Scanner input = new Scanner(System.in);
        //Mesafe bilgisi
        System.out.println("Lütfen Gideceğiniz Mesafeyi Giriniz :");
        mile = input.nextInt();
        //Yaş bilgisi
        System.out.println("Lütfen Yaşınızı Giriniz : ");
        age = input.nextInt();
        //Yolculuk detayı
        System.out.println("Yolculuğunuz Tek Yön mü? Gidiş Geliş mi?\n1 - Tek Yön\n2 - Gidiş Geliş ");
        voyage = input.nextInt();

        perMile = 0.10;
        price = perMile * mile;
        if (voyage == 2){
            System.out.println("İndirimsiz Fiyat :" + 2 * price);
        }
        if (voyage == 1){
            System.out.println("İndirimsiz Fiyat :" + price);
        }

        if ((mile < 1) || (age < 1) || (voyage < 1) || (voyage > 2) ){
            System.out.println("Hatalı Giriş Yaptınız!!!");
        } else if (age < 12) {
            totalPrice = price - (price * 0.5);
            if (voyage == 2){
                System.out.println("İndirimli Ücret" + 2* (totalPrice - (totalPrice * 0.2)));
            }

        } else if (age >= 12 && age <= 24) {
            totalPrice = price - (price * 0.1);
            if (voyage == 2){
                System.out.println("İndirimli Ücret :" + 2*(totalPrice - (totalPrice * 0.2)));
            }


        } else if (age >= 65) {
            totalPrice = price - (price * 0.3);
            if (voyage == 2){
                System.out.println("İndirimli Ücret :" + 2*(totalPrice - (totalPrice * 0.2)));
            }

        }else {
            if (voyage == 2){
                totalPrice = price;
                System.out.println("Ücret :" + 2 * (totalPrice - (totalPrice * 0.2)));
            }else {
                totalPrice = price;
                System.out.println("Ücret :" + totalPrice);
            }
        }


    }
}
