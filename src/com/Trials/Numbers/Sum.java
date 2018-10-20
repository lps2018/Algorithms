package com.Trials.Numbers;

public class Sum {
    public static void main(String[] args)
    {
        int n1 =3;
        int n2= 5;
       int result = printSum( n1,n2)  ;
        System.out.println(result);
    }

    public static int printSum(int number1,int number2)
    {
        int sum=0;
            sum = number1+number2;
        return sum;
    }
}
