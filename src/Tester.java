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
        chaine += chaine;
    }


}


