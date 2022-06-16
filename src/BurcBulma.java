import java.util.Scanner;

/*
Kova 21.1-18.2
Balık 19.2-20.3
Koç 21.03-20.04
Boğa 21.04-20.05
İkizler 21.05-21.06
Yengeç 22.06-22.07
Aslan 23.07-22.08
Başak 23.08-22.09
Terazi 23.09-23.10
Akrep 24.10-22.11
Yay 23.11-21.12
Oğlak 22.12-20.01
*/

public class BurcBulma {
    public static void main(String[] args) {
        int day,month;

        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz ayı yazınız : ");
        month = input.nextInt();
        System.out.println("Doğduğunuz günü yazınız : ");
        day = input.nextInt();

        if (month >= 13 || month <= 0 || day >=32 || day <=0){
            System.out.println("Hatalı Değer Girdiniz!!!");
        }

        if (month == 1 && day >= 1 && day <= 31){
            if (day <= 20 ){
                System.out.println("Oğlak Burcusunuz");
            }else {
                System.out.println("Kova Burcusunuz");
            }
        }
        if (month == 2 && (day <= 0 || day >=30) ){
            System.out.println("Hatalı Değer Girdiniz!!!");
        }
        if (month == 2 && day >= 1 && day <= 29){
            if (day <= 18 ){
                System.out.println("Kova Burcusunuz");
            }else {
                System.out.println("Balık Burcusunuz");
            }
        }
        if (month == 3 && day >= 1 && day <= 31){
            if (day <= 19 ){
                System.out.println("Balık Burcusunuz");
            }else {
                System.out.println("Koç Burcusunuz");
            }
        }
        if (month == 4 && day >= 1 && day <= 31){
            if (day <= 20 ){
                System.out.println("Koç Burcusunuz");
            }else {
                System.out.println("Boğa Burcusunuz");
            }
        }
        if (month == 5 && day >= 1 && day <= 29){
            if (day <= 20 ){
                System.out.println("Boğa Burcusunuz");
            }else {
                System.out.println("İkizler Burcusunuz");
            }
        }
        if (month == 6 && day >= 1 && day <= 31){
            if (day <= 21 ){
                System.out.println("İkizler Burcusunuz");
            }else {
                System.out.println("Yengeç Burcusunuz");
            }
        }
        if (month == 7 && day >= 1 && day <= 31){
            if (day <= 22 ){
                System.out.println("Yengeç Burcusunuz");
            }else {
                System.out.println("Aslan Burcusunuz");
            }
        }
        if (month == 8 && day >= 1 && day <= 31){
            if (day <= 22 ){
                System.out.println("Aslan Burcusunuz");
            }else {
                System.out.println("Başak Burcusunuz");
            }
        }
        if (month == 9 && day >= 1 && day <= 31){
            if (day <= 22 ){
                System.out.println("Başak Burcusunuz");
            }else {
                System.out.println("Terazi Burcusunuz");
            }
        }
        if (month == 10 && day >= 1 && day <= 31){
            if (day <= 23 ){
                System.out.println("Terazi Burcusunuz");
            }else {
                System.out.println("Akrep Burcusunuz");
            }
        }
        if (month == 11 && day >= 1 && day <= 31){
            if (day <= 22 ){
                System.out.println("Akrep Burcusunuz");
            }else {
                System.out.println("Yay Burcusunuz");
            }
        }
        if (month == 12 && day >= 1 && day <= 31){
            if (day <= 21 ){
                System.out.println("Yay Burcusunuz");
            }else {
                System.out.println("Oğlak Burcusunuz");
            }
        }

    }
}