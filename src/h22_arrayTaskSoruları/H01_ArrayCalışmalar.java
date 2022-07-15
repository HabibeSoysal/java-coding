package h22_arrayTaskSoruları;

import java.util.Arrays;
import java.util.Scanner;

public class H01_ArrayCalışmalar {
    public static void main(String[] args) {

        /*
            Problem Tanımı :
            kullanıcıdan 5 elemanlı bir dizi oluşturup tek
            elemanları 0 ile, çift elemanları 1 değiştirip yazdıran bir method yazınız.
            */
        int[] numbers={9,7,6,2,4};
        tekCiftDegiştir(numbers);
    }
    private static void tekCiftDegiştir(int[] numbers) {
        int [] Eleman= new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0){
                Eleman[i]=1;
            }else{
                Eleman[i]=0;
            }
        }
        System.out.println(Arrays.toString(Eleman));
    }
}
