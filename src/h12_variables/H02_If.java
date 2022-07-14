package h12_variables;

import java.util.Scanner;

public class H02_If {
    public static void main(String[] args) {
        /*
        ) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
isimlerini yazdirin
Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
ilkHarf=S output = “Sali
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen gün isimlerinden birinin ilk harfini giriniz");
        char harf=scan.next().toUpperCase().charAt(0);
        
        if (harf=='p' || harf=='P'){
            System.out.println("Pazartesi||persembe||pazar");
        }else if (harf=='s'|| harf=='S'){
            System.out.println("Günlerden Salı");
        } else if (harf=='c'||harf=='C') {
            System.out.println("Günlerden Carsamba || cuma||cumartesi");
        }else {
            System.out.println("yanlış harf girişi");
        }
        scan.close();


    }

    public static class E14_SwitchCase {
        public static void main(String[] args) {
            /*
        gunleri gösterebilen bir program yazın
        gun Pazartesi veya Sali ise:
        Java dersi gunleri

        gun Persembe veya Cuma ise:
        Selenyum dersi gunleri

        gun carsamba veya cumartesi ise:
        SQL dersi gunleri

        aksi halde: izin gunu
        (if deyimini KULLANMAYIN)
    */
            String gün="Cumartesi";

            switch (gün) {
                case "Pazartesi":
                case "Salı":
                    System.out.println("Java ders");
                    break;
                case "Carsamba":
                case "Cumartesi":
                    System.out.println("Sql Dersi");
                    break;
                case "persembe":
                case "Cuma":
                    System.out.println("Selenyum Dersi");
                    break;
                default:
                    System.out.println("izin Günü");




            }






        }
    }
}
