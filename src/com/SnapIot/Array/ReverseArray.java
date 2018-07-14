package com.SnapIot.Array;

import java.util.Arrays;

public class ReverseArray
{
    public static void main(String[] args)
    {
         int array[] ={1,2,3,4,5};
         reverseArray(array);
    }

    public static void reverseArray(int array[])

    {
        int i =0;
        int start = 0;
        int end =array.length-1;
        //int end = array[length];
        int temp;
         while(start<end) {

             for (i = 0; i < end; i++) {
                 temp = array[start];
                 array[start] = array[end];
                 array[end] = temp;

                 start++;
                 end--;
             }
         }
        System.out.println(Arrays.toString(array));
    }
}
