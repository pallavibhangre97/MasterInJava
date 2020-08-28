package com.javalearning.datastructure.linkedlist;

public class Runner {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(12);
        list.insert(13);
       //list.insert(14);
       // list.insert(15);

        //list.show();
        ///System.out.println("After inserting at Start:");
       //list.insertAtStart(1000);
        list.show();
       int s= list.size();
        //System.out.println("size="+s);
        //list.delete1(13);

        //list.insertAtPos(4,3);

        //System.out.println("After insertAt pos");
        s= list.size();
        System.out.println("size="+s);
        //list.show();
        list.middle();
        list.reverse();
        list.show();


    }
}
