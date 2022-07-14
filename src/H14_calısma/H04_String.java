package H14_calısma;

import java.beans.JavaBean;

public class H04_String {
    public static void main(String[] args) {
        /*
        Kullanicidan isim isteyin. Eger
- isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
- isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
- ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin

         */
    String isim= "5858fghj";

    if ( isim.contains("Z") && isim.contains("a")){
        System.out.println("Girdiğiniz isim a ve Z içeriyo");;
    }else if ( isim.contains("a")){
        System.out.println("Girdiğiniz harf a içeriyo");
    }else if(isim.contains("Z")){
        System.out.println("Girdiğiniz isim Z harfi içeriyo");
    }else {
        System.out.println("Şartlara uygun bi isim girmediniz");
    }





    }

}
