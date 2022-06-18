import java.util.Scanner;
public class CiftSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,i,y=-1;
        double ort,girdi=0;


        System.out.println("Bir sayı giriniz :");
        x = input.nextInt();

        for (i = 0; i <= x;i++){
            if (i %3 == 0 && i %4 == 0){
                girdi+=i;
                y++;

            }
        }
        ort = girdi/y;
        System.out.println(ort);
    }
}
