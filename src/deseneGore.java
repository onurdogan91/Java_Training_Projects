import java.util.Scanner;

public class deseneGore {
    static int islem(int sayi, int sayac){

        if (sayi<=0){
            islemTopla(sayi,sayac);
            return sayi;
        }
        else {
            System.out.print(sayi+",");
            islem(sayi-5,sayac);
            return sayi;
        }

    }
    static  int islemTopla(int sayi, int sayac){
        if (sayi!=sayac){
            System.out.print(sayi+",");
            islemTopla(sayi+5,sayac);
            return sayi;
        }else{
            System.out.print(sayi);
            return sayi;
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Deger Giriniz : ");
        int sayi = input.nextInt();

        islem(sayi,sayi);
    }
}