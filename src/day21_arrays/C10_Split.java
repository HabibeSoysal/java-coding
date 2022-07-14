package day21_arrays;

import java.util.Arrays;

public class C10_Split {
    public static void main(String[] args) {
        /*
        bir array metodu degiil  strıng metoduru
        array döndürdüğü için bu kkonuda anlatılıyo
        Split ile herhangi bir stringi istediğimiz sekilde parcalara bölüp bir array haline getiriyoruz

         */
        String str="java ne kadar güzel";
       String[] kelimeler= str.split(" ");
        System.out.println(Arrays.toString(kelimeler));


        String[] kelimelerNe= str.split("ne ");
        System.out.println(Arrays.toString(kelimelerNe));

String[] kelimelerE= str.split("e ");
        System.out.println(Arrays.toString(kelimelerE));

        String[] karakterler= str.split("");
        System.out.println(Arrays.toString(karakterler));




    }
}
