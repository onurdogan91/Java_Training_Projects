import java.util.Scanner;

public class primeNumber {

    static void primeNumber(int a, int b){
        if (b == a){
            System.out.println(a + " Asal Sayidir");
            return;
        } else if (a%b == 0) {
            System.out.println(a + " Asal Sayi Degildir");
            return;
        }
        primeNumber(a, b+1);
    }


    public static void main(String[] args) {
        int controlNum;
        int result;

        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Kontrol etmek Istediginiz Sayiyi Giriniz :");
            controlNum = input.nextInt();
            primeNumber(controlNum,2);

            System.out.println("Devam Etmek Istiyor musunuz ? Evet - e / Hayir - h");
            String deger = input.next();
            if (deger.equals("e")){
                check = true;
            }else {
                check = false;
                System.out.println("Islem Bitmistir!!!");
            }
        }

    }
}
