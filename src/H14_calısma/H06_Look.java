package H14_calısma;

import java.util.Scanner;

public class H06_Look {
    public static void main(String[] args) {
        /*
        ) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak
girilen sayiya kadar tum sayilari yazdirin. Ancak;
- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
- Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
- Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 100 den küyük bir tamsayı giriniz");
        int a = scan.nextInt();

        for (int i=1; i <a; i++) {
            if(!(i % 3 == 0 || i % 5 ==0)) {
                System.out.print(i + ",");
            }else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("java güzeldir,");
            } else if (i % 3 == 0) {
                System.out.print("java,");
            } else if(i%5==0){
                System.out.print("Güzeldir,");
            }
    }

        }
    }

