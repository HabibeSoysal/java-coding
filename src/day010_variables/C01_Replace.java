package day010_variables;

public class C01_Replace {
    public static void main(String[] args) {
        String str=" Bu12 g ün ha0*va çok gü_P0zel ";

        System.out.println(str.replace(" ","").replace("h", "j" ));

        System.out.println(str.replace("h","J").replace(" ",""));

        System.out.println(str.replace("guz el","harika"));


        System.out.println(str.replace(" ","qwxş"));

        System.out.println(str.replaceAll("\\w",""));
        System.out.println(str.replaceAll("\\s",""));
        System.out.println(str.replaceAll("\\d",""));

        str=str.replace("Bu gün", "bugün")
                .replace("ha va","hava")
                .replace("gü zel","güzel");










    }
}
