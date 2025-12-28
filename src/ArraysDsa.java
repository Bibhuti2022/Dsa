

public class ArraysDsa {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,2,3,4,5};
        int[] b = {1,2,3,4,5,6,7,8,9};
        int[] merged = unionOfSortedArray(arr,b);
        print(merged);
    }

    private static int[] unionOfSortedArray(int[] a, int b[])
    {
        int temp[] = new int[a.length + b.length];
        int lastAdded = -1;
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < a.length && j < b.length)
        {
            if(a[i] == a[j]){
                if(lastAdded != a[i]) {
                    lastAdded = a[i];
                    temp[k++] = a[i++];
                    j++;
                }
                else {
                    i++;
                    j++;
                }

            }
            else if(a[i] < a[j])
            {
                if(lastAdded != a[i]) {
                    lastAdded = a[i];
                    temp[k++] = a[i++];
                }
                else i++;

            }
            else{
                if(lastAdded != b[j])
                {
                    lastAdded = b[j];
                    temp[k++] = b[j++];
                }
                else j++;
            }
        }
        while(i < a.length)
        {
            if(lastAdded != a[i]) {
                lastAdded = a[i];
                temp[k++] = a[i++];
            } else i++;
        }
        while(j < b.length)
        {
            if(lastAdded != b[j])
            {
                lastAdded = b[j];
                temp[k++] = b[j++];
            }
            else j++;
        }
        return temp;
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
