package h12_variables;

import java.util.Scanner;

public class E12_S2 {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Y veya N ikilisinden birini giriniz:");
        char karakter=scan.next().charAt(0);

        if (karakter=='Y' || karakter=='y') {
            System.out.println("Yes");
        } else if (karakter=='N'||karakter=='n') {
            System.out.println("No");
        }else {
            System.out.println("Yanlış giriş yaptınız,\nlütfen sadece Y veya N harflerinden biriniz seçiniz");

        }
    }
}
