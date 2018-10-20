package com.Trials.Array;
import java.lang.*;


public class BubbleSort {
    private static final int[] INT_ARRAY = {-2, 10, -1, 3, 4, 8};

    public static void main(String[] args) {
        findSecondLargest(INT_ARRAY);
        printArray(INT_ARRAY);
    }

    static void findSecondLargest(int[] array)
    {

        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = 0; j < array.length-1; j++)
            {
                if (INT_ARRAY[j] > INT_ARRAY[j+1])
                {
                    int temp = INT_ARRAY[j];
                    INT_ARRAY[j] = INT_ARRAY[j+1];
                    INT_ARRAY[j+1] = temp;
                }
            }

        }
        System.out.println("Largest element is: "+INT_ARRAY[array.length-1] + " ");
        System.out.println("Second largest element is: "+INT_ARRAY[array.length-2] + " ");
        System.out.println("Second smallest element is: "+INT_ARRAY[1] + " ");
        System.out.println("Smallest element is: "+INT_ARRAY[0] + " ");
        System.out.println("middle element is: "+INT_ARRAY[(array.length-1)/2] + " ");
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        System.out.println("Sort array in ascending order:");
        for (int i = 0; i < n; ++i) {
            System.out.print(INT_ARRAY[i] + " ");
            // System.out.println();
        }

    }
}