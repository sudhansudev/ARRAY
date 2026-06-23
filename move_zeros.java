package ARRAY;

import java.util.Arrays;

public class move_zeros
{
    public static void main(String[] args)
    {
     int[] arr = {1,2,0,7,0,5};
     int size = arr.length;
     int[] copy = new int[size];
     int start = 0 , end = size - 1;

        for (int i = 0; i < size; i++)
        {
            if(arr[i] != 0)
            {
                copy[start++] = arr[i];
                // start++;
            }
            else
            {

                copy[end--] = arr[i];
                // end--;
            }
        }
        System.out.println(Arrays.toString(copy));
    }
}
