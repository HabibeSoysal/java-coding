package day19_scope;

public class C03_ClassVarıables {

    public static void main(String[] args) {
        /*
        farklı bir classta calısrken herhangı bır class adını yazıp noktaya basarsak statıc
         adını yazdıgımız class takı tum statıc class uyelerını görebılır ve kullanabılırız
         */
        C02_StatıcVarıables.staticMethod();//20
        System.out.println(C02_StatıcVarıables.statıcSayı);//10
        System.out.println(C02_StatıcVarıables.degersızStatıcVar);//
        /*
        class level varıable lara degere atayıp atamamak bize kalmıstır
        istersek yaparız ıstemezsek yapmayızeger degere aatamıssak java atadıgımız o degerı kabul eder.
        deger atamazsak o zmn java  bu vvarıable lara default bır deger ataması yapar
        int için sayısal degerelr ıcın 0, String degerler ıcın nul, boolean ıcın false, char ıcın " " yazdırır.

         */
        /*
        baska class takı istance varıable lara obje olusturarak ulasabılrız
            */
        C02_StatıcVarıables obje1=new C02_StatıcVarıables();
        obje1.staticOlmayanMethod();//10. bu method ıcınde statık sayı=20 oldu

        System.out.println(obje1.isim); //Mehmet
        System.out.println(obje1.degersızInstanceVar);//default deger, int ldugu icin 0






    }
}
