package day010_variables;

import java.util.Scanner;

public class H11_S5 {
    public static void main(String[] args) {
        /*Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

         */

        String input="Java";
        String tersinput=
                input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println(tersinput);









    }
}
