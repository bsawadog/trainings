import java.util.*;

public class Sudok {

    private int[][] grid;

    public Sudok() {
        grid = new int[9][9];
        generateSudoku();
    }

    private void generateSudoku() {
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            List<Integer> numbers = new ArrayList<>();
            for (int num = 1; num <= 9; num++) {
                numbers.add(num);
            }
            Collections.shuffle(numbers, random);
            for (int j = 0; j < 9; j++) {
                grid[i][j] = numbers.get(j);
            }
        }
    }

    public void printSudoku() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Sudok sudoku = new Sudok();
        sudoku.printSudoku();
    }
}