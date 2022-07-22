package day08_variables;

public class C065_nestedTernary {
    public static void main(String[] args) {
        /*verilen sayının pozıtıf mı negaı poz

         */
        int sayi=20;
        if (sayi>=0){
            if (sayi%2==0){
                System.out.println("sayi pozıtıf cıft sayi");

            }else{
                System.out.println("sayı pozitif tek sayi");
            }
        } else {
            if (sayi<=-100){
                System.out.println("sayi -100 den küçük negatif sayi");
            }else{
                System.out.println("sayi -100 den büyük negatif sayi");
            }
        }


        String sonuc = sayi>=0 ?
                (sayi%2==0 ?"pozitif çift sayi": "sayi tek sayı") :
                (sayi<=-100 ? "-100 den küçük Sayi negatif" : "-100 den büyük negatif sayi");
        System.out.println(sonuc);











    }
}
