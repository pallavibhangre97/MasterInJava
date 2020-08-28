package com.javalearning.datastructure.linkedlist;

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null)
            head = node;
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null)
            head = node;
        else {
            node.next = head;
            head = node;
        }

    }

    public void insertAtPos(int pos,int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        int len=size();

        if(pos>len) {
            System.out.println("position must be less than size:");
            return;
        }
            Node n = head;
            int count=1;
            while (count!=pos-1)
            {
                n = n.next;
                count++;
            }
            node.next=n.next;
            n.next=node;

    }

    public void show() {
        if (head == null)
            System.out.println("list is empty");
        else {
            Node n = head;
            while (n.next != null) {
                System.out.println(n.data);
                n = n.next;
            }
            System.out.println(n.data);
        }
    }

    public int size() {
        int cnt = 0;
        if (head == null)
            return 0;
        else {
            Node n = head;
            while (n.next != null) {
                cnt++;
                n = n.next;
            }
            return cnt + 1;
        }
    }

    public void delete1(int data) {
        int s = size();
        if (head == null)
            System.out.println("list is empty");

        else if (s == 1) {
            if (head.data == data)
                head = null;
        }
        else if(head.data==data){
            head=head.next;
        }
        else {
            Node n = head;
            Node prev = null;
            while (n.next != null) {
                if (n.data == data) {
                    prev.next = n.next;
                    return;
                }
                prev = n;
                n = n.next;
            }
            if (n.data == data)
                prev.next = null;
        }
    }

    public void delete(int data) {
        Node n = head;
        if (head == null)
            System.out.println("list is empty");

        do {
            if (n.data == data) {
                if(n.next==null){
                    head = n.next==null ? null : head.next;
                }
                return;
            }

            if (n.next.data == data) {
                 n.next = n.next.next == null ? n.next = null : n.next.next;
                return;
            }
        } while ((n = n.next) != null);
    }

    public void middle()
    {
         Node n=head;
         int size=size(),mid=1;
         if(size==0){
             System.out.println("list is empty");
         }
        else if(size==1){
             System.out.println("middle element:"+head.data);}
        else {
        size = (int) Math.round(size / 2);

        while (mid != size) {
            n = n.next;
            mid += 1;
        }

        System.out.println("middle element:" + n.next.data);
    }
    }

    public void reverse()
    {
        int size=0;
        Node current = head;
        Node prev = null;
        Node next = null;

            while (current != null)
            {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;




    }
}
