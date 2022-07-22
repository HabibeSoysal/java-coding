package day10_variables;

import java.util.Scanner;

public class C01_Var {
    public static void main(String[] args) {
        /*
        Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
    kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
    - Girilen kelime cumlede kullanilmamis.
    - Girilen kelime cumlede 1 kere kullanilmis.
    - Girilen kelime cumlede 1’den fazla kullanilmis
         */

       String cümle="Java öğren, yeni program ile yeni bi sayfa aç";
       String kelime="habibe";

       int ilkKul=cümle.indexOf(kelime);
       int ikinciKul=cümle.indexOf("ilkKul",ilkKul+1);
       int üçüncüKul=cümle.indexOf("ikinciKul",ikinciKul+1);

       if (ilkKul==-1) {
           System.out.println("girilen kelime cümlede kullanılmamış");
       }else if (ikinciKul==-1){
           System.out.println("girilen kelime cümlede 1 kez kullanılmış");
       }else{
           System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis");
       }

    }
}
