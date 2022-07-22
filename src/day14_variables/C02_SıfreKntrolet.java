package day14_variables;

import java.util.Scanner;

public class C02_SıfreKntrolet {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre
basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir
sifre girin” yazdirin
- Ilk harf buyuk harf olmali
- Son harf kucuk harf olmali
- Sifre bosluk icermemeli
- Sifre uzunlugu en az 8 karakter olmali
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String sifre=scan.nextLine();
        int kontrol=0;

        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            kontrol++;
        }else{
            System.out.println("İlk harf büyük harf olmalı");
        }
        if (sifre.charAt(sifre.length()-1)>='a' && (sifre.charAt(sifre.length()-1)<='z')){
            kontrol++;
        }else{
            System.out.println("Son harf küçük olmalı");
        }
        if (sifre.contains(" ")){
            System.out.println("Sifre boşluk içermemeli");
        }else{
            kontrol++;
        }
        if (sifre.length()>=8){
            kontrol++;
        }else{
            System.out.println("sifre en az 8 karakter olmalı");
        }
        if (kontrol==4){
            System.out.println("Sifre basarı ile tanımlandı");
        }else{
            System.out.println("İşlem basarısız yeni bi sifre giriniz");
    }
}}
