import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {

        System.out.println("Zodiak Burcunuzu Öğrenin");
        int year,zodiak;
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz");
        year = input.nextInt();
        zodiak = year % 12;

        if (zodiak == 0){
            System.out.println("Maymun");
        } else if (zodiak == 1) {
            System.out.println("Horoz");
        } else if (zodiak == 2) {
            System.out.println("Köpek");
        } else if (zodiak == 3) {
            System.out.println("Domuz");
        } else if (zodiak == 4) {
            System.out.println("Fare");
        } else if (zodiak == 5) {
            System.out.println("Öküz");
        } else if (zodiak == 6) {
            System.out.println("Kaplan");
        } else if (zodiak == 7) {
            System.out.println("Tavşan");
        } else if (zodiak== 8) {
            System.out.println("Ejderha");
        } else if (zodiak == 9) {
            System.out.println("Yılan");
        } else if (zodiak == 10) {
            System.out.println("At");
        } else if (zodiak == 11) {
            System.out.println("Koyun");
        }

    }
}
