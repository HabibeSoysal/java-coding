package day20_arrays;

import java.util.Arrays;

public class C03_LEngth {
    public static void main(String[] args) {

        int sayilar[]={1,2,3};
        String harfler[]=new String[4];

        System.out.println("sayilar arrayinin uzunlugu:" + sayilar.length);//3
        System.out.println("harfler arrayinin uzunlugu:" + harfler.length);//4
        System.out.println(Arrays.toString(harfler));
        // harflerelementının son harfını yazdıralım

        System.out.println(harfler[harfler.length-1]);
        System.out.println(harfler[5]);// olmadıgı ıcın array ındexx out of bounds exceptıon







    }
}
