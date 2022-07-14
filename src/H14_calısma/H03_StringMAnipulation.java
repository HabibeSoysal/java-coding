package H14_calısma;

import java.util.Scanner;

public class H03_StringMAnipulation {
    public static void main(String[] args) {
        /*
        Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
yazdirin
isim-soyisim : M***** B*******
kart no : **** **** **** 1234

         */
        String isim="habibe";
        String soyIsim="soysal";
        String kNo="6512 4126 4555 2585";

        String isimILkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalan=isim.substring(1).replaceAll("\\w","*");

        String soyIsimILkHarf=soyIsim.substring(0,1).toUpperCase();
        String soyİsimGeriyeKalan=soyIsim.substring(1).replaceAll("\\w","*");

        String kartSonNo=kNo.substring(15,19);
        String kNoGeriyeKlaan="**** **** **** ";
        System.out.println(isimILkHarf+isimGeriyeKalan+" "+soyIsimILkHarf+soyİsimGeriyeKalan+""+"\n"+kNoGeriyeKlaan+kartSonNo);










    }
}
