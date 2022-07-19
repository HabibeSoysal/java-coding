package day04_practice;

import java.util.Scanner;

public class E03_MethodCreatıon {
    public static void main(String[] args) {
         /*
Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
   0-1-1-2-3-5-8-13-21-34....
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("47 den küçük bir saı giriniz: ");
        int sayi = scan.nextInt();
        fibONACCI(sayi);
    }
    private static void fibONACCI(int sayi) {
        int sayi1 = 0;
        int sayi2 = 1;
        System.out.print(sayi1 + " ");
        System.out.print(sayi2 + " ");
        int sAyi3;
        if (sayi < 47) {
            for (int i = 2; i < sayi; i++) {
                sAyi3 = sayi1 + sayi2;
                System.out.print(sAyi3 + " ");
                sayi1 = sayi2;
                sayi2 = sAyi3;
            }
        } else {
            System.out.print("47 den küçük bir sayı giriniz");

        }
    }
}
