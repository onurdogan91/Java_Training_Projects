import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double km;
        double priceKm;

        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen kilometreyi giriniz :");
        km = input.nextDouble();

        priceKm = 2.20;

        double totalPrice = ((km * priceKm) + 10);

        totalPrice = (totalPrice < 20) ? 20 : totalPrice;

        System.out.println("Ücret :" + totalPrice);

    }
}
