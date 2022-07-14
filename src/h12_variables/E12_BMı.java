package h12_variables;

import java.util.Scanner;

public class E12_BMı {
    public static void main(String[] args) {
        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kilonuzu(KG) giriniz");
        double kg=scan.nextDouble();

        System.out.println("Lütfen boyunuzu(m.) giriniz");
        double boy=scan.nextDouble();

        boy/=100;
        double kitle=kg/(boy*boy);

        System.out.println("kitle = " + kitle);
        scan.close();







    }
}
