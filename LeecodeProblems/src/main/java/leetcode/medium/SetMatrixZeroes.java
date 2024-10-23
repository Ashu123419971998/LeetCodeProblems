package leetcode.medium;

import java.util.Arrays;
import java.util.HashSet;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        //rows with zeros.
        HashSet<Integer> rows=new HashSet<>();
        //columns with zeros.
        HashSet<Integer> cols=new HashSet<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                //If a element zero
                if(matrix[i][j]==0)
                {
                    // If new row with zero set previous elements to zero in the row.
                    if(!rows.contains(i))
                    {
                        int k=j-1;
                        while(k>=0)
                        {
                            matrix[i][k]=0;
                            k--;
                        }
                    }
                    // If new column with zero set previous elements to zero in the column.
                    if(!cols.contains(j))
                    {
                        int  k=i-1;
                        while(k>=0)
                        {
                            matrix[k][j]=0;
                            k--;
                        }
                    }
                    rows.add(i);
                    cols.add(j);
                }
                else
                {
                    //If the row contains in zero rows then make element to zero.
                    if(rows.contains(i))
                    {
                        matrix[i][j]=0;
                    }
                    //If the column contains in zero column then make element to zero.
                    if(cols.contains(j))
                    {
                        matrix[i][j]=0;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix= new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

}
