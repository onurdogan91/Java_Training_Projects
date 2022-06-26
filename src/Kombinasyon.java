import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        int N,Nfak = 1;
        int r,rFak = 1;
        int comb,combFak = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("N degerini giriniz : ");
        N = input.nextInt();
        System.out.println("r degerini giriniz :");
        r = input.nextInt();

        for (int k = 1; k <= N; k++){
            Nfak *= k;
        }

        for (int k = 1; k <= r; k++){
            rFak *= k;
        }

        for (int k = 1; k <= (N-r); k++){
            combFak *= k;
        }

        comb = Nfak / (rFak * combFak);
        System.out.println("Toplam : " + comb);

    }
}
