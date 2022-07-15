package h22_arrayTaskSoruları;

import java.util.Arrays;

public class H04_calışmalar {
    public static void main(String[] args) {
        // Bir dizinin değerlerini toplamak için bir Java programı yazın.

        int []  numbers={8,9,6,36,45,9};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];

        }
        System.out.println("sum = " + sum);


    }
}
