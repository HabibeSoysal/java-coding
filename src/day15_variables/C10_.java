package day15_variables;

public class C10_ {
    public static void main(String[] args) {

        boolean dogruMu=false;
        int sayi=10;

        while (!dogruMu){
            if (sayi>20){ // sart saglandığında whıle loop u condıtıon ı false olur
                System.out.println("bu işlem tamam");
                dogruMu=true;
            }else { // sart saglanmadıgı muddetce whıleloop un kontrol ettıgı degısken degısmelı
                System.out.println("istenen sart saglanamadı : "+ sayi);
                sayi++;
            }

        }
    }
}
