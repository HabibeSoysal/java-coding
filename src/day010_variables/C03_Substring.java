package day010_variables;

import java.net.DatagramSocket;

public class C03_Substring {
    public static void main(String[] args) {

        String soyisim="Karafnil";
        String isim="uleyman;";

        System.out.println(isim.substring(3));
        System.out.println(soyisim.substring((soyisim.length()-3)));

        //isim ve soyisin büyük harf, geriye kalan *
        //kredi kartının ilk 4 rakaı görünsün, geriye *

        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String geriye=isim.substring(1).replaceAll("\\w","*");
        System.out.println();













    }
}
