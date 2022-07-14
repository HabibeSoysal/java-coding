package day21_arrays;

import java.util.Scanner;

public class C03_Arrays {
    public static void main(String[] args) {
        /*
        Soru 3- kullanıcıdan aldıgınız Verilen bir array’in istenen bir elemani icerip icermedigini kontrol edip,
         bize true veya false sonucu donen bir method olusturun.
         */
String []isimler={"başak","nurullah","fatih","adem","enes"};
        Scanner scan = new Scanner(System.in);
        System.out.println("aradıgınız ismi yazınız");
        String arananIsim=scan.nextLine();
boolean sonuc=contain(isimler,arananIsim);
    if (sonuc){
        System.out.println("girilen isim listede var");
    }else {
        System.out.println("girilen isim listede yok");
    }

    }

    public static boolean contain(String[] isimler, String arananIsim) {
        boolean sonucMEthod=false;
        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].equalsIgnoreCase(arananIsim)){
                sonucMEthod=true;
            }

        }

                return sonucMEthod;



    }
}
