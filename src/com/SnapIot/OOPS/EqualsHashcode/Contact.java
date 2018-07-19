package com.SnapIot.OOPS.EqualsHashcode;

import java.util.Objects;

public class Contact {
    private int contactId;
    private String name;
    private String phoneNumber;

    public Contact(int contactId, String name, String phoneNumber) {
        this.contactId = contactId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

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

    public String getphoneNumber() {
        return phoneNumber;
    }

    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   /* @Override
    public boolean equals(Object o) {

        return super.equals(o);
    }*/
   @Override
   public boolean equals(Object o) {
       Contact c = (Contact) o;
       return (c.getContactId() == this.getContactId()&& c.getName() == this.getName());
   }
    /*@Override
    public int hashCode() {

        return super.hashCode();
    }*/

    @Override
    public int hashCode() {

        return 12* contactId + name.hashCode()+phoneNumber.hashCode();
    }


    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", name='" + name + '\'' +
                ", phoenNumber=" + phoneNumber +
                '}';
    }
}
