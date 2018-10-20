package com.Trials.Numbers;

public class DecimalToBinary {
    public static void main(String[] args) {

        int number = 8;
        convert(number);

    }


    public static void convert(int number) {
        int reminder = 0;

        // counter for binary array
        int i = 0;
        int binary[] = new int[25];
        while (number > 0)
        {
           // reminder = number % 2;
            binary[i] = number % 2;
            number = number / 2;
            i++;
            // System.out.println(reminder);

             System.out.print(binary[i]);
        }

        for (int j = i - 1; j >= 0; j--)
        {
            System.out.print(binary[j]);
        }


    }
}
