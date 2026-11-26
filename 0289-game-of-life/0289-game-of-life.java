class Solution {
    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;

        int[][] copy = new int[m][n];

        // Copy original board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                copy[i][j] = board[i][j];
            }
        }

        // Check every cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int count = 0;

                // Check 8 neighbours
                for (int x = -1; x <= 1; x++) {
                    for (int y = -1; y <= 1; y++) {

                        if (x == 0 && y == 0)
                            continue;

                        int r = i + x;
                        int c = j + y;

                        if (r >= 0 && r < m &&
                            c >= 0 && c < n &&
                            copy[r][c] == 1) {

                            count++;
                        }
                    }
                }

                // Apply rules
                if (copy[i][j] == 1) {

                    if (count < 2 || count > 3) {
                        board[i][j] = 0;
                    }

                } else {

                    if (count == 3) {
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
}