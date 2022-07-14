package H14_calısma;

public class H05_String4 {
    public static void main(String[] args) {
        //Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdiri
    String isim="nurullah";
    String soyIsim="iyihuylujhj";

        if (isim.length()==soyIsim.length()){
            System.out.println("Girişi yapılan isim ve soyisim birbirine eşit");
        }else if (isim.length()>soyIsim.length()){
            System.out.println("isim:"+isim);
        }else {
            System.out.println("soyIsim :" + soyIsim);
        }
    }
}
