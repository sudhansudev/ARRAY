package ARRAY;

import java.util.Arrays;

public class transpose_matrix
{
    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3}, {4,5,6}};
        int r = arr.length, c = arr[0].length;
        int[][] ans = new int[c][r];

        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                ans[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
        System.out.println(Arrays.deepToString(ans));

    }
}
