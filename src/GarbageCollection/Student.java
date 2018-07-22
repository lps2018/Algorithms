package GarbageCollection;

public class Student
{
    String input;
    public static void main(String[] args) {
        Student s1= new Student();
        s1=null;
        System.out.println(s1);

        // reassigning
        Student s2= new Student();
        Student s3= new Student();
         s2= new Student();
         s2.input ="kv";
         s3=s2;
         String text =   s3.input;
        System.out.println(text);

        m1();
    }

    public  static void m1()
    {
        Student s5= new Student();
        Student s6= new Student();
    }
}
