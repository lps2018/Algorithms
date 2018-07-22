package Exception;

public class SystemExit {
    public static void main(String[] args) {
        try{
            System.out.println("before exit");
         System.exit(0);
            System.out.println("after exit");
        }

        catch (Exception e)
        {
            System.out.println(""+e.getMessage());
        }
        finally
        {
            System.out.println("finally");
        }
    }
}
