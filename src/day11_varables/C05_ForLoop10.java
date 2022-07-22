package day11_varables;

import java.util.Scanner;

public class C05_ForLoop10 {
    public static void main(String[] args) {
        /*
        Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar
        ve aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen baslangıç ve bitiş degerlerini belirten tamsayı giriniz");
        int bas=scan.nextInt();
        int bitiş=scan.nextInt();

        aralarıTopla(bas,bitiş);

    }

    public static void aralarıTopla(int bas, int bitiş) {
        int toplam=0;
        if (bas<=bitiş){
            for (int i = bas; i<=bitiş; i++) {
                toplam+=i;
            }

        }else {
            for (int i = bitiş; i<=bas; i++) {
                toplam+=i;
            }
        }
        System.out.println("aradaki sayıların toplamı:"+ toplam );





    }
}
