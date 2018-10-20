package com.Trials.Common;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] array = {2, 7, 6, 3, 1, -2};

        secondLargest(array);
    }


    public static int secondLargest(int[] array) {
        int length = array.length;
        int temp;
        for (int i = 0; i < length; i++)
        {
            for (int j = i + 1; j < length; j++)
            {
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i]= array[j];
                    array[j] = temp;

                }
            }


        }

        System.out.println(array[length-2]);
        return 0;
    }
}