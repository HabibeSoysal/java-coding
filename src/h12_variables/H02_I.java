package h12_variables;

import java.util.Locale;
import java.util.Scanner;

public class H02_I {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
Ornek: gun=Pazar output = “Hafta sonu”
gun=Sali output = “Hafta ici”
*** String icin equals method’unu kullanin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir gün giriniz");
        String gün=scan.next().toLowerCase();

        if(gün.equals("pazar")){
            System.out.println("hafta sonu");
        }else if (gün.equals("pazartesi") || gün.equals("salı")
                ||gün.equals("carsamba") || gün.equals("persembe")|| gün.equals("cuma")){
            System.out.println("Haftaiçi");
        }else if (gün.equals("pazar")|| gün.equals("cumartesi")){
            System.out.println("Haftasonu");
        }else{
            System.out.println("yanlış gün girişi");
        }


    }
}
