package day010_variables;

public class H02_S {
    public static void main(String[] args) {
        /*
        Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
- Girilen kelime cumlede kullanilmamis.
- Girilen kelime cumlede 1 kere kullanilmis.
- Girilen kelime cumlede 1’den fazla kullanilmis
         */
        String cümle="Habibe basarılı olabileceğini düşünüyorum";
        String kelime="daha";

        int ilk=cümle.indexOf("kelime");
        int ikin=cümle.indexOf("kelime,ilk+1");
        if (ilk==-1){
            System.out.println("Girilden kelime cümlede kullanılmamış");
        } else if (ikin==-1) {
            System.out.println("Girilen kelime 1 kez kullanılmış");
        }else {
            System.out.println("Girilen kelime birden fazla kulla");
        }


    }
}
