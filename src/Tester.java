import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tester {

    public static boolean estSuperieur(int[] nums) {
        int somme = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums.length");
            somme = somme + nums[i];
            if (somme > 100) {
                return true;
            }

        }
        return false;
    }

    public static void affichage1(int nums){

        for (int i = 0; i < 100; i++) {
            String mot = "";
            if (i%3==0) {
                mot = mot + " Fizz";
            }
            if (i%5==0) {
                mot = mot + " Buzz";
            }
            System.out.println(i + mot);
        }

    }

    public static void affichage2(int nums){

        for (int i = 0; i < 100; i++) {
            String mot = "";
            System.out.print(i);
            if (i%3==0) {
                System.out.print(" Fizz");
            }
            if (i%5==0) {
                System.out.print(" Buzz");
            }
            System.out.println(" ");
        }

    }
    public static void testScanner(){

        int entier1, entier2, somme;
        Scanner unScanner = new Scanner(System.in);
        // Saisir les deux entiers avec Scanner
        System.out.print("Entrez un premier nombre entier:");
            entier1 = unScanner.nextInt();
        System.out.print("Entrez un second nombre entier:");
            entier2 = unScanner.nextInt();
        // Calculer la somme des deux entiers
            somme = entier1 + entier2;
        // Afficher la somme avec System.out.println()
        System.out.println("La somme des deux entiers est " + somme);
    }

    public static void test(String chaine) {
       // chaine += chaine;
        chaine.concat(chaine);
    }

    public static String inverserTexte(String texte) {

        String texteRenverse = new String();

        // Utilisation d'une boucle itérative, à voir dans le prochain module.
        for (char c : texte.toCharArray()) {
            texteRenverse = c + texteRenverse;
        }

        return texteRenverse;

    }

    public static String transformerTexteEnHTML(String texte) {

       return  texte =  "<html><body><p>" + texte + "</p></body></html>";

    }

    public static String fusionDeTexte(String texte1, String texte2, String monde) {

        return texte1 + "::" + texte2;


    }
/************************************************************************************************/
// Travail noté 30
    public static void calculerSomme1a10000Inclusivement() {
        int somme = 0;
        for (int i = 1; i <= 10000; i++) {
            if (!aExclure(i)) {
                somme+=i;
            }
        }
        System.out.println("La somme des nombres de 1 jusqu’à 10,000 est : " + somme);
    }

    public static boolean aExclure(int number) {
        return (number / 100) % 10 == 2
                || (number / 100) % 10 == 3
                || number % 3 == 0;
    }



    private static boolean isValidString(String str) {
        // Check if 'b' is always followed by 'a'
        if (str.contains("b") && !str.contains("ba")) {
            return false;
        }
        // Check if 'd' and 'a' do not appear in the same string
        if (str.contains("d") && str.contains("a")) {
            return false;
        }
        return true;
    }



    /************************************************************************************************/


}


