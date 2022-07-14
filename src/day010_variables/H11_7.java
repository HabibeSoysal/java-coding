package day010_variables;

import java.util.Scanner;

public class H11_7 {
    public static void main(String[] args) {
        /*
        ) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
yazdirin
isim-soyisim : M***** B*******
kart no : **** **** **** 1234
8 KASIM 202
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("adinizi giriniz :");
        String ad = scan.nextLine();
        System.out.println("soyAdinizi giriniz :");
        String soyAd = scan.nextLine();
        System.out.println("kredi kart no girinizi :");
        String kartNo = scan.nextLine();


        ad =ad.substring(0,1)+ad.replaceAll("\\w","*");
        soyAd = soyAd.substring(0,1)+soyAd.replaceAll("\\w","*");

        kartNo =kartNo.substring(0,15).replaceAll("\\d","*")+kartNo.substring(15,19);

        System.out.println(ad +" "+soyAd );
        System.out.println("kartNo : "+kartNo);
    }

}