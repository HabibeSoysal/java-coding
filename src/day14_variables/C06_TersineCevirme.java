package day14_variables;

public class C06_TersineCevirme {
    public static void main(String[] args) {
        String input="Ey Edip Adana da pide ye";
        terstenYazdırma(input);
    }

    public static void terstenYazdırma(String input) {
        //String tersInput=input.substring(input.length()-1);
       input="Ey Edip Adana da pide ye";
        for (int i =input.length()-1; i>=0 ; i--) {
            System.out.print(input.substring(i,i+1));

        }        //System.out.println(tersInput);

    }
}
 /*
  for (int i = str.length()-1 ; i >=0 ; i--) {

          System.out.print(str.substring(i,i+1));
          }  */