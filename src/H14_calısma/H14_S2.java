package H14_calısma;

import java.util.Scanner;

public class H14_S2 {
    public static void main(String[] args) {

         /*
        Kullaniciya kac sayi toplamak istedigini sorun kullanici 2,3 veya 4 degerini girerse,
        kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin.
        kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz,ben toplayamam" yazdirin
         */
        toplamHesapla();
    }
    public static void toplamHesapla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("kaç sayı toplamak istiyorsunuz");
        int sayiAdet = scan.nextInt();
        int toplam = 0;
        if (sayiAdet == 2 || sayiAdet == 3 || sayiAdet == 4) {
            for (int i = sayiAdet; i > 0; i--) {
                System.out.println(i + ". sayıyı giriniz");
                int sayi = scan.nextInt();
                toplam += sayi;
            }System.out.println("toplam:" + toplam);
        }else{
            System.out.println("ben " + sayiAdet+ " sayıyı toplayamam");
        }


    }
}
