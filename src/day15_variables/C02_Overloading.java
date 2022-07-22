package day15_variables;

import day13_variables.C01_ReturnMetodu;

public class C02_Overloading {
    public static void main(String[] args) {
        /*
        javada olusturdugumuz metotların isminin yaptıgı işev ile uyumlu olmasını isteriz
        mesela bir stringin bir bölümünü almak için java2 adet substring metodu veya verilen string deki
        bazı parcaları yenileriyle degistirmek için 2 adet replace() metodu var

        java aynı isime birden fazla metot varsa hngisinin kullanılacagına
        parametre sayısı ve parametrelerin data türüne göre karar verir
                 */
        String str="Bu java öğrenilecek baska yolu yok";
        str.substring(2);
        str.substring(2,4);
        str.replace('c','v');
        str.replace("j","h");
        C01_ReturnMetodu.carpGetir(6,65);

    }
}
