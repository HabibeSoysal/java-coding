package day20_arrays;

import java.util.Arrays;

public class C04_ElemanlarıYazdırma {
    public static void main(String[] args) {

        int sayılar[] = {1, 2, 3, 4, 5, 6, 7};//Arayin tamamını yazdıralaım

        System.out.println(Arrays.toString(sayılar));
        //Araın tum elementlerını yazdırın

        for (int i = 0; i < sayılar.length; i++) {

            System.out.print(sayılar[i] + " ");

        }
    }

}
