package E14_variables;

import java.sql.PreparedStatement;

public class E14_Nested {
    public static void main(String[] args) {

/*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */
        char finlNot='C';
        String rsult=finlNot=='A' ? "Gayet Başarılı":finlNot=='B'? "Başarılı": finlNot=='C'? "HA GAyret":"Diğerleri..";
        System.out.println("rsult = " + rsult);


    }
}
