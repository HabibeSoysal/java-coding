package day03_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        //Kullanıcıdan ismini alıp ilk jarfile büyük harf olarak yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        char ilkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println("İsmin ilk harfi : "+ilkHarf);
    }
}
