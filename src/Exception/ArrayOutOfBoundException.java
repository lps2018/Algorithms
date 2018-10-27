package Exception;

public class ArrayOutOfBoundException {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5};

        try{
            for (int i=0; i<=ar.length; i++)
                System.out.println(ar[i]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is out of Bounds"+e);
        }
    }
}
