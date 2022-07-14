package H14_calısma;

public class H13_S3 {


    public static void main(String[] args) {
        /*
        Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
- @ isareti icermiyorsa gecersiz email yazdirin
- @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
- @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz
         */
        String input="habibesoysaldemirtas@gmail.com";
        emailKontrol(input);

    }
    public static void emailKontrol(String input) {
        if (!input.contains("@")){
            System.out.println("Geçersiz email");
        } else if (!input.contains("@gmail.com")) {
            System.out.println("lutfen gmail adresinizi girin");
        } else if (!input.endsWith("@gmail.com")) {
            System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
        }else{
            System.out.println("Tebrikler");
        }

    }
}
