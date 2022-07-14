package h21_calışmalar;

import java.util.Scanner;

public class H21_01calışmalar {
    public static void main(String[] args) {
        /*
        ) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
olmadigini yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle ve harf  giriniz");
        String cümle=scan.nextLine();
        char harf=scan.next().charAt(0);

        if (cümle.indexOf(harf)==-1) {
            System.out.println("girilen harf cümlede yok");

        }else{
            System.out.println("girilen harf cümlede var");





        }





    }
}
