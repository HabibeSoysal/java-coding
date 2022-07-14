package day21_arrays;

import java.util.Arrays;

public class C06_ArrayeElamanEkleme {
    public static void main(String[] args) {
        //C05 deki methodu kullanarak arraye eleman ekleme

        String[] yakimListesi={"süleyman", "osman"};
        String eklenecekIsim="Talha";

       yakimListesi= C05_Arrays.elementEkle(yakimListesi,eklenecekIsim);
        System.out.println(Arrays.toString(yakimListesi));

    }
}
