package day20_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int sayilar[]=new int[3];
        System.out.println(sayilar);//[I@19dfb72a--- 0 0 0
        System.out.println(Arrays.toString(sayilar));

        sayilar[0]=5;
        sayilar[1]=3;
        sayilar[2]=12;
        System.out.println(Arrays.toString(sayilar));

        String siniflist[]={"ali","ayse","ahmet"};
        System.out.println(Arrays.toString(siniflist));

        siniflist[1]="Hasan";
        System.out.println(Arrays.toString(siniflist));

        System.out.println(siniflist[1]);
        System.out.println(siniflist[0]);//ALİ



    }
}
