package ARRAY;

public class sum_of_subarray
{
    public static void main(String[] args)
    {
//        int sum = 0;
//        int[] arr = {1,2,3,7,5};
//        int count = 0;
//        int size = arr.length;
//        int target = 12;
//        for(int i = 0; i < size; i++)
//        {
//            sum = 0;
//            for(int j = i; j < size; j++)
//            {
//                sum += arr[j];
//                if(sum == target)
//                {
//                    count++;
//                }
//            }
//        }
        int sum = 0;
        int count = 0;
        int[] arr = {10,20,30,100,50,70};
        int target = 10;
        int size = arr.length;
        for(int i = 0; i < size; i++)
        {
            sum = 0;
            for(int j = i ; j < size; j++)
            {
                sum = sum + arr[j];
                if(sum == target)
                {
                    count++;
                }
            }
        }
        System.out.println("total sub-array having target value are:" +count);
    }
}
