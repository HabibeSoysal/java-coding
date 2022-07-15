package h22_arrayTaskSoruları;

import java.util.Arrays;
import java.util.Enumeration;

public class H02_Array {
    public static void main(String[] args) {
          /*
            Problem Tanımı:
            plusOne adında bir method oluşturun.
            Parametre olarak int Array alır.
            Rakamlar pozitif olmalıdır ve ilk basamak 0 olamaz.
            Yazdığınız rakamlar bir bütün olarak ele alınacaktır.
            Orta basamağa 1 ekleyin.

            Örnek 1:
            Girdi:: [1,2,3]
            Çıktı: [1,3,3]
            Açıklama:Bu sayı dizisi 133'ü temsil eder.

            */
        int[] counts={79,25,3,12,7};
        plusOne(counts);
    }

    private static void plusOne(int[] counts) {
        int[] yeniRakam= new int[counts.length];

        for (int i = 0; i < counts.length; i++) {
            if (counts[0]!=0){
                if(i==(counts.length/2)){
                    yeniRakam[i]=counts[i]+1;
                }else{
                    yeniRakam[i]=counts[i];
                }
            }

        }
        System.out.println(Arrays.toString(yeniRakam));





    }
}
