package day010_variables;

public class H01_Manip {
    public static void main(String[] args) {
        /*
        Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” String’ini “Java
ogrenmek cok guzel.” sekline getirin
         */

        String cümle="Java ogrenmek123 Cok guzel@";
        System.out.println(cümle.replaceAll("\\d","").replace("@",""));


    }
}
