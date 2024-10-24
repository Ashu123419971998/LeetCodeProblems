package leetcode.medium;

import java.util.Arrays;

public class WordSearch {
    public static boolean dfs(char[][] board,int i, int j, String word,int k)
    {
        if(k==word.length())
        {
            return true;
        }
        if(i>=board.length || i<0 || j>=board[0].length||j<0||board[i][j]!=word.charAt(k))
        {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = dfs(board,i-1,j,word,k+1)||
                dfs(board,i+1,j,word,k+1)||
                dfs(board,i,j-1,word,k+1)||
                dfs(board,i,j+1,word,k+1);
        board[i][j]=temp;
        return found;

    }
    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        // Iterate over every cell in the grid to start DFS
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if(board[r][c]==word.charAt(0))
                {
                    if (dfs(board, r,c,word,0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] char_array= {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        String word="ABCCED";
        boolean res=exist(char_array,word);
        System.out.println(res);
    }
}
