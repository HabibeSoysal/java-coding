package day010_variables;

import java.util.Scanner;

public class H11_01 {
    public static void main(String[] args) {
        /*
        Kullanicidan isim isteyin. Eger
    - isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
    - isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
    - ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bi isim giriniz");
        String ad=scan.nextLine();


        if (ad.contains("a") && ad.contains("Z")){
            System.out.println("Girdiğiniz isim iki harfi içeriyor");
        }else if (ad.contains("Z")){
            System.out.println("Girdiğiniz isim Z harfi içeriyor");
        }else if(ad.contains("a")){
            System.out.println("Girdiğiniz isim a harfi içeriyor");
        }else{
            System.out.println("Girdiğiniz isimde ikiside yoktur");
        }







    }
}
