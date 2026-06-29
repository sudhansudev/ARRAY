package ARRAY;

import java.util.Arrays;

public class rotate_image
{
    public static void main(String[] args)
    {
        int[][] mat = { {1,2,3},{4,5,6},{7,8,9} };
        int n = mat.length;

        for(int i = 0; i < n ; i++)
        {
            for(int j = i + 1; j < n ; j++)
            {
                //transpose
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;

            }
        }
        //reverse the transpose matrix
        for(int i = 0; i < n; i++)
        {
            //using two pointer , swap the elements

            int left = 0;
            int right = n - 1;
            while(left < right)
            {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }

//        for(int i = 0; i < n; i++)
//        {
//            for(int j = 0 ; j < n; j++)
//            {
//                //reverse
//                int temp = mat[][];
//            }
//        }
        for(int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}
