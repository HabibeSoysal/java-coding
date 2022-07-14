package H14_calısma;

import java.util.Locale;

public class H12_S4m {
    public static void main(String[] args) {
        /*
        Kullanicidan ismini,soyismini ve bosluk birakmadan 16 hane olarak kredi karti numarasini alin
        isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde,
        KK numarasini ise 4 rakamlik 4 blok olacak sekilde duzelten 2 method yazin,ve programda kullanabilmek
        icin duzenlenmis hallerini geri dondurun
        */
H14_S2.toplamHesapla();
        String isim="Zeynep";
        String soyIsim="demirtaş";
        String kKNo="1234567891234567";

        System.out.println(kullanıcıAdı(isim,soyIsim));
        System.out.println(krediKartNo(kKNo));
    }

    public static String kullanıcıAdı(String isim,String soyIsim) {
        String yeniIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        String yeniSoyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase();

        return yeniIsim+ " "+yeniSoyIsim;
    }
    public static String krediKartNo(String kKNo) {
        String yeniKartNo=kKNo.substring(0,4)+ " " +kKNo.substring(4,8)+" "
                 +kKNo.substring(8,12)+" "+kKNo.substring(12,16);
        return yeniKartNo;

    }
}