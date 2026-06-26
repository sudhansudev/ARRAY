package ARRAY;
import java.util.Arrays;
public class right_rotate_by1
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        //           0 1 2 3 4
        int size = arr.length;
        //   5
        int temp = arr[size -1];// 5

        for(int i = size - 2; i >= 0 ; i --)
        //      i = 5  - 2 = 3
        {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
