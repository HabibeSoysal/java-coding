package day09_variables;

import java.util.Scanner;

public class H02_K {
    public static void main(String[] args) {
        /*
        Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini
hesaplayip yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen karenin bir alanını giriniz");
        int  a=scan.nextInt();

        System.out.println("karenin çevresi:"+(4*a));
        System.out.println("Karenin alanı:"+ (a*a));

        /*
        Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdiri
         */

        System.out.println("Lütfen çemberin yarıçapını giriniz");
        int r =scan.nextInt();

        System.out.println("çemberin cevresi:"+ (2*3.14*r));
        System.out.println("çemberin alanı:"+(3.14*r*r));

    /*Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
    prizmanin hacmini hesaplayip yazdirin

 */
        System.out.println("Lütfen dikdörtgenler prizmasının yüksekliğini,\nuzun ve kısa kenarını, giriniz");
        int x  =scan.nextInt();
        int y  =scan.nextInt();
        int z =scan.nextInt();


        System.out.println("Dikdörtgenler prizmasının hacmi:"+(x*y*z));







    }
}
