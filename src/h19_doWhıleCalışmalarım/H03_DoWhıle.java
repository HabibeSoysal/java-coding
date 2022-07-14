package h19_doWhıleCalışmalarım;

import java.util.Scanner;

public class H03_DoWhıle {
    public static void main(String[] args) {
        /*
        Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0’a basmasini soyleyin.
        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve
         girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */
        int i = 0;
        int pozıtıfSayılar = 0;
        int pozitifSayıAdet = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("lütfen toplamak üzere pozitif sayılar girin");
             i = scan.nextInt();
            if (i > 0) {
                pozıtıfSayılar += i;
                pozitifSayıAdet++;

            }
        }while (i != 0) ;
            System.out.print(pozitifSayıAdet + " adet sayıgirdiniz, toplamları :" + pozıtıfSayılar);

    }
}
