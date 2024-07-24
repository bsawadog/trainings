import java.util.Scanner;

public class Main {
    public static void test(StringBuilder test) {
        test.append(test);
    }

    public static void main(String[] args) {
        Bonhomme bonhomme = new Bonhomme("Toto");
        System.out.println(bonhomme.nom);
    }



}

