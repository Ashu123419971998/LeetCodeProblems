package leetcode.medium;

import java.util.Arrays;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int cols=matrix[0].length;
        int rows=matrix.length;
        for(int i=0;i<rows-1;i++)
        {
            int j=i;
            while(j<cols)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                j++;
            }
        }
        for(int i=0;i<rows;i++)
        {
            int j=0;
            if(cols%2==0)
            {
                while(j<=(cols/2)-1)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[i][cols-j-1];
                    matrix[i][cols-j-1]=temp;
                    j++;
                }
            }
            else
            {
                while(j<cols/2)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[i][cols-j-1];
                    matrix[i][cols-j-1]=temp;
                    j++;
                }
            }
        }

    }
    public static void main(String[] args) {
        int[][] matrix= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
