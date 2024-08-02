import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChainesOrdreLexicographique {

    private static void afficherChainesOrdreLexicographique() {

        char[] letters = {'a', 'b', 'c', 'd'};
        List<String> chainesCaracteres = new ArrayList<>();

        for (char c1 : letters) {
            for (char c2 : letters) {
                for (char c3 : letters) {
                    for (char c4 : letters) {
                        String chaine = Character.toString(c1) + c2 + c3 + c4;
                        if (!estInvalideChaine(chaine)) {
                            chainesCaracteres.add(chaine);
                        }
                    }
                }
            }
        }
        // Afficher chaque chaîne de caractères
        for (String chaine : chainesCaracteres) {
            System.out.println(chaine);
        }
        System.out.println("le nombre de chaînes de caractères affichées est : " + chainesCaracteres.size());

    }

    private static boolean estInvalideChaine(String chaine) {

        for (int i = 0; i < chaine.length(); i++) {
            if (chaine.charAt(chaine.length()-1) == 'b') {
                return true;
            }
            if (chaine.charAt(i) == 'b' && chaine.charAt(i+1) != 'a') {
                return true;
            }
            if (chaine.charAt(i) == 'd' && chaine.contains("a")) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        afficherChainesOrdreLexicographique();
    }
}
