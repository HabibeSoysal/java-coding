package day10_variables;

import java.util.Scanner;

public class C03_Equalsıgnore {
    public static void main(String[] args) {
        /* Öğrenci derse katılıp katılmak istemediğini sorun

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Derse katılmak ister misiniz?\nEvet mi Hayır mı yazınız");
        String cevap=scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabınız:"+cevap+"derse katılımınız onaylanmıştır");

        }else if (cevap.equalsIgnoreCase("hayır")){

        System.out.println("cevabını:"+cevap+"sonraki derslerimize bekleriz");

         }
         else{
            System.out.println("Lütfen evet veya hayır yazınız");
         }



    }
}
