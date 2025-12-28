import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysDsa {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,2,3,4,5};
        int[] b = {-90,1,2,3,4,5,6,7,8,9};
        int[] merged = unionOfSortedArray(arr,b);
        print(merged);
    }

    private static int[] unionOfSortedArray(int[] a, int b[])
    {
       List<Integer> result = new ArrayList<>();
       int i = 0;
       int j = 0;
       while(i < a.length && j < b.length)
       {
          int val;
          if(a[i] == b[j])
          {
              val = a[i];
              i++;
              j++;
          }
          else if(a[i] < b[j])
          {
              val = a[i];
              i++;
          }
          else {
              val = b[j];
              j++;
          }
          if(result.isEmpty() || result.getLast() != val) result.add(val);
       }
       while(i < a.length)
       {
           if(result.isEmpty() || result.getLast() != a[i])
               result.add(a[i]);
           i++;
       }
       while (j < b.length)
       {
           if(result.isEmpty() || result.getLast() != b[j])
               result.add(b[j]);
           j++;

       }
       return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void print(int[] arr) {
        for(int x : arr){
            System.out.print(x+" ");
        }
    }

    public static void moveZeroToEnd(int[] arr)
    {
        int i = 0;
        for(int j = 0 ; j < arr.length; j++)
        {
            if(arr[j] != 0)
            {
                swap(arr,i,j);
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
