package day10_variables;

import java.util.Scanner;

public class C03_S3 {
    public static void main(String[] args) {
        /*
        Soru3 : Kullanicidan bir sayi girmesini isteyin
        Girilen sayi
        10 ise “Iki basamakli en kucuk sayi
        100 ise “uc basamakli en kucuk sayi”
        1000 ise “dort basamakli en kucuk sayi”
         diger durumlarda “Girdigin sayiyi degistir” yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bi sayı  giriniz");
        int num= scan.nextInt();

        switch(num) {
            case 10:
                System.out.println("2 basamaklı en küçük sayi");
                break;
            case 100 :
                System.out.println("3 basm en küçük sayı");
                break;
            case 1000:
                System.out.println("4 basamaklı en küçük sayi");
                break;

            default:
                System.out.println("Girdiğin sayıyı değiştir");
        }
    }
}
