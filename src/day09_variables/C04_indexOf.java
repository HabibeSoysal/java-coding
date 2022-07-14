package day09_variables;

import java.util.Locale;

public class C04_indexOf {
    public static void main(String[] args) {
        /*
        Soru)2Kullanicidan bir cumle isteyin. CUmle “buyuk” harf iceriyorsa tum cumleyi buyuk harf olarak, “kucuk” kelimesi ice
         */
        String cumle = "Java kolay,dunya büyük";
        cumle = cumle.toLowerCase();


        if (cumle.contains("buyuk") && cumle.contains("kucuk")) {
            System.out.println("Karar ver büyük mu kucuk mu yazdırayım");
        } else if (cumle.contains("kuyuk")) {
            System.out.println(cumle.toLowerCase());

        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        } else {
        }
    }
}