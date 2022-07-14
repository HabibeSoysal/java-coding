package day09_variables;

public class C06_EndsWıth {
    public static void main(String[] args) {
        /*
        Kullanicidan email adresini girmesini isteyin, mail @gmail.com icermiyorsa ''lutfen gmail adresi giriniz", @gmail.com ile bitiyorsa \n
       "Email adresiniz kaydedildi .. , @gmail.com ile bitmiyorsa lutfen yazimi kental edin yazdirin
        */
        String input="fatih@gmail.com";

        if (!input.contains("@gmail.com")){
            System.out.println("Lütfen gmail adresini giriniz");
        } else if (input.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("Lütden yazım kontrol edin");
        }


    }
}
