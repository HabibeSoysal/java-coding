package day21_arrays;

public class C02_Arrays2 {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun

         */
        String[] isimler={"Erdal","Onur","Habibe","Mehmet","Hayrullah","Mihrican"};
        uzunMuDegilMi(isimler);

    }

    public static void uzunMuDegilMi(String[] isimler) {
        String enUzunKelime = isimler[0];
        String enKısaKelimeler = isimler[0];
        for (int i = 1; i < isimler.length; i++) {

            if (isimler[i].length() > enUzunKelime.length()) {
                enUzunKelime = isimler[i];
            }
            if (isimler[i].length() < enKısaKelimeler.length()) {
                enKısaKelimeler = isimler[i];
            }

        }
        System.out.println("enKısaKelimeler = " + enKısaKelimeler);
        System.out.println("enUzunKelime = " + enUzunKelime);


    }
}
