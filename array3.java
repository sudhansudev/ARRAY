package ARRAY;

import java.util.Arrays;
import java.util.Scanner;
public class array3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array.array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int n = arr.length;
        System.out.println("enter the elements of array.array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the " + size + " elements are :");
        System.out.println(Arrays.toString(arr));
    }
}
