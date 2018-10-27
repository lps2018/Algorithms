package Iterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTester {
    public static void main(String args[]) {
        Vector vector = new Vector();
        vector.add("Sunday");
        vector.add("Monday");
        vector.add("Tuesday");
        vector.add("Wednesday");
        vector.add("Thursday");
        vector.add("Friday");
        vector.add("Saturday");
        Enumeration enumeration = vector.elements();
        while(enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }
    }
}
