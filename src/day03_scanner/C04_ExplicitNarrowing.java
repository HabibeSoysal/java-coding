package day03_scanner;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1=130;
        byte sayi2= (byte) sayi1;
        System.out.println(sayi2);//50

        /*
        GEniş data türündeki degeri, dar data türündeki variable'a atamak isterseniz
        Java sizin geniş data türündeki degerin, dar data türünün sınırlarında uyup uymayacagını
        çalışstırılana kadar risk atmaz. Java da
        Riski sıdfıra indirmek iöin burada bir sorun olursa sorunu
        data türünü yazmamız yetrlidir.
        Bu riski üstlendiğinizde 3 durum söz konusu
        1.bizim degerimiz dar kalıp degerlerine uygun olursa ahiç bi kayıp olmadan caat olur
        2.double bir sayıyı int cast etmek durmlarında data kayıpları yaşanabilir.
        3.Geniş kalıptan degeri dar kalıba koyduguuzda sınırları asan durumlarda veri başkalaşabilir.

        */

    }
}
