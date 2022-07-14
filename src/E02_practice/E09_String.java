package E02_practice;

import java.util.Scanner;

public class E09_String {
    public static void main(String[] args) {
// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.



        String isim="habibe";
        String soyIsim="sosyal";

       if (isim.length()==soyIsim.length()){
           System.out.println("Verilen isim ve soyisim birbirine eşittir");
       } else if (isim.length()>soyIsim.length()) {
           System.out.println("VErilen isim soyisimden daha uzun");

       }else
           System.out.println("Veilen soyisim isimden  daha uzun");


    }
}
