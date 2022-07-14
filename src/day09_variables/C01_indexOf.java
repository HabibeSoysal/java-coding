package day09_variables;

public class C01_indexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";
        System.out.println(str.indexOf("g"));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf("j"));//-1 yok demek
        System.out.println(str.indexOf("mek"));//harf gibi algılar kacıncı satırdaysa onu veir

        //istediğimiz indeksten kontrol etmek istersek
        //ki paametreli kullanalım
        System.out.println(str.indexOf("g",(6+1)));
//yukarıdaki str da 2. ve 3. e nin indexleri bulun

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);
        if (ikincie==-1) {
            System.out.println("verilen str da ikinci e yok");
        }else{

        }   int ucuncue=str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
            System.out.println("verilen str da 3. e yok");

        }    else{
            System.out.println("verilen str da 3. e nin index:"+ ucuncue);
        }



    }
}
