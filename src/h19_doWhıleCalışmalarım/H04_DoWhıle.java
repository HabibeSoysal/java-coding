package h19_doWhıleCalışmalarım;

import java.util.Scanner;

public class H04_DoWhıle {
    public static void main(String[] args) {
        /*
        Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0’a basmasini soyleyin.
        Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi
        giremezsiniz” yazdirip basa donun
        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi
        girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        int input=0,pozitifSayılar=0,pozitifSayıAdedi=0,negativeSayiAdet=0;

        do {
            System.out.println("Lütfen toplamak üzere pozitif sayılar girin");
            input= scan.nextInt();
            if (input>0){
                pozitifSayılar+=input;
                pozitifSayıAdedi++;
            } else if (input<0) {
                System.out.println("You can't enter negatıve point");
            }

        }while (input!=0);
        System.out.println(pozitifSayıAdedi + " adet sayı girdiniz ve toplamlar:" + pozitifSayılar);
        System.out.println(negativeSayiAdet + " adet negatıve sayı girdiniz ve işleme dahil edilmemiştir" );





    }
}
