/*https://www.youtube.com/watch?v=ugTUvNhHd9c&list=PLVlQHNRLflP_OxF1QJoGBwH_TnZszHR_j&index=5
   dynamic array refer https://www.youtube.com/watch?v=jl8qkjhbywo&list=PLsyeobzWxl7oRKwDi7wjrANsbhTX0IK0J&index=12*/
package com.javalearning.datastructure.stack;

import java.util.*;

public class Stack {

    static Scanner sc=new Scanner(System.in);
    static int stack[],size,top=-1;

    static {
        create();
    }

    static void create(){
        System.out.println("enter size of stack");
        size=sc.nextInt();
        stack =new int[size];
        System.out.println("Stack created ....");
    }
    public static void main(String args[]){
        int item;
        while (true)
        {
        System.out.println("1.push");
        System.out.println("2.pop");
        System.out.println("3.peek");
        System.out.println("4.display");
       System.out.println("5.exit");
        System.out.println("Enter your choice:");
        int ch=sc.nextInt();

            switch(ch)
            {
                case 1 :
                         System.out.println("Enter Element :");
                         item=sc.nextInt();
                         push(item);
                         break;
               case 2 : item= pop();
                        if(item==-1)
                            System.out.println("Stack underflow");
                        else
                        System.out.println(item + " poped");
                        break;
                 case 3 : item=peek();
                     if(item==-1)
                         System.out.println("Stack underflow");
                     else
                         System.out.println("top of Stack :"+item);
                         break;
                case 4 : display();
                         break;
                case 5 : System.exit(1);
                         break;
                default :
                    System.out.println("Invalid choice");
            }
        }
    }

   static void push(int no){
        if(isFull())
            System.out.println("Stack is overflow");
        else
            stack[++top]=no;
    }

    static boolean isFull()
   {
       if(top==size-1)
           return true;
       else
           return false;
   }
   static int pop(){
        if(top==-1)
           return -1;
        else
            return stack[top--];

   }

   static int peek(){
        if(top==-1)
            return -1;
        else
            return stack[top];
   }
   static void display() {
       if (top == -1) {
           System.out.println("no elements in stack");
       } else {
           System.out.println("elements of stack are:");
           for (int i = 0; i <= top; i++) {
               System.out.println(stack[i]);
           }
       }
   }

}
