package day09_variables;

import java.util.Scanner;

public class H05_Scanner {
    public static void main(String[] args) {
        //) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdiri

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki tamsayı giriniz");
        int a=scan.nextInt();
        int b=scan.nextInt();

        System.out.println("Girilen sayıların toplamları:" + (a+b));
        System.out.println("Girilen sayıların farkı:"+(a-b));
        System.out.println("Girilen sayıların çarpımı:"+ (a*b));


    }
}
