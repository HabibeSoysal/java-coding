package h12_variables;

import java.util.Scanner;

public class H08_C {
    public static void main(String[] args) {
        /*
        u 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana
“Eskenar degil” yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 tamsayı girişi yapınız ");
        int uc1= scan.nextInt();
        int uc2=scan.nextInt();
        int uc3=scan.nextInt();

        if (uc1==uc2 && uc2==uc3){
            System.out.println("Eskenar Ücgen");
        }else {
            System.out.println("Eskenar değildir");
        }



    }
}
