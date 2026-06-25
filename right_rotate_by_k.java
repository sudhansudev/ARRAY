package ARRAY;

import java.util.Arrays;

public class right_rotate_by_k
{
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50};
        //            0  1  2  3  4
        int size = arr.length;
        int last_ind = size - 1;// index = 4 and value = 50
        int k = 1;
        k = k % size;
        // k times rotate
        for(int j = 1; j <= k ; j++)
        {
            //store last index value = 50
            int temp = arr[last_ind];
            //element shift
            for(int i = size - 2; i >= 0; i--)
            {
                arr[i + 1] = arr[i];
            }
            //store the temp
            arr[0] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
