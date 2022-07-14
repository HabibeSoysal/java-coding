package day21_arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
       //Soru 5- Verilen bir array’e yeni bir element ekleyen bir metod olusturun

        String[] sınıfList={"Ali Can"};
        String eklenecekIsim="Murat Babayiğit";

   sınıfList=elementEkle(sınıfList,eklenecekIsim);
        System.out.println(Arrays.toString(sınıfList));


    }

    public static String[] elementEkle(String[] sınıfList, String eklenecekIsim) {
        String[] yeniSınıfListesi=new String[sınıfList.length+1];//null, null
        for (int i = 0; i <sınıfList.length ; i++) {
            yeniSınıfListesi[i]=sınıfList[i];


        }yeniSınıfListesi[yeniSınıfListesi.length-1]=eklenecekIsim;
//son indexe ise eklenecek ismi atADIM

        return yeniSınıfListesi;
    }
}
