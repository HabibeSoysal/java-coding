package day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
        /*
    kullanıcıdan bir sifre girmesini isteyin
    aşagıdaki şartları saglıyorsa "sifre basarı ile tanımlandı",
    sartları saglanamazsa "işlem basarısız, lütfen yeni bir sifre girin" yazdırın
    ve başarılı sifre girinceye kadar tekrar sifre girmesini isteyin
    ilk harf büyük olmalı
    son harf küçük olmalı
    sifre bosluk ıcermemelı
    sifre uzunlugu en az 8 karakter olmalı

         */
        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreBasarılıMı = false;
        int kontrol = 0;

        while (!sifreBasarılıMı) {//kullanıcıdan şifre alalım
            System.out.println("lütfen bir sifre  giriniz");
            sifre = scan.nextLine();
            // 4 kontrolu yapalım her geçen kontrolu icin kontrolu varable + 1
            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
                kontrol++;
            } else {
                System.out.println("ilk harf büyük olmalı");
            }
            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                kontrol++;
            } else {
                System.out.println("son harf kücük olmalı");
            }
            //boşluk kontrolü
            if (sifre.contains(" ")) {
                System.out.println("sifre boşluk içermemeli");
            } else {
                kontrol++;
            }//sifre uzunluk kontrolu
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("sifre en az 8 karkter olmalı");
                if (kontrol == 4) {
                    // tum kontrollerden gecti demektir
                    System.out.println("sifre basarılı ile tanımlandı");
                    sifreBasarılıMı = true;
                } else { // sifre basarısız tekrar basa döndecek kontrol varıable sıfırlanmalı
                    kontrol = 0;

                }
            }
        }
    }    }