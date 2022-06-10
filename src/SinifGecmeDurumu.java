import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat1,mat2,fiz1,fiz2,turk1,turk2,kim1,kim2,bio1,bio2;
        double mat,fiz,turk,kim,bio;

        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Vize Notunuz :");
        mat1 = input.nextInt();
        if (mat1 < 0 || mat1 > 100){
            System.out.println("Girdiğiniz Notu Kontrol Ediniz!!!");
            mat1 = 0;
        }

        System.out.println("Matematik Final Notunuz :");
        mat2 = input.nextInt();
        if (mat2 < 0 || mat2 > 100)
        {
            System.out.println("Girdiğiniz Notu Kontrol Ediniz!!!");
            mat2 = 0;
        }

        System.out.println("Fizik Vize Notunuz :");
        fiz1 = input.nextInt();
        if (fiz1 < 0 || fiz1 > 100)
        {
            System.out.println("Girdiğiniz Notu Kontrol Ediniz!!!");
            fiz1 = 0;
        }

        System.out.println("fizik Final Notunuz :");
        fiz2 = input.nextInt();
        if (fiz2 < 0 || fiz2 > 100)
        {
            System.out.println("Girdiğiniz Notu Kontrol Ediniz!!!");
            fiz2 = 0;
        }

        System.out.println("Türkçe Vize Notunuz :");
        turk1 = input.nextInt();
        if (turk1 < 0 || turk1 > 100)
        {
            System.out.println("Girdiğiniz Notu Kontrol Ediniz!!!");
            turk1 = 0;
        }

        System.out.println("Türkçe Final Notunuz :");
        turk2 = input.nextInt();
        if (turk2 < 0 || turk2 > 100)
        {
            System.out.println("Girdiğiniz Notu Kontrol Ediniz!!!");
            turk2 = 0;
        }

        System.out.println("Kimya Vize Notunuz :");
        kim1 = input.nextInt();
        if (kim1 < 0 || kim1 > 100)
        {
            System.out.println("Girdiğiniz Notu Kontrol Ediniz!!!");
            kim1 = 0;
        }

        System.out.println("Kimya Final Notunuz :");
        kim2 = input.nextInt();
        if (kim2 < 0 || kim2 > 100)
        {
            System.out.println("Girdiğiniz Notu Kontrol Ediniz!!!");
            kim2 = 0;
        }

        System.out.println("Biyoloji Vize Notunuz :");
        bio1 = input.nextInt();
        if (bio1 < 0 || bio1 > 100)
        {
            System.out.println("Girdiğiniz Notu Kontrol Ediniz!!!");
            bio1 = 0;
        }

        System.out.println("Biyoloji Final Notunuz :");
        bio2 = input.nextInt();
        if (bio2 < 0 || bio2 > 100)
        {
            System.out.println("Girdiğiniz Notu Kontrol Ediniz!!!");
            bio2 = 0;
        }

        mat = (mat1 * 30)/100 + (mat2 * 70)/100;
        System.out.println("Matematik Ortalamanız :" + mat);
        fiz = (fiz1 * 30)/100 + (fiz2 * 70)/100;
        System.out.println("Fizik Ortalamanız :" + fiz);
        turk = (turk1 * 30)/100 + (turk2 * 70)/100;
        System.out.println("Türkçe Ortalamanız :" + turk);
        kim = (kim1 * 30)/100 + (kim2 * 70)/100;
        System.out.println("Kimya Ortalamanız :" + kim);
        bio = (bio1 * 30)/100 + (bio2 * 70)/100;
        System.out.println("Biyoloji Ortalamanız :" + bio);

        double ortalama = (mat+fiz+turk+kim+bio) / 5;

        System.out.println("Ortalamanız : " + ortalama);

        if (ortalama < 55){
            System.out.println("Ortalamanız 55 puanın altında kaldığı için sınıfı geçemediniz!!!");
        }else{
            System.out.println("Sınıfı geçtiniz.");
        }





    }
}
