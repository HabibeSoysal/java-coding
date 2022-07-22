package day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        /*
        Verilen string deki kullanılan harfleri tekrarsız olarak yazdırıp
        kelimede kullanılan farklı harf sayısını veren bir metot yazınız

         */

        String input="Taka Tuka";
        tekrarsızYap(input);
    }
    public static void tekrarsızYap(String input) {
    String benzersizInput="";

    String işlenecekKelime=input.replaceAll("\\W","");//TakaTuka
        System.out.print(işlenecekKelime.substring(0,1));//T
        benzersizInput+=işlenecekKelime.substring(0,1);//T

        for (int i =1; i <işlenecekKelime.length(); i++) {

            if (!benzersizInput.contains(işlenecekKelime.substring(i,i+1))){
                System.out.print(", "+ işlenecekKelime.substring(i,i+1));
                benzersizInput+=işlenecekKelime.substring(i,i+1);
            }
        }
        System.out.println("");
        System.out.println("input:"+input);
        System.out.println("benzersizInput = " + benzersizInput);
        System.out.println("Cümlede kullanılan harf sayısı : " + benzersizInput);

    }

    public static class C06_NestedForLoop {
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
}
