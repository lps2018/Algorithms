package com.Trials.Array;

public class SecondLargest
{
    public static void main(String[] args) {

        int [] array ={2,7,6,3,1,-2};

        secondLargest(array);
    }


    public static int secondLargest(int [] array)
    {
       int length = array.length;
       int   smallest = Integer.MAX_VALUE;
       int    largest = Integer.MIN_VALUE;
       for(int i =1; i<length;i++)
       {
        if(array[i]<smallest){
            smallest =array[i];

        }
           if(array[i]>largest){
               largest =array[i-1];


           }
       }
        System.out.println(smallest);
        System.out.println(largest);
       return 0;
    }
}
