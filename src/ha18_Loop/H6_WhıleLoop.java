package ha18_Loop;

import java.util.Scanner;

public class H6_WhıleLoop {
    public static void main(String[] args) {
        /*
        ) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
olduklarini ekranda yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi = scan.nextInt();

        int tamBölenSayıilar = 0;
        int toplam = 0;
        while (tamBölenSayıilar <= sayi) {
            if (sayi % tamBölenSayıilar == 0) {
                System.out.print(sayi+ " ");
                tamBölenSayıilar ++;

            }toplam+=tamBölenSayıilar;


        }
        System.out.println(" ");
        System.out.print(sayi + " sayısını " + tamBölenSayıilar + " adet sayi kalansız bölmektedir ve toplamı:" +
                toplam);



    }

}
