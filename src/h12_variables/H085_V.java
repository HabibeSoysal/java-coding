package h12_variables;

import java.util.Scanner;

public class H085_V {
    public static void main(String[] args) {
         /*
        Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
olmadigini yazdirin
         */

        String str="java Güzeldir";
       char ch=str.charAt(0);

       if (ch>='a' && ch<='z'  || ch>='A' && ch<='Z'){

           System.out.println("harfir");
       }else{
           System.out.println("harf deildir");
       }






    }
}
