package h20_calışmalaar;

import java.util.Scanner;

public class H01_Calışmalar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Cümleyi Girin :");
        String cumle = scan.nextLine();
        System.out.print("Aratmak İstediğiniz Kelimeyi Girin :");
        String kelime = scan.nextLine();

        int cumleuzun = cumle.length();
        int kelimeuzun = kelime.length();
        int toplam = 0;
        for (int i = 0; i <= cumleuzun - kelimeuzun; i++) {
            String kes = cumle.substring(i, i + kelimeuzun);

                if (kes.equals(kelime)) toplam++;
            }
            System.out.println(kelime + " Cümlede  " + toplam + " adet vardır");
    }
}
