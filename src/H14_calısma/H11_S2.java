package H14_calısma;

import java.util.Scanner;

public class H11_S2 {


    public static void main(String[] args) {
        /*
        Kullaniciya kac sayi toplamak istedigini sorun kullanici 2,3 veya 4 degerini girerse,
        kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin.
        kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz,ben toplayamam" yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println(" kaç sayı toplamak istiyorsunuz");
        int sayi= scan.nextInt();
        if (sayi==1){
            System.out.println(sayi +"'den büyük sayı giriniz ");
        }else if (sayi>1 && sayi<5){
            int sayılarToplam=toplam(sayi);
            System.out.println(toplam(sayi));
        }else if (sayi>5){
            System.out.println("sayi çok fazla ben bunları toplayamam");
        }
    }
    public static int toplam(int sayi) {
        Scanner scan=new Scanner(System.in);
        int sayılarToplam=0;
        for (int i=1; i<sayi; i++) {
            System.out.println( i+".sayıyı giriniz");
           sayılarToplam+=scan.nextInt();
        }
        return sayılarToplam;
    }
}