import java.util.*;

public class Sudoku {

    private int[][] sudoku;
    static final int MAX = 9;

    public Sudoku() {
        sudoku = new int[MAX][MAX];
        modifierSudoku();
    }

    // Cette methode permet de generer un sudoku
    private void modifierSudoku() {

        Random random = new Random();
        // Je genere les valeurs de chaque ligne
        for (int i = 0; i < MAX; i++) {
            List<Integer> listWithDuplicates = new ArrayList<>();
            for (int j = 0; j < MAX; j++) {
                sudoku[i][j] = random.nextInt(MAX) + 1;
                listWithDuplicates.add(sudoku[i][j]);
            }
            // cette methode permet de supprimer les doublons dans une liste
            Set<Integer> set = new LinkedHashSet<>(listWithDuplicates);
            List<Integer> ListeSansRangeeDuplique = new ArrayList<>(set);

            // Cette mehode permet de completer les valeurs manquantes dans la rangee
            ajusteRangee(ListeSansRangeeDuplique);

            // Je remets les valeurs des lignes filtrées dans le Sudoku
            sudoku[i] = ListeSansRangeeDuplique.stream().mapToInt(Integer::intValue).toArray();
        }
        // Je recupere les valeurs des lignes filtrées et je les remets dans le Sudoku
        this.ajusteColonne(sudoku);

    }

    public int[][] getSudoku() {
        return sudoku;
    }

    public void ajusteRangee(List<Integer> listWithoutDuplicates) {
        for (int i = 1; i <= MAX; i++) {
            if (!listWithoutDuplicates.contains(i)) {
                listWithoutDuplicates.add(i);
            }
        }
    }

    public void ajusteColonne(int[][] listWithoutDuplicates) {

        List colonne1 = new ArrayList<>();
        List colonne2 = new ArrayList<>();
        List colonne3 = new ArrayList<>();
        List colonne4 = new ArrayList<>();
        List colonne5 = new ArrayList<>();
        List colonne6 = new ArrayList<>();
        List colonne7 = new ArrayList<>();
        List colonne8 = new ArrayList<>();
        List colonne9 = new ArrayList<>();

        // Recuperation des colonnes
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                if (j == 0) {
                    colonne1.add(sudoku[i][j]);
                } else if (j == 1) {
                    colonne2.add(sudoku[i][j]);
                } else if (j == 2) {
                    colonne3.add(sudoku[i][j]);
                } else if (j == 3) {
                    colonne4.add(sudoku[i][j]);
                } else if (j == 4) {
                    colonne5.add(sudoku[i][j]);
                } else if (j == 5) {
                    colonne6.add(sudoku[i][j]);
                } else if (j == 6) {
                    colonne7.add(sudoku[i][j]);
                } else if (j == 7) {
                    colonne8.add(sudoku[i][j]);
                } else if (j == 8) {
                    colonne9.add(sudoku[i][j]);
                }
            }
        }

        // Je supprime les doublons dans chaque colonne
        interChangerPositionDoubonsColonne(colonne1, colonne2, colonne3, colonne4, colonne5, colonne6, colonne7, colonne8, colonne9);
        interChangerPositionDoubonsColonne(colonne2, colonne3, colonne4, colonne5, colonne6, colonne7, colonne8, colonne9, null);
        interChangerPositionDoubonsColonne(colonne3, colonne4, colonne5, colonne6, colonne7, colonne8, colonne9, null, null);
        interChangerPositionDoubonsColonne(colonne4, colonne5, colonne6, colonne7, colonne8, colonne9, null, null, null);
        interChangerPositionDoubonsColonne(colonne5, colonne6, colonne7, colonne8, colonne9, null, null, null, null);
        interChangerPositionDoubonsColonne(colonne6, colonne7, colonne8, colonne9, null, null, null, null, null);
        interChangerPositionDoubonsColonne(colonne7, colonne8, colonne9, null, null, null, null, null, null);
        interChangerPositionDoubonsColonne(colonne8, colonne9, null, null, null, null, null, null, null);

        // Je recupere les valeurs des colonnes filtrées et je les remets dans le Sudoku
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                if (j == 0) {
                    sudoku[i][j] = (int) colonne1.get(i);
                } else if (j == 1) {
                    sudoku[i][j] = (int) colonne2.get(i);
                } else if (j == 2) {
                    sudoku[i][j] = (int) colonne3.get(i);
                } else if (j == 3) {
                    sudoku[i][j] = (int) colonne4.get(i);
                } else if (j == 4) {
                    sudoku[i][j] = (int) colonne5.get(i);
                } else if (j == 5) {
                    sudoku[i][j] = (int) colonne6.get(i);
                } else if (j == 6) {
                    sudoku[i][j] = (int) colonne7.get(i);
                } else if (j == 7) {
                    sudoku[i][j] = (int) colonne8.get(i);
                } else {
                    sudoku[i][j] = (int) colonne9.get(i);
                }
            }
        }
    }

    // Cette methode permet de supprimer les doublons dans une colonne du sudoku
    private static void interChangerPositionDoubonsColonne(List valeursColonne, List colonne2, List colonne3, List colonne4, List colonne5, List colonne6, List colonne7, List colonne8, List colonne9) {
        for (int k = 0; k < MAX; k++) {
            for (int i = k + 1; i < MAX; i++) {

                if (valeursColonne.get(k) == valeursColonne.get(i)) {
                    int temp = (int) valeursColonne.get(i);

                    if (colonne2 != null && !valeursColonne.contains(colonne2.get(i)) && colonne2.get(i) != null) {
                        valeursColonne.set(i, colonne2.get(i));
                        colonne2.set(i, temp);
                    } else if (colonne3 != null && !valeursColonne.contains(colonne3.get(i)) && colonne3.get(i) != null) {
                        valeursColonne.set(i, colonne3.get(i));
                        colonne3.set(i, temp);
                    } else if (colonne4 != null && !valeursColonne.contains(colonne4.get(i)) && colonne4.get(i) != null) {
                        valeursColonne.set(i, colonne4.get(i));
                        colonne4.set(i, temp);
                    } else if (colonne5 != null && !valeursColonne.contains(colonne5.get(i)) && colonne5.get(i) != null) {
                        valeursColonne.set(i, colonne5.get(i));
                        colonne5.set(i, temp);
                    } else if (colonne6 != null && !valeursColonne.contains(colonne6.get(i)) && colonne6.get(i) != null) {
                        valeursColonne.set(i, colonne6.get(i));
                        colonne6.set(i, temp);
                    } else if (colonne7 != null && !valeursColonne.contains(colonne7.get(i)) && colonne7.get(i) != null) {
                        valeursColonne.set(i, colonne7.get(i));
                        colonne7.set(i, temp);
                    } else if (colonne8 != null && !valeursColonne.contains(colonne8.get(i)) && colonne8.get(i) != null) {
                        valeursColonne.set(i, colonne8.get(i));
                        colonne8.set(i, temp);
                    } else if (colonne9 != null && !valeursColonne.contains(colonne9.get(i)) && colonne9.get(i) != null) {
                        valeursColonne.set(i, colonne9.get(i));
                        colonne9.set(i, temp);
                    }
                }
            }

        }
    }

    // Affichage du Sudoku
    private void afficherSudoku() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        sudoku.afficherSudoku();
    }

}
