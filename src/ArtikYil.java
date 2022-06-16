import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Yıl Giriniz");
        year = input.nextInt();

        if (year %4 == 0){
            if (year %400 == 0){
                System.out.println(year + "Artık Yıldır...");
            }else {
                System.out.println("Artık Yıl Değildir");
            }
        } else {
            System.out.println("Artık Yıl Değildir");
        }
    }
}
