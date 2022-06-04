import java.util.Scanner;

public class NotOrtalamasıHesaplama {
    public static void main(String[] args) {
         int mat, fizik, kimya, turkce, tarih, muzik;

         Scanner inp = new Scanner(System.in);

         System.out.print("Mat notunuz :");
         mat = inp.nextInt();

         System.out.print("Fizik notu :");
         fizik = inp.nextInt();

         System.out.print("Kimya notu :");
         kimya = inp.nextInt();

         System.out.print("Türkçe notu :");
         turkce = inp.nextInt();

         System.out.print("Tarih notu :");
         tarih = inp.nextInt();

         System.out.print("Müzik notu :");
         muzik = inp.nextInt();

         int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
         double sonuc = toplam / 6;
         System.out.println("Ortalama : " + sonuc);
         boolean kosul1 = sonuc >= 60;
         String str = (kosul1) ? "Geçti" : "Kaldı";
         System.out.println(str);
    }
}
