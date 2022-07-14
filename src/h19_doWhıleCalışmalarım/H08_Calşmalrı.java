package h19_doWhıleCalışmalarım;

public class H08_Calşmalrı {
    public static void main(String[] args) {

        int bas = 100, bit = 0;
        int sayılarAdet = 0;
        int sayılarToplam = 0;
        for (int i = bas; i >= bit; i--) {
            if (i % 13 == 0) {
                System.out.print(i+",");
                sayılarToplam += i;
                sayılarAdet++;
            }
        } System.out.print(" ");
        System.out.print("13'e bölünen toplam " + sayılarAdet + " adet sayı vardır ve bunların toplamı:" + sayılarToplam);

    }
}

