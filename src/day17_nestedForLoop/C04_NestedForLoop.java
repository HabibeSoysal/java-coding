package day17_nestedForLoop;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        VErieln inputa göre * lardan oluşan bir üçgen oluşturun
        input =4 ise
        *
        * *
        * * *
        * * * *

         */

        int input=6;
        for (int i = 0; i<=input ; i++) {
            for (int j =1; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println("");//alt satıra geçmesi için 2. loop un dışına yapıyoruz
        }












    }
}
