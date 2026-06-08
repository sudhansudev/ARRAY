package ARRAY;

import java.util.Scanner;
public class array
{
    //array.array examples
    public static void main(String[] args)
    {
//        int arr[] = {1,2,3};
//        for(int i = 0; i<= arr.length; i++)
//        {
//            System.out.println(arr[i]);
//        }
        //int []arr1 = new int[5];
//        int [] arr2 = new int[5];
//        int[] arr3 = new int[5];
//        int []arr4 = new int[5];
//        int arr5[] = new int[]{1,2,3,4,5};//at a time int[5] and {1,2,3,4,5} can't be declared
//        System.out.println(arr);// memory address of array.array

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array.array :");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        System.out.println("enter the " + size + " elements of array.array : ");
        for(int i = 0; i < arr1.length; i++)
        {
            arr1[i] = sc.nextInt();
        }
        // index = array.array size - 1

        // here index 5 is 0. as not assigned
        // DEFAULT VALUES OF ARRAYS WHICH ARE  NOT SPECIFIED
        // integer = 0
        // float = 0.0
        // char - null charecter , unicode - '\u0000'
        // boolean - false
        // non - primitives - null
        // if index value is not specified then value will be automatically ' 0 '
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.println("[" + i + "]" + "-> " +arr1[i]);
        }
    }
}
