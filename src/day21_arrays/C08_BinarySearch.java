package day21_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C08_BinarySearch {
    public static void main(String[] args) {
        /*
        Binary search eleman aramanın kısayoludur ancak binary search ün çalışması için önce array ın sıralıo hale getirilmesi gerekir
        eger sıralama yapmadan bınary search yaparsanız sonucu bulamahyabilir veya yanlıs bulabilir
         */

        String[]harfler={"Y","B","D","G","O","A"};

        String arananHarf="Y";


        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        C03_Arrays.contain(harfler,arananHarf);
      //Binary search bize aradıgımız elemanın indexini döndürür.
        //Arraay sıralı olmadıgı ıcın arama sonucunu dogru bulamayabilir
       // emin olmak için sort yapmamız gerekiyor

Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));



    }
}
