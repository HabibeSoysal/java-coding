package h12_variables;

import java.util.Scanner;

public class E12_s7 {
    public static void main(String[] args) {
        /*


         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir sayı giriniz");
        int num = scan.nextInt();
        int ilkIki = num / 1000;
        int sonIki = num % 100;

        int ilkIkiTop = (ilkIki / 10) + (ilkIki % 10);
        int sonIkiTop = (sonIki / 10) + (sonIki % 10);

        System.out.println("sayıların toplamı=" + (ilkIkiTop + sonIkiTop));

    }

}

