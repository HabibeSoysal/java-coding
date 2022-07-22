package day10_variables;

public class C10_ndexOf {
    public static void main(String[] args) {

        String str="Java ögrenmek çok güzel";
        System.out.println(str.indexOf("o"));//5
        System.out.println(str.indexOf("g"));//6
        System.out.println(str.indexOf("t"));//bana int döndürür


        String str5="hggjkjlkghjklşhgdtgyuıjokpli";
        System.out.println(str5.indexOf("q"));
        if (str5.indexOf("=")==-1) {
            System.out.println("istenen karakter kulanılmamış");
        } else {
            System.out.println("str5 de istenen karakter kullanılmış");
        }

    }
}
