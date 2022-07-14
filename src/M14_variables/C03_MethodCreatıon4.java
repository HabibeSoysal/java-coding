package M14_variables;

public class C03_MethodCreatıon4 {
    public static void main(String[] args) {
        //ınput olarak verilen isim ve soyismi
        //ilk harfi büyük, geriye kalan harfler * olacak sekilde
        // k**** A**** seklinde yazdıran bir method oluşturalım

        String isim="Enes";
        String  soyIsim="Bozkurt";
        ismiGizle(isim,soyIsim);

    }

    public static void ismiGizle(String isim, String soyIsim) {
       isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
       soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");
       System.out.println(isim + " " + soyIsim);



    }
}
