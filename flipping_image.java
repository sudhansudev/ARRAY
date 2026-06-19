package ARRAY;
import java.util.Arrays;
public class flipping_image
{
    public static void main(String[] args)
    {
        //squre matrix
        int[][] arr = {{1,1,0}, {1,0,1}, {0,0,0}};
        int size = arr.length;
        //REVERSE THE ARRAY || FLIPPING THE ARRAY
        for(int i = 0; i < size; i++)
        {
            for(int j = 0 ; j < size/2 ; j++)
            {
                //swap
                int temp = arr[i][j];
                arr[i][j] = arr[i][size - 1 - j];
                arr[i][size - 1 - j] = temp;
            }
        }

        // INVERTING THE ARRAY
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)// go till the last
            {
                if(arr[i][j] == 1)
                {
                    arr[i][j] = 0;
                }
                else
                {
                    arr[i][j] = 1;
                }
            }
        }



        for(int i = 0; i < size ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
