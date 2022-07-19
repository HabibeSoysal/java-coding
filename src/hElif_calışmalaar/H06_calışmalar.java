package h20_calışmalaar;

import java.util.Scanner;

public class H06_calışmalar {
    public static void main(String[] args) {
        /*
SORU 1 : Girilen sayıların toplamı 100'ü geçince daha sayı istemeyecek ve
o ana kadar kaç sayı girildiği ekrana yazdırılacak.
bu soruyu hem for-loop hemde while -do döngüsü ile yapınız.
 */
        Scanner scan = new Scanner(System.in);
        int sayıToplam = 0;
        int sayıAdet = 0;

        for (int i = 0; i <= 100; i++) {
            System.out.println("lutfen " + (sayıAdet + 1) + ". sayiyi giriniz");
            i += scan.nextInt();
            sayıAdet++;
            sayıToplam += i;
        }//dongu sonu
        System.out.println(" Toplam sonuc : " + sayıToplam + "\n toplam girilen sayisi : " + sayıAdet);

        System.out.println("---------------------");
        int i = 0;
        while (sayıToplam <= 100) {
            System.out.println(i + ". sayıyı giriniz: ");
            sayıToplam += i;
            i++;
        }
        System.out.println(sayıAdet + " adet sayi girdiniz ve toplamları:" + sayıToplam);


    }
}




