package ha18_Loop;

import java.util.Scanner;

public class H01_Loop {
    public static void main(String[] args) {
        // Ekrana 10 kez “Java guzeldir” yazdirin

        String str="Java güzeldir";
        for (int i = 1; i <=10; i++) {
            System.out.println(str+" ");
        }
//10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin


        int a=10, b=30;
        for (int i = 10; i <=29 ; i++) {
            System.out.print(i+",");
        }
        System.out.println(30);
/*
100’den baslayarak 50’ye(dahil) kadar olan sayilari aralarinda virgul olarak ayni satirda
yazdirin
 */

        for (int i =100; i >=49; i--) {
            System.out.print(i+" ,");
        }
        System.out.println(50);
        /*
        Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
kati olan sayilari yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("100'den küçük bir tamsayı giriniz");
        int x=scan.nextInt();
        for (int i = 1; i <=x; i++) {
            if (i%3==0) {
                System.out.print(i + " ");
            }
        }
        /*
        Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
veya 5”in kati olan sayilari yazdirin.
         */
        System.out.println(" ");
        System.out.println("100'den küçük bir tamsayı giriniz");
        int y = scan.nextInt();
        for (int i = 1; i <= y; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
      /*
      Soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak
girilen sayiya kadar tum sayilari yazdirin. Ancak;
- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
- Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
- Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin
       */
        System.out.println(" ");

        System.out.println("100'den küçük bir samsayı giriniz");
        int z=scan.nextInt();
        javaNot(z);
}
    public static void javaNot(int z) {
        if (z%5==0 && z%3==0){
            System.out.println("Java Güzeldir");
        } else if (z%3==0){
            System.out.println("Java");
        }else if (z%5==0){
            System.out.println("Güzeldir");
        }else
            System.out.println("yanlış cevap");

    }

}