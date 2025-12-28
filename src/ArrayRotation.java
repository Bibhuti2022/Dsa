public class ArrayRotation {
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5,67};
        int k = 2;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);

        print(arr);

    }

    private static void print(int[] arr) {
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
    }

    public static void reverse(int[]arr,int s, int e)
    {
        while(s<=e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

    }
}
