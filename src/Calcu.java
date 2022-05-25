import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s1, s2;
        int secim;

        System.out.print("Ilk Sayiyi Giriniz : ");
        s1 = input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz : ");
        s2 = input.nextInt();
        System.out.println("1-Toplama \n2-Cikarma \n3-Carpma \n4-Bolme ");
        System.out.print("Lutfen Seciminizi Yapiniz : ");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.print("Toplama Isleminizin Sonucu : " + (s1 + s2));
                break;
            case 2:
                System.out.print("Cikarma Isleminizin Sonucu : " + (s1 - s2));
                break;
            case 3:
                System.out.print("Carpma Isleminizin Sonucu : " + (s1 * s2));
                break;
            case 4:
                if (s2 != 0) {
                    System.out.print("Bolme Isleminizin Sonucu : " + (s1 / s2));
                } else {
                    System.out.print("Bir Sayi Sifira Bolunemez ! ");
                }
                break;
            default:
                System.out.print("Lutfen 1 ila 4 Arasında Bir Sayi Giriniz ! ");
        }
    }
}
