package day14_variables;

public class C03_StringManipilatıon {
    public static void main(String[] args) {
        /*
        String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” String’ini “Java
ogrenmek cok guzel.” sekline getirin.
         */

        String str="Java öğrenmek123 Cok guzel@";
        str =str.trim();
        str=str.replaceAll("\\d","");
        str=str.replace("@","");
        str=str.replace("C","c");
        str=str+".";

        System.out.println(str);

    }
}
