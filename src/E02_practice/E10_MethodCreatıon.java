package E02_practice;

import java.util.Scanner;

public class E10_MethodCreatıon {
    public static void main(String[] args) {
        /*
  Problem Tanımı :
  Basit 4 islem yapan bir hesap makinesi kodlayiniz....
  Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
  Kullanicidan iki sayi girmesini isteyiniz.
  Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
*/
        Scanner scan=new Scanner(System.in);
        System.out.print("birinci sayiyi giriniz : ");
        int sayi1 = scan.nextInt();

        System.out.print("ikinci sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        System.out.print("islem yapmak istediginiz sembolu seciniz : ");
        char islem = scan.next().charAt(0);


        if (islem == '+') {
                System.out.println("Girilen sayilarin toplami : " + (sayi1 + sayi2));
        } else if (islem == '-') {
                System.out.println("Girilen sayilarin farki : " + (sayi1 - sayi2));
        } else if (islem == '*') {
                System.out.println("Girilen sayilarin carpimii : " + (sayi1 * sayi2));
        } else if (islem == '/') {
                System.out.println("Girilen sayilarin bolumu : " + (sayi1 / sayi2));
        }
}   }
