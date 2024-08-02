public class CalculateurDeSomme {

    public static void main(String[] args) {
        System.out.println("La somme est : " + CalculateurDeSomme.calculer());
    }

    private static boolean aExclure(int number) {
        return (number / 100) % 10 == 2
                || (number / 100) % 10 == 3
                || number % 3 == 0;
    }

    private static int calculer() {
        int cumul = 0;
        for (int i = 1; i <= 10000; i++) {
            if (!aExclure(i)) {
                cumul+=i;
            }
        }
        return cumul;
    }
}
