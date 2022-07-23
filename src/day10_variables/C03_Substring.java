package day10_variables;

import java.net.DatagramSocket;

public class C03_Substring {
    public static void main(String[] args) {

        String soyisim="Karafnil";
        String isim="Suleyman";
        String krediNo="1234 5678 9112 3456";

        System.out.println(isim.substring(3));
        System.out.println(soyisim.substring((soyisim.length()-3)));

        //isim ve soyisin büyük harf, geriye kalan *
        //kredi kartının ilk 4 rakaı görünsün, geriye *

        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String geriye=isim.substring(1).replaceAll("\\w","*");
        String soyisimIlk=soyisim.substring(0,1).toUpperCase();
        String geriyeKl=soyisim.substring((1)).replaceAll("\\w","*");
String kNoİlk=krediNo.substring(0,4);
String kKGeriye=krediNo.substring(4).replaceAll("\\d","*");

        System.out.print (isimIlkHarf+geriye+" "+soyisimIlk+geriyeKl);
        System.out.println(" ");
        System.out.println(kNoİlk+kKGeriye);













    }
}
