package day10_variables;

import java.util.Scanner;

public class C06_NEsted {
    public static void main(String[] args) {
        /*
        Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, girilen degerlere
gore dikdorgenin kare olup olmadigini yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Dikdörgenin uzunluğunu ve cev giriniz");
        int u= scan.nextInt();
        int g=scan.nextInt();

        System.out.println((u==g) ? "Karedir" : "KAre değildir");












    }
}
