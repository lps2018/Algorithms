package com.SnapIot.OOPS.EqualsHashcode;

import com.sun.tools.classfile.Opcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ObjectTest {
    public static void main(String[] args) {
        Contact contact1 = new Contact(1,"Johns","8582208066");
        Contact contact2 = new Contact(2,"James","4149140597");
        Contact contact3 = contact1;
       /* System.out.println("contact1 and contact2 are equal "+(contact1==contact2));
        System.out.println("contact1 and contact3 are equal "+(contact1==contact3));

        System.out.println("contact1 and contact2 are equal "+(contact1.equals(contact2)));
        System.out.println("contact1 and contact3 are equal "+(contact1.equals(contact3)));*/

   if (contact1 == new Contact(1,"Johns","8582208066") )
    {
        // System.out.println("contact1 and contact2 are equal ");
    }
    // else
    //System.out.println("contact1 and contact2 are not equal ");

        if (contact1 == contact3 )
        {
           // System.out.println("contact1 and contact3 are == ");
        }
        // else
       // System.out.println("contact1 and contact2 are not == ");

        List<Contact> list = new ArrayList<>();
        list.add(contact1);
        list.add(contact2);

        if (list.contains(contact1) )
        {
            // System.out.println("yes");
        }
        /* else
            System.out.println("no");*/

        if (list.contains(new Contact(1,"Johns","8582208066")) )
        {
           // System.out.println("yes");
        }
        //else
           // System.out.println("no");


        Set<Contact> set = new HashSet<>();
        set.add(contact1);
        set.add(contact2);

        if (set.contains(contact1) )
        {
             //System.out.println("yes");
        }
        // else
            //System.out.println("no");

        if (set.contains(new Contact(1,"Johns","8582208066")) )
        {
             System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }

}

