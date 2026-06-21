package ARRAY;
import java.util.Arrays;
import java.util.Scanner;
public class left_rotateby_k
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int size = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of k :");
        int k = sc.nextInt();
        k = k % size;
        for(int i = 1; i <= k ; i++)
        {
            int temp = arr[0];
            for(int j = 1; j < size; j++)
            {
                arr[j - 1] = arr[j];
            }
            arr[size - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
