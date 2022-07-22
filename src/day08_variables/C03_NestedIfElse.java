package day08_variables;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        /*Emeklilik kontrolü yapan bir yazılım yazınız
        Cinsiyet olarak E(Erkek) veya K(Kadın) olarak değişkenleri kabul etsin
        farklı bir harf veya sembol girilirse hata mesajı versin
        emeklilik için kadınlarda 60 erkeklerde 65 olsun
        negatif yaş veya 80 den büyük yazılırsa hata mesajı versin

         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen cinsiyetinizi giriniz : " + "\nKadın için K Erkek için E harfini giriniz");
        char  cins= scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz : ");
        double yaş=scan.nextDouble();

        if (cins=='K') {
            if (yaş < 0 || yaş > 80) {
                System.out.println("Geçerli yaş giriniz");
            } else if (yaş < 60) {
                System.out.println("Emekli olamazsın");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        }else if (cins=='E') {
            if (yaş < 0 || yaş > 80) {
                System.out.println("Geçerli yaş giriniz");
            } else if (yaş < 65) {
                System.out.println("Emekli olamazsın");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        }else{
           System.out.println("lütfen cinsiyet için geçerli bir harf giriniz");
        }
    }
}

