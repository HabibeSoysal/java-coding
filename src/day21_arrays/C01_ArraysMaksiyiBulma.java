package day21_arrays;

public class C01_ArraysMaksiyiBulma {
    public static void main(String[] args) {
/*
Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
 */
int []sayilar={3,5,7,1,4,9,5,2};
maxSayıyıYazdır(sayilar);

    }

    public static void maxSayıyıYazdır(int[] sayilar) {

        int maxSayi=sayilar[0];//burada 0 dan kontrol ettıgımız ıcın i yi 1 den başlatıyoruz
        for (int i = 1; i <sayilar.length ; i++) {
            if (sayilar [i]>maxSayi) {
                maxSayi=sayilar[i];

            }

        }

        System.out.println("Array deki en büyük sayi :" + maxSayi);






    }
}
