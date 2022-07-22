package day27_constructor;

import day25_constructor.C01_;

public class C01_StaticKeyWord {

static int sayi=10;
int rakam=5;

    public C01_StaticKeyWord() {
        super();
    }

    public static void main(String[] args) {
         /*
        class level'da iki tur variable olusturabiliriz
          static (class) variable
          instance (obje) variable
        static variable'lar tum class'tan kullanilabilirken
        instance olanlar sadece static olmayan method'larda direk  kullanilabilir

        instance variable'lara static method'dan ulasmak isterse
        obje olusturmamiz gerekir.
        instance variable'lar obje variable'i oldgu icin
        herhangi bir satirda instance variable'in degerinin ne oldugunu bulmak icin

        OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir.

        static variable'lar class variable'i oldugu icin
        herhangi bir satirda static variable'in degerini bulmak icin
       CLASSIN BASINDAN itibaren kod incelenmelidir.
         */
        C01_StaticKeyWord obj1=new C01_StaticKeyWord();
        System.out.println("obje1 nin rakam degeri:"+obj1.rakam);
        System.out.println("obje1 nin sayı degeri:"+obj1.sayi);
        obj1.rakam+=1;
        sayi+=1;

        System.out.println("1 artırdıktan sonra obj1 in rakam degeri :" + obj1.rakam);
        System.out.println("1 artırdıktan sonra obj1 in sayı degeri :" + sayi);

C01_StaticKeyWord obj2=new C01_StaticKeyWord();//oluşturulduktan sonra atama yapılmış mı

        System.out.println("obj2 nin rakam degeri:"+obj2.rakam);
        System.out.println("obje2 nin sayı degeri:"+obj2.sayi);//class tan bakacagım sttaic çünkü

        obj2.rakam++;
        obj2.sayi++;

        System.out.println("1 artırdıktan sonra obj2 in rakam degeri :" + obj2.rakam);//6
        System.out.println("1 artırdıktan sonra obj in sayı degeri :" + sayi);//12






    }

}
