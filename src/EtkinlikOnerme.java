import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        double heat;
        System.out.print("Lütfen güncel sıcaklık değerini giriniz : ");
        heat=scanner.nextDouble();

        if(-10<=heat && heat<=5)
            System.out.println("Hava kayak yapmak için çok uygun");
        else if(heat>5 && heat<=15)
            System.out.println("Hava tam Sinema havası");
        else if (heat>15 && heat<=25)
            System.out.println("Ooo güzel bir Piknik yapmaya ne dersin");
        else if(heat>25 && heat<=35)
            System.out.println("Yaz gelmiş artık yüzme zamanı");
        else if(heat>35)
            System.out.println("Hava çok sıcak evden çıkmamaya çalış");
        else if (heat<-10)
            System.out.println("Hava çok soğuk dışarı çıkma");



    }
}