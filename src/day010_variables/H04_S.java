package day010_variables;

public class H04_S {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum
cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak
yazdirin, iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor”
yazdirin
         */
        String cümle="Habibe javayı gün geçtikçe seviyor";
        cümle=cümle.toLowerCase();

        if(cümle.contains("büyük") && cümle.contains("kücük")){
            System.out.println("Karar ver büyük mü kücük mü yazdırayım?");
        } else if (cümle.contains("büyük")){
            System.out.println(cümle.toUpperCase());

        } else if (cümle.contains("kücük")){
            System.out.println(cümle.toLowerCase());
        } else {
            System.out.println("Cümelede istenen yok");
       }

    }
}
