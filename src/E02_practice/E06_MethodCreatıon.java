package E02_practice;

import java.util.Scanner;

public class E06_MethodCreatıon {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str=scan.nextLine().toLowerCase();

        System.out.println(xyzVarMi(str));
    }
    private static boolean xyzVarMi(String str) {
        if (str.contains("xyz")){
            return true;
        }else
            return false;
    }
}
