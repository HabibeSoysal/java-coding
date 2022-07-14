package H14_calısma;

import java.util.Scanner;

public class H10_S1 {
    public static void main(String[] args) {
        /*
        ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu
kucuk mu oldugunu, ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki
rakamlarin toplamini,100’den kucukse sadece 1’ler basamagini yazdiran 3 method
olusturun.
         */
        int sayi = 16;
        tekmiCiftMi(sayi);
        sifirdanBüyükMüKücükMü(sayi);
        rakamlarToplamı(sayi);
    }

    public static void sifirdanBüyükMüKücükMü(int sayi) {
        if (sayi == 0) {
            System.out.println("sayı 0 eşittir");
        } else if (sayi > 0) {
            System.out.println("sayi 0 dan büyüktür");
        } else {
            System.out.println("sayı 0 dan kücüktür");
        }
    }

    public static void tekmiCiftMi(int sayi) {
        if (sayi % 2 == 0) {
            System.out.println("sayi çifttir");
        } else {
            System.out.println("sayi tektir");
        }
    }
    public static void rakamlarToplamı(int sayi) {
        int birlerBasamagı = 0;
        int rakamlarToplamı = 0;
        int girişYapılanSayi = sayi;
        if (sayi > 100) {
            birlerBasamagı = sayi % 10;
            rakamlarToplamı += birlerBasamagı;
            sayi /= 10;
            birlerBasamagı = sayi % 10;
            rakamlarToplamı += birlerBasamagı;
            sayi /= 10;
            birlerBasamagı = sayi % 10;
            rakamlarToplamı += birlerBasamagı;
            sayi /= 10;
            System.out.println("Girdiğiniz " + girişYapılanSayi + " sayısının rakamlar toplamı " + rakamlarToplamı);
        } else{
                birlerBasamagı = sayi % 10;

                System.out.println("birler basamagı :" + birlerBasamagı);
            }
    }
}
