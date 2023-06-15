package Giris;

import java.util.Scanner;

public class HesapMakinesiProgrami {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println(" 1 - Toplama \n 2 - Çıkartma \n 3 - Çarpma \n 4 - Bölme");
        System.out.print(" Seçimini Nedir ? : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println(" Toplama : " + (n1 + n2));
                break;
            case 2:
                System.out.println(" Çıkartma : " + (n1 - n2));
                break;
            case 3:
                System.out.println(" Çartpma : " + (n1 * n2));
                break;
            case 4:
                String zeroCheck = (n2 == 0) ? " Sayı 0'a bölünemez" : (" Bölme : " + (n1 / n2));
                System.out.println(zeroCheck);
                break;
            default:
                System.out.println("Hatalı giriş yaptınız. ");
        }
    }
}
