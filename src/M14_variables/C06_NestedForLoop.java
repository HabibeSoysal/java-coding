package M14_variables;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        bazen tek degisken sorunu cözmeye yetmez
        *
        **
        ***
        ****
        *****
        3 tane * yaz
         */

        for (int i = 1; i <=3; i++) {
            System.out.print(" * ");
    }
        System.out.print(" ");

        for (int i = 1; i <=4; i++) {//yan yana 4 yıldız yaz

        System.out.print(" * ");

    }   System.out.println(" ");
//bu tür durumlarda nested loop kullanmak gerekir

        for (int i = 1; i <=5; i++) {                   //fo
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");


        }   }
}
