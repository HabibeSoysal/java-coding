package day19_scope;

public class C02_StatıcVarıables {
    static int statıcSayı=10;
    String isim="Memet";
    static int degersızStatıcVar;
    int degersızInstanceVar;


    public static void main(String[] args) {
        /*
        bir varıable statıc olusturulduysa objeler ıcın class icingecerlidir
         */
        System.out.println(statıcSayı);//10
        staticMethod();
        statıcSayı=12;
        System.out.println(statıcSayı);//12
        C02_StatıcVarıables obje1=new C02_StatıcVarıables();
        obje1.staticOlmayanMethod();
        System.out.println(statıcSayı);//20
        /* ınsatance bir varıable ın degerını bulak ıocı objenın lusturulmasndan ıtıbarae ıstenen satıra<kadar takki etmeliyız
        statıc varıable da ıse class ın en basından beri baslayar
         ISTENEN SATIRA KADR KODU TAKIP EDİP STATIK VARIABLE IN SON DEGERINI blmamız gerekır
         */
    }

    public static void  staticMethod(){
        System.out.println(statıcSayı);//10

    }
    public  void  staticOlmayanMethod(){
        System.out.println(statıcSayı);//12
        statıcSayı=20;
        /*
        statıc varıable class ICERISINDEN her yerden ulaşılabılır
        statıc veya olmasın her sekilde statıc varıabla rı görebilir ve değiştirirler
        farklı mthodaqarda statıc varıable ın hangi degeri alacagını bılmek ıstıyosak clas
        ınbaşından ıtıbaren kodun calısmasını takıp etmelıyız
        method ne zmn cagrılırsa o ankı statc varıable degerını methodda kullanabılırız
         */
    }

}
