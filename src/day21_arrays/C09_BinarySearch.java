package day21_arrays;

import java.util.Arrays;

public class C09_BinarySearch {
    public static void main(String[] args) {
        /*
        Binary search te aradıgımız elemntın ındezinin dondurur
        Ya aradıgımız element array de yoksa?
        String de indeks of ta bize olmayan elementler için -1 döndürüyordu
       Aradıgımız elemnt ARRAY DEYOKSA JAVADA HEM OLMAdıgını
       hem de olsaydı nerede olacagını bıze döndürür
       olmadıgını ifade için - kullanır
       olsaydı nerde olacagını belirtmek için sıralama kullanır
         */
        int [] sayilar={3,7,15,4,27,13};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.binarySearch(sayilar,4));//1
        System.out.println(Arrays.binarySearch(sayilar,15));//4

        System.out.println(Arrays.binarySearch(sayilar,11));//-5
        System.out.println(Arrays.binarySearch(sayilar,6));//-3
        System.out.println(Arrays.binarySearch(sayilar,-100));//-1



    }
}
