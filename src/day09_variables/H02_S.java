package day09_variables;

import java.util.Scanner;

public class H02_S {
    public static void main(String[] args) {
        /*
        2- isim ve soyisim icin iki variable olusturun ve bunlari
    isminiz : Mehmet
    soyisminiz : Bulutluoz
    seklinde yazdirin
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi  giriniz");
        String kullanıcıismi=scan.next();
        System.out.println("Lütfen soyisminizi  giriniz");
        String soyisim=scan.next();
        System.out.println("İsminiz:"+ kullanıcıismi);
        System.out.println("Soyismini:"+soyisim);

        System.out.println(" ");
        System.out.println(kullanıcıismi + " "+  soyisim);









    }
}
