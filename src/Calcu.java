// // Javada switch case ile basit hesap makinesi yapınız.

import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;
        int select;

        // İlk olarak kullanıcıdan girişleri alıyoruz ve formüllere göre çıkan sonucu ekrana yazdırıyoruz.


        System.out.println();
        System.out.print("Ilk Sayiyi Giriniz : ");
        n1 = input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz : ");
        n2 = input.nextInt();
        System.out.println("\n1-Toplama \n2-Cikarma \n3-Carpma \n4-Bolme ");
        System.out.print("\nLutfen Seciminizi Yapiniz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("\nToplama Isleminizin Sonucu : " + (n1 + n2));
                break;
            case 2:
                System.out.println("\nCikarma Isleminizin Sonucu : " + (n1 - n2));
                break;
            case 3:
                System.out.println("\nCarpma Isleminizin Sonucu : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("\nBolme Isleminizin Sonucu : " + (n1 / n2));
                } else {
                    System.out.println("\nBir Sayi Sifira Bolunemez ! ");
                }
                break;
            default:
                System.out.println("\nLutfen 1 ila 4 Arasinda Bir Sayi Seciniz ! ");
        }
    }
}