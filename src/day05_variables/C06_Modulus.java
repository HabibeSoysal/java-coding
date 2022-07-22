package day05_variables;

import java.util.Scanner;

public class C06_Modulus {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen  4 bas tamsayı giriniz");
        int sayi= scan.nextInt();//5267

        int birlerBasamagı=0;
        int rakamlartoplami=0;
        int ilkgGirilenSayi=sayi;

      //  Şuan da sayı 5267 bb=0    rt=0
        birlerBasamagı=sayi%10;//7
        rakamlartoplami+=birlerBasamagı;

    sayi/=10;

    //şu anda 526 bb 7 rt 7

        birlerBasamagı=sayi%10;// 6
        rakamlartoplami+=birlerBasamagı;//7+6= 13
        sayi/=10;
        // su anda sayı 52 bb=6 rt=13

        birlerBasamagı=sayi%10;//2
        rakamlartoplami+=birlerBasamagı;//13+2 15
        sayi/=10; //5

        //şuan da sayı 5 bb2 rt15
        birlerBasamagı+=sayi%10;//5
        rakamlartoplami+=birlerBasamagı;//15 + 5  20
        sayi/=10;//0
        // su anda say0 bb5 rt20

        System.out.println(ilkgGirilenSayi +"sayısının rakamlar toplamı:"+ rakamlartoplami);


    }
}
