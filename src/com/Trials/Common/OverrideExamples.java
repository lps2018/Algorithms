package com.Trials.Common;

import java.util.HashMap;

public class OverrideExamples
{


    public static void main(String[] args) {

        HashMap<String, Contact> contactHashMap = new HashMap<>();
        Contact contact1 = new Contact(1,"KV1","123");
       // System.out.println(contact1);
        Contact contact2 = new Contact(2,"KV2","123");
        contactHashMap.put("1", contact1);
        contactHashMap.put("2", contact2);
        Contact contact3;
        contact3 =contact1;

       // System.out.println("contact1 "+contact1);
       // System.out.println("contact2 "+contact2);

        System.out.println("Are contact1 and contact2 equal " +(contact1 == contact3));
       // System.out.println("Are contact hashmap are equal " +(contactHashMap.get("1") == contactHashMap.get("2")));
        System.out.println("Are contact1 and contact2 equal with equals " +(contact1.equals(contact3)));

}


}

class Contact{

    private int contactId;
    private String name;
    private String phoneNumber;

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact(int contactId, String name, String phoneNumber) {
        this.contactId = contactId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

   /* public String toString()
    {

        return contactId+" " + name +" "+phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        Contact contact = (Contact)o;
        return contact.contactId ==this.getContactId() &contact.name ==this.getName()
                &contact.phoneNumber ==this.getPhoneNumber();
    }

    @Override
    public int hashCode() {

        return 12* contactId + name.hashCode()+phoneNumber.hashCode();
    }*/
}