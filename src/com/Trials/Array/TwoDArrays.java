package com.Trials.Array;

public class TwoDArrays {
    public static void main(String[] args) {
           // declare and construct a 2D array
            int[][] uneven =
                    { { 1, 9, 4 },
                            { 0, 2},
                            { 0, 1, 2, 3, 4 } };

            // print out the array
            for ( int row=0; row < uneven.length; row++ )
            {
                //System.out.print("Row " + row + ": ");

               for ( int col=0; col < uneven[row].length; col++ )

                     System.out.print( uneven[row][col] + " ");
                     System.out.println();
            }

        }
    }

