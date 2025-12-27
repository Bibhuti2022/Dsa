public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,3,-1};
        split(arr,0,arr.length-1);
        printArr(arr);
    }
    public static void split(int[] arr, int s, int e)
    {
        if(s >= e) return;
        int mid = s+(e-s)/2;
        split(arr,s,mid);
        split(arr,mid+1,e);
        merge(arr,s,mid,e);
    }

    private static void merge(int[] arr, int s, int mid, int e) {
        int[] temp = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j<=e)
        {
            if(arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while(i<=mid) temp[k++] = arr[i++];
        while(j<=e) temp[k++] = arr[j++];
        for(int x = s; x<=e; x++)
        {
            arr[x] = temp[x-s];
        }
    }
    private static void printArr(int[] arr)
    {
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
    }

}

