package Arrays;

public class largestSmallest {
    public static void main(String[] args) {
        FindLargestAndSmallest(new int[]{-110,1, 2, 3, 4, 6, 9, 8});

    }

    private static void FindLargestAndSmallest(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number:numbers) {
            if(number < min){
                min = number;
            }
            if(number > max){
                max = number;
            }
        }
        System.out.println("max "+max);

        System.out.println("min "+min);
    }

}
