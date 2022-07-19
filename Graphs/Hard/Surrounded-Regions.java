public class Solution {
	public void solve(ArrayList<ArrayList<Character>> board) {
        if (board.size() == 0 || board.get(0).size() == 0) return;
        if (board.size() < 3 || board.get(0).size() < 3) return;
        int m = board.size();
        int n = board.get(0).size();
        for (int i = 0; i < m; i++) {
            if (board.get(i).get(0) == 'O') 
                helper(board, i, 0);
            if (board.get(i).get(n-1) == 'O') 
                helper(board, i, n - 1);
        }
        for (int j = 1; j < n - 1; j++) {
            if (board.get(0).get(j) == 'O') 
                helper(board, 0, j);
            if (board.get(m-1).get(j) == 'O') 
                helper(board, m - 1, j);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board.get(i).get(j) == 'O') 
                    board.get(i).set(j, 'X');
                if (board.get(i).get(j) == '*') 
                    board.get(i).set(j, 'O');
            }
        }
    }
    
    private void helper(ArrayList<ArrayList<Character>> board, int r, int c) {
        if (r < 0 || c < 0 || r > board.size() - 1 || c > board.get(0).size() - 1 || board.get(r).get(c) != 'O') 
            return;
        board.get(r).set(c,'*');
        helper(board, r + 1, c);
        helper(board, r - 1, c);
        helper(board, r, c + 1);
        helper(board, r, c - 1);
	}
}
