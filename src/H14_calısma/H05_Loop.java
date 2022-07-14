package H14_calısma;

import java.util.Scanner;

public class H05_Loop {
    public static void main(String[] args) {
        /*
        Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
veya 5”in kati olan sayilari yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 100 den küyük bir tamsayı giriniz");
        int a = scan.nextInt();

        for (int i = 1; i < a; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }

        }
    }
}