package day17_nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
         Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
asagidaki sekli cizdirin
*
* *
* * *
* * * *
         */

        int input=5;
        for (int i =0; i <=input ; i++) {
            for (int j =1; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        /*
        ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim
tablosu olusturun. Ornek,kullanici 3 girerse,
1 2 3
2 4 6
3 6 9

         */
    int in=6;
;
        for (int i =1; i <=in; i++) {
            for (int j =1; j <=in; j++) {
                System.out.print(i*j+ " ");
            }
            System.out.println(" ");
        }




    }
}
