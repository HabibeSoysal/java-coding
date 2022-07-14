package h19_doWhıleCalışmalarım;

import java.util.Scanner;

public class H06_DoWhıle {
    public static void main(String[] args) {
        /*
         Kullanicidan toplamak icin sayi isteyin ve
         toplam 500’e ulasincaya kadar devam istemeyi ettirin.
        Toplam 500’e ulastiginda veya gectiginde toplami ve
        kac sayi girildigini yazdiri
         */

        int sayi = 0, sayiToplam = 0, sayiAdet = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("lütfen toplamak üzere sayılar giriniz");
            sayi = scan.nextInt();
            sayiToplam+=sayi;
                    sayiAdet++;

        } while (sayi<=500);
             if (sayi<=500){
                 System.out.println("girmeye devam ediniz");
             }else{
                 System.out.println(sayiAdet + " adet sayi girdiniz ve toplamları:" + sayiToplam);
             }


    }
}

