
class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Check rows
        for(int i = 0; i < 9; i++) {
            int[] arr = new int[10];

            for(int j = 0; j < 9; j++) {

                if(board[i][j] != '.') {
                    int num = board[i][j] - '0';

                    if(arr[num] == 1) {
                        return false;
                    }

                    arr[num] = 1;
                }
            }
        }

        // Check columns
        for(int j = 0; j < 9; j++) {
            int[] arr = new int[10];

            for(int i = 0; i < 9; i++) {

                if(board[i][j] != '.') {
                    int num = board[i][j] - '0';

                    if(arr[num] == 1) {
                        return false;
                    }

                    arr[num] = 1;
                }
            }
        }

        // Check 3x3 boxes
        for(int row = 0; row < 9; row += 3) {
            for(int col = 0; col < 9; col += 3) {

                int[] arr = new int[10];

                for(int i = row; i < row + 3; i++) {
                    for(int j = col; j < col + 3; j++) {

                        if(board[i][j] != '.') {
                            int num = board[i][j] - '0';

                            if(arr[num] == 1) {
                                return false;
                            }

                            arr[num] = 1;
                        }
                    }
                }
            }
        }

        return true;
    }
}
