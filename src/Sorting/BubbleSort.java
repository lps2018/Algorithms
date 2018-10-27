package Sorting;

public class BubbleSort {
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {5, 3, 1, 9, 8, 2, 4,7};
        ob.bubbleSort(arr);
       // System.out.println("Sorted array");
      ob.printArray(arr);
    }

    void bubbleSort(int array[])
    {
        int j =0;
        for(int i =0; i<array.length;i++)
        {
            //  for (int j = 0; j < n-i-1; j++)
            for( j =0; j<array.length-1;j++)
            {
              if(array[j]>array[j+1])
              {
                  int temp = array[j];
                  array[j] = array[j+1];
                  array[j+1] = temp;
              }
            }
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
        {
           System.out.print(arr[i] + " ");

        }
       System.out.println();System.out.println();

        System.out.print("Second largest element:"+arr[n-2] + " ");
    }
}
