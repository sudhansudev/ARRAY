package ARRAY;
import java.util.Scanner;
public class multiarray
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1 ,2 ,3 ,4}, {5, 6, 7}, {8, 9}};
        //              0th-index    1st-index  2nd-index
        int size = arr.length;
        System.out.println("array elements are:");

        for(int i = 0; i < size ; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        sc.close();






//  System.out.print("enter the no of rows:");
//        int row1 = sc.nextInt();
//        System.out.print("enter the number of columns:");
//        int col1 = sc.nextInt();
//        int[][] arr2 = new int[row1][col1];
//
//        for (int i = 0; i < row1; i++) {
//            for (int j = 0; j < col1; j++) {
//                System.out.print("enter the value of matrix [" + i + "]" +"[" + j + "] :");
//                arr2[i][j] = sc.nextInt();
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < row1; i++) {
//            for (int j = 0; j < col1; j++) {
//                System.out.print(arr2[i][j]+" ");
//            }
//            System.out.println();
//        }

//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        int rows = arr.length;
//        int col = arr[0].length;
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }









//        for(int i = 0; i < arr.length; i++)
//        {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print("enter the " + i + "index element :");
//                arr[i][j] = sc.nextInt();
//            }
//
//        }
//        for (int i = 0; i < arr.length; i++)
//        {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.println("the elements are :"+ arr[i][j]);
//            }
//
//        }
        sc.close();
    }

}
