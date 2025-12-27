public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        split(arr,0,arr.length-1);
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
    }

    public static void split(int[] arr, int s, int e)
    {
        if(s >= e) return;
        int pivotIndx = quickSort(arr,s,e);
        split(arr,s,pivotIndx-1);
        split(arr,pivotIndx+1,e);
    }

    private static int quickSort(int[] arr, int s,int e) {
        int i = s+1;
        int j = e;
        int pivot = arr[s];
        while(i<=j)
        {
            while(i <= e && arr[i]<=pivot) i++;
            while(arr[j] > pivot) j--;
            if(i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = pivot;
        arr[s] = temp;
        return j;
    }
}
