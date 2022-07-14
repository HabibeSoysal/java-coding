package h12_variables;

import java.util.Locale;
import java.util.Scanner;

public class H12_S1 {
    public static void main(String[] args) {

/*
) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
birer degisken olusturup adim adim widening yapin ve yazdirin

 */
        byte a=15;
        short b =a;
        System.out.println(b);
        int c=b;
        System.out.println(c);
        long f=c;
        System.out.println(f);
        float d=f;
        System.out.println(d);
        double e=d;
        System.out.println(e);

/*
) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
31 EKIM 202
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bi gün ismi giriniz");
        String gün=scan.next().toLowerCase();

        if (gün.equals("pazar")){
            System.out.println("Hristiyanlar için kutsal gün");
        }else if (gün.equals("cuma")){
            System.out.println("müslümanlar için kutsal gün");
        }else if (gün.equals("cumartesi")){
            System.out.println("Yahudiler için kutsal gün");
        }else if(gün.equals("pazartesi")||gün.equals("salı")||gün.equals("carsamba")||gün.equals("persembe")){
            System.out.println("Normal günler");
        }else{
            System.out.println("Yanlış gün ismi");
        }

    }

}
