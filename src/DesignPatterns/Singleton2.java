package DesignPatterns;



public class Singleton2
{
    private static Singleton2 singleton = null;

    private Singleton2()
    {
    }

    public static synchronized Singleton2 getSingleton()
    {
        if(singleton==null)
        {
            singleton = new Singleton2() ;
        }

        return singleton;
    }
}
