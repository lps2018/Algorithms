package Exception;

public class ThrowExample {
    public static void main(String[] args)  {
        int a= 1;
        int b=12;

        try
        {
            findSum(a,b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static int findSum(int a, int b ) throws Exception {
        int sum =0;
        if(a<5 || b< 5)
        {
                throw new Exception("INVALID NUMBER");

        }

        else
        {
          sum = sum+a+b;
            System.out.println(sum);
        }
        return sum;
    }
}
