import java.util.Scanner;

public class DortVeBes {
    public static void main(String[] args) {
       //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        double number;
        double four = 0;
        double five = 0;
        double degisken = 0;
        double deger= 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir deger giriniz :");
        number = input.nextDouble();

        System.out.println("---4'un katlari---");

        while (degisken < number){
            degisken = Math.pow(4,four);
            if (degisken <= number){
                System.out.println(((int) degisken) + ",");

            }

            four++;
        }
        System.out.println("---5'in katlari---");

        while (deger < number){
            deger = Math.pow(5,five);
            if (deger <= number){
                System.out.println(((int) deger) + ",");
            }
            five++;
        }





    }
}
