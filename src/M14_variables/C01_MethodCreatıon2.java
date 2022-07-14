package M14_variables;

public class C01_MethodCreatıon2 {
    public static void main(String[] args) {
        //input olarak verilen 4 harfli bir stringi tersten yazdıran bir method oluşturalım
        terstenYazdır("Okan");

    }
    public static void terstenYazdır(String input){
        String tersInput=input.substring(3)+
                input.substring(2,3)+input.substring(1,2)+
                input.substring(0,1);
        System.out.println("Verilen kellimenin yazılışı:" + tersInput);



    }


}
