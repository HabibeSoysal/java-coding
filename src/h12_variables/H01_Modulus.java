package h12_variables;

import java.util.Scanner;

public class H01_Modulus {
    public static void main(String[] args) {
        /*

         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı sayı giriniz");
        int sayi=scan.nextInt();

        int ilkIki=sayi/1000;
        int sonIki=sayi%100;

        int ilkIkiTopl=(ilkIki/10)+(ilkIki%10);
        System.out.println("ilkIkiTopl = " + ilkIkiTopl);
        int sonIkiTopl=(sonIki/10)+(sonIki%10);
        System.out.println("sonIkiTopl = " + sonIkiTopl);

        System.out.println("Sayıların Toplamı = " + (ilkIkiTopl+sonIkiTopl));




    }

}
