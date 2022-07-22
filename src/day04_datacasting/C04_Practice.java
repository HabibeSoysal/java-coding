package day04_datacasting;

import java.sql.SQLOutput;

public class C04_Practice {
    public static void main(String[] args) {

        int yaş = 33;
        double boy = 1.70;
        System.out.println("yaş :" + yaş);
        System.out.println("boy :" + boy);

        int yaşım = 33;
        int melih = yaşım;
        System.out.println("yaşım = " + yaşım);
        System.out.println("melih = " + melih);

        int yıl = 2022, ay = 6, gun = 20;
        System.out.println("yıl = " + yıl);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);


        yıl = 2032;
        System.out.println("update yıl:" + yıl);


    }
}
