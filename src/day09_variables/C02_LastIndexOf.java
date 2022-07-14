package day09_variables;

public class C02_LastIndexOf {
    public static void main(String[] args) {
        String cümle="Java cok kolay,Java cok guzel";
        String kelime="java";

        //verilen kelimenin asagıdakı sartlardan uygun olanı yazan bir program yazıznız
        //verilen kelime cümlede klullanılmamış
        //Verilen klelime sadec 1 kez kullanılmış
        //verilen kelime birden fazla kllanılmış

        int kelimeilkIndex=cümle.indexOf(kelime);
        int kelimeSonIndex=cümle.lastIndexOf(kelime);

        if (kelimeilkIndex==-1){
            System.out.println("Verilen kelime kullanılmamış");
        }else if (kelimeilkIndex==kelimeSonIndex){
            System.out.println("verilen kelime 1 kez kullanışlmış");
        }else {
            System.out.println("Verilen kelime birden fazla kullanılmış");
        }










    }
}
