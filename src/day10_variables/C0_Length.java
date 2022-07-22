package day10_variables;

public class C0_Length {
    public static void main(String[] args) {

        String str="Java ögren, işi kap";
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.charAt(str.length()-3));

        /* java da null pointer(işaretleyici) bir degerdegil kaarsınna yazıldığı variable hiçbir deger almadığının isretçisidir

         */

        String str2="";
        System.out.println(str2.length());

        String str3=null;
        System.out.println(str3.length());






    }
}
