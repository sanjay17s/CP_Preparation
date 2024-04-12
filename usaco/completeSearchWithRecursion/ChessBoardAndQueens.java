import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://cses.fi/problemset/result/8996979/
public class ChessBoardAndQueens {

    private static int sum = 0;


    public static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
                return tokenizer.nextToken();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }

    static InputReader r = new InputReader(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        char[][] board = new char[8][8];
        for (int i = 0; i < 8; i++) {
            String row = read.readLine();
            for (int j = 0; j < 8; j++) {
                board[i][j] = row.charAt(j);
            }
        }
        int[] arr = new int[8];
        backTrack(board, 0, arr);
        System.out.println(sum);
    }

    public static void backTrack(char[][] board, int column, int[] arr) {
        if (column == board.length) {
            sum++; // Increment sum only when a valid solution is found
        } else {
            for (int row = 0; row < 8; row++) {
                if ( board[row][column] != '*' && isSafe(row, column, board, arr)) {
                   board[row][column] = 'Q';
                    arr[row] = 1;
                    backTrack(board, column + 1, arr);
                    board[row][column]='.';
                    arr[row] = 0;
                }
            }
        }
    }

    public static boolean isSafe(int r, int c, char[][] board, int[] arr) {
        // Check if there is a queen in the same row

            if (arr[r] == 1) {
                return false;
            }

        // Check if there is a queen in the upper diagonal
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check if there is a queen in the lower diagonal
        for (int i = r, j = c; i < 8 && j >= 0; i++, j--) {
            if (board[i][j]  == 'Q') {
                return false;
            }
        }
        return true;
    }
}
