package h19_doWhıleCalışmalarım;

import java.util.Scanner;

public class H05_DoWhıle {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve
        sifredeki hatalari yazdirin.
Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve
 gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
- Sifre kucuk harf icermelidir
- Sifre buyuk harf icermelidir
- Sifre ozel karakter icermelidir
- Sifre en az 8 karakter olmalidir.
         */
        Scanner scan=new Scanner(System.in);
        String sifre=" ";
        boolean kontrol=false;
        do {
            System.out.println("lütfen geçerli bir şifre giriniz");
            sifre=scan.nextLine();
            kontrol=sifreyiKontrolEt(sifre);

        }while (kontrol==false);
        System.out.println("şifreniz kabul edilmiştir");
    }
    private static boolean sifreyiKontrolEt(String sifre) {
        boolean kucukHarfKontrol=false;
        boolean büyükHarfKontrol=false;
        boolean özelKarakterKontrol=false;
        boolean uzunlukKontrol=false;
        boolean sifreKontrolSonuc=false;
   if (sifre.length()>=8){
       uzunlukKontrol=true;
   }
   String özelKarakterler="^%+&/()%&/()=";
        for (int i = 0; i <sifre.length() ; i++) {
            if (sifre.charAt(i)>='a'&& sifre.charAt(i)<='z'){
                kucukHarfKontrol=true;
            }
            if (sifre.charAt(i)>='A'&& sifre.charAt(i)<='Z'){
                büyükHarfKontrol=true;
            }
            if (özelKarakterler.contains(sifre.substring(i,i+1))){
                özelKarakterKontrol=true;
            }

        }
        if (özelKarakterKontrol==false){
            System.out.println("şifreniz özel karakter içermeli");
        }
        if (kucukHarfKontrol==false){
            System.out.println("şifreniz küçük harf içermeli");
        }
        if (büyükHarfKontrol==false){
            System.out.println("şifreniz büyük harf içermeli");
        }
        if (uzunlukKontrol==false){
            System.out.println("şifreniz en az 8 karakter olmalı");
        }
        sifreKontrolSonuc=kucukHarfKontrol &&büyükHarfKontrol&&
                özelKarakterKontrol&&uzunlukKontrol;
        return sifreKontrolSonuc;

    }
}
