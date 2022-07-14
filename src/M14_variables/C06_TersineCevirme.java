package M14_variables;

public class C06_TersineCevirme {
    public static void main(String[] args) {
        String input="Ey Edip Adana da pide ye";
        terstenYazdırma(input);
    }

    public static void terstenYazdırma(String input) {
        String tersInput=input.substring(input.length()-1);
        for (int i =input.length()-2 ; i>=0 ; i--) {
            tersInput+=input.substring(i,i+1);

        }
        System.out.println(tersInput);
    }
}
