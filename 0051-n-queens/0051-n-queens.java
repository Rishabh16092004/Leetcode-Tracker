class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] queencol = new int[n];
        boolean[] usedcol = new boolean[n];
        boolean[] usedDiag1 = new boolean[2 * n];
        boolean[] usedDiag2 = new boolean[2 * n];
        backtrack(0, n, queencol, usedcol, usedDiag1, usedDiag2, result);
        return result;
    }

    public void backtrack(int row, int n, int[] queencol, boolean[] usedcol, boolean[] usedDiag1, boolean[] usedDiag2,
            List<List<String>> result) {
        if (row == n) {
            result.add(buildboard(queencol, n));
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row - col + n;
            int d2 = row + col;
            if (usedcol[col] || usedDiag1[d1] || usedDiag2[d2])
                continue;

            queencol[row] = col;
            usedcol[col] = true;
            usedDiag1[d1] = true;
            usedDiag2[d2] = true;

            backtrack(row + 1, n, queencol, usedcol, usedDiag1, usedDiag2, result);
            usedcol[col] = false;
            usedDiag1[d1] = false;
            usedDiag2[d2] = false;
        }
    }

    public List<String> buildboard(int[] queencol, int n) {
        List<String> board = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < n; col++) {
                sb.append(col==queencol[row]?'Q':'.');
            }

            board.add(sb.toString());
        }

        return board;
    }
}