package day11_varables;

import day14_variables.C06_TersineCevirme;

public class C07_ForLoop {
    public static void main(String[] args) {
        C06_TersineCevirme.terstenYazdırma("zekeriya");
        for (int i = 100; i >=0; i--) {
            if (i%8==0){
                System.out.print(i + " ");
            }

        }

    }
}
