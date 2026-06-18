package ARRAY;
import java.util.Scanner;
public class diagonal_sum
{
    public static void main(String[] args)
    {
        int row = 3;
        int col = 3;
        int[][] arr = new int[row][col];
        int size = arr.length;


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array elements:");

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print("element for [" + i + "]" +"[" + j + "] :");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int d_sum = 0;
        for(int i = 0 ; i < row; i++)
        {
            for(int j = 0 ; j < col; j++)
            {
                System.out.print(arr[i][j] +" ");
               if(i == j || i + j == row - 1)
                {

                    d_sum += arr[i][j];

                }

            }
            System.out.println();
        }
        System.out.println(d_sum);

    }

}
