package M14_variables;

import static M14_variables.C03_MethodCreatıon4.ismiGizle;

public class C04_MethodCreatıonReturnType {
    /*
    Verilen isim ve soyismi ilk harfi büyük, geriye kalanları * olacak sek değiştirip
    bize bu halini döndüren bir method olusturun
    not:programın ilerleyen kısımlarında isim ve soyismi bu şekilde kullanmak istiyoruz
     */

    public static void main(String[] args) {
        String isim="Enes";
        String soyisim="Bozkurt";

        String gizliIsim=isimGizle(isim,soyisim);
        System.out.println(isim + " " + soyisim); // Enes Bozkurt
        System.out.println(gizliIsim); // E*** B******
}


    public static String isimGizle(String isim, String soyisim) {
        isim= isim.substring(0,1).toUpperCase()
                +isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()
                +soyisim.substring(1).replaceAll("\\w","*");
        return isim+" "+soyisim;
    }
}
