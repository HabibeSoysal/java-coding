package day03_scanner;

import java.awt.*;
import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {
        //Kullanıcıdan ismini soyismini ve yaşını alıp girilen bilgiler=Seyfi Çapar 34 şeklinde yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim=scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Lütfen yaşınızı girin");
        double yaş=scan.nextDouble();
        System.out.println("Girilen bilgiler="+isim+" "+soyisim+" "+ yaş);
    }
}
