package h22_arrayTaskSoruları;

import java.util.Arrays;

public class H3_Calışmalarım {
    public static void main(String[] args) {
        /*
            Problem Tanımı :
            farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
            yazdıran parametreli method yazınız
             */
        int []notlar={6,4,3,5};
        ortalamaYaz(notlar);
    }
    private static void ortalamaYaz(int[] notlar) {
       int sum=0;
        for (int i =0; i <notlar.length; i++) {
           sum+=notlar[i];
        }
        int notOrtalama=sum/2;
        System.out.println(notOrtalama);

    }
}
