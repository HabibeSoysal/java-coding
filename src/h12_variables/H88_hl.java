package h12_variables;

import java.util.Scanner;

public class H88_hl {
    public static void main(String[] args) {
        /*
        Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,

    sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
        isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
                sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin. */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 2 sayı giriniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();


        if (sayi1>0 && sayi2>0){
            System.out.println("sayılarToplamı = " + (sayi1+sayi2));
        }else if (sayi1<0 && sayi2<0){
            System.out.println("Sayıların çarpımı="+(sayi1*sayi2));
        }else if (sayi1>0 && sayi2<0 || sayi1 <0 && sayi2>0){
            System.out.println("Sıfır çarpmaya göre yutan elemandır");
        }else {
            System.out.println("Farklı isaretlerde işlem yapamazsın");
        }


    }
}
