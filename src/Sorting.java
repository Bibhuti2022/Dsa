public class Sorting {
    public static void main(String[] args) {
        int[] arr={2,4,1,6,4,8,3};
        //insertionSort(arr);
        //bubbleSort(arr);
        selectionSort(arr);
        printArr(arr);
    }
    public  static void printArr(int[] arr)
    {
        for(int x : arr)
        {
            System.out.print(x+" ");
        }
    }
    public static void insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length;i++)
        {
            int val = arr[i];
            int j = i-1;
            while(j >=0 && arr[j] >  val)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[++j] = val;
        }
    }
    public static void bubbleSort(int[] arr)
    {
        for(int i = 0 ; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr)
    {

        for(int i = 0; i < arr.length; i++)
        {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int j = i ; j < arr.length; j++)
            {
                if(arr[j] < min)
                {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
