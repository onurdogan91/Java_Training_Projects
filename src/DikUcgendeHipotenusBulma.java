import java.util.Scanner;

public class DikUcgendeHipotenusBulma {
    public static void main(String[] args) {

        double a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir kısa kenar uzunluğu giriniz :");
        a = input.nextDouble();
        System.out.println("Diğer kısa kenar uzunluğu giriniz :");
        b = input.nextDouble();

        double c;
        c = (a * a) + (b * b);
        System.out.println(Math.sqrt(c));

        double hipotenus;
        hipotenus = (Math.sqrt(c));
        System.out.println("Hipotenus Uzunluğu :" + hipotenus);

        double ucgenCevresi = (a+b+hipotenus);
        System.out.println(ucgenCevresi);
        System.out.println("Üçgenin Çevresi :" + ucgenCevresi);

        double ucgeninAlanı = (a * b) / 2;
        System.out.println("Üçgenin Alanı:" + ucgeninAlanı);

    }
}
