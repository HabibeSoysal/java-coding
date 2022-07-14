package h21_calışmalar;

import java.util.Scanner;

public class H01_calışma {
    public static void main(String[] args) {
        /*Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
- Girilen kelime cumlede kullanilmamis.
- Girilen kelime cumlede 1 kere kullanilmis.
- Girilen kelime cumlede 1’den fazla kullanilmis
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle ve kelime  giriniz");
        String cümle=scan.nextLine();
        String kelime=scan.next();

        int ilkKelime=cümle.indexOf(kelime);
        int ikinciKelime=cümle.indexOf(kelime,ilkKelime+1);
        if (ilkKelime==-1){
            System.out.println("girilen kelime cümlede kullanılmamış");
        } else if (ikinciKelime==-1) {
            System.out.println("girilen kelime 1 kez kullanılmış");

        }else {
            System.out.println("girilen kelime birden fazla kullanılmış");
        }


    }
}
