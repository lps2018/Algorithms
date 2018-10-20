package com.Trials.Search;

/**
 * Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
 * If x matches with an element, return the index.
 * If x doesn’t match with any of elements, return -1.
 * The time complexity of above algorithm is O(n)
 */
public class LinearSearch {
    public static void main(String[] args) {

        int array[] ={1,2,3,4,5};
        int n = 5;
        int x =4;
        System.out.println( search(array,n,x));
    }


    static int search(int arr[], int n, int x)
    {

        for (int i = 0; i < n; i++)
            if (arr[i] == x)

                return i;
        return -1;
    }
}
