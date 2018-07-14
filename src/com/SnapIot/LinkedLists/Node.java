package com.SnapIot.LinkedLists;

public class Node {
    Node next; //node next and it takes value data
    int data;

    public Node( int data)
    {
        this.data = data;
    }

    public void append (int data) //append takes data as input
    {
        Node current = this;      // pointer
        while(current.next!=null)
        {
         current = current.next; // increment pointer
        }
        current.next = new Node (data); // add data
    }
}
