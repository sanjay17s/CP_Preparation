import java.util.*;

public class ThreeLogos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        solve(x, y);
    }

    public static void solve(int[] x, int[] y) {
        int maxSize = Math.max(Math.max(x[0], y[0]), Math.max(x[1] + x[2], Math.max(y[1], y[2])));
        char[][] grid = new char[maxSize][maxSize];

        for (char[] row : grid) {
            Arrays.fill(row, '.');
        }

        placeLogo(grid, 0, 0, x[0], y[0], 'A');
        placeLogo(grid, 0, y[0], Math.max(x[1], x[2]), y[1], 'B');
        placeLogo(grid, Math.max(x[1], x[2]), y[0], x[1] + x[2], y[2], 'C');

        printSolution(grid);
    }

    public static void placeLogo(char[][] grid, int startX, int startY, int endX, int endY, char logo) {
        for (int i = startX; i < endX; i++) {
            for (int j = startY; j < endY; j++) {
                grid[i][j] = logo;
            }
        }
    }

    public static void printSolution(char[][] grid) {
        int size = grid.length;
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
