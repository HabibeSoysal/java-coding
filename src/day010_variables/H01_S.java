package day010_variables;

public class H01_S {
    public static void main(String[] args) {
        /*
        Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
olmadigini yazdirin
         */
        String cümle="Habibe ilk güne göre daha iyisin";
        String harf="b";


        if (cümle.indexOf("b")==-1){
            System.out.println("Verilen harf mevcut değil");
        }else {
            System.out.println("Verilen harf mevcut");
        }




    }
}
