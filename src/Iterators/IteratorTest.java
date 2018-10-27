package Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        // add elements to the array list
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");

        Iterator iterator = arrayList.iterator();

        while(iterator.hasNext())
        {
            Object element = iterator.next();
            System.out.print(element + " ");
        }


        ListIterator listIterator = arrayList.listIterator();
    }
}
