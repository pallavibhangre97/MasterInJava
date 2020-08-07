package com.javalearning.string;

public class AllMethodOfString {


    public static void main(String args[]) {
        //com.string.AllMethodOfString am = new com.string.AllMethodOfString();
       testStringBehaviour();
      testString();
    }
   public static void testString(){
        String s1 = "pallavi";
        String s2 = "SACHIN";
        String s3 = "SACHIN";

        String s4 = new String("SACHIN");
        System.out.println(s1==s2);  // f
        System.out.println(s2==s3);  // t
        System.out.println(s3==s4);  // t //f
    }


    public static  void testStringBehaviour() {
        String s = new String("pallavi");
        String s1 = "pallavi";
        String s2 = "SACHIN";
        String s3 = new String("         pallavi    ");
        System.out.println("first string=" + s);
        System.out.println("second string=" + s1);
        System.out.println("length=" + s.length());
        System.out.println("Equals() method=" + s.equals(s1));
        System.out.println("EqualsIgnoreCase() method=" + s.equalsIgnoreCase(s2));
        System.out.println("compareTo method=" + s.compareTo("ppallavi"));
        System.out.println("isEmpty method=" + s.isEmpty());
        System.out.println("charAt method=" + s.charAt(2));
        System.out.println("indexOf method=" + s.indexOf('l'));
        System.out.println("method lastIndexOf=" + s.lastIndexOf('l'));
        System.out.println("method toUpperCase=" + s.toUpperCase());
        System.out.println("method toLowerCase=" + s.toLowerCase());
        System.out.println("method substring(index)=" + s.substring(4));
        System.out.println("method substring(startIndex,LastIndex)=" + s.substring(2, s.length()));
        System.out.println("-----toCharArray() method-----------");
        char[] ch = s.toCharArray();
        for (char i : ch) {
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println(" char replace method= " + s.replace('p', 'S'));
        System.out.println(s);
        System.out.println(" string replace method= " + s.replace("pallavi", "pallo"));
        System.out.println("endswith method=" + s.endsWith("p"));
        System.out.println("startswith method=" + s.startsWith("p"));
        System.out.println("concat method =" + s.concat("sachin"));
        System.out.println(s3);
        System.out.println("trim method=" + s3.trim());
        double val = 20.3;   //20 (can be byte ,double,int ,short )is converted into string by using valueof()
        boolean b = true;
        char c = 'p';
        String s4 = String.valueOf(val);
        String s5 = String.valueOf(b);
        System.out.println("double to string=" + s4);
        System.out.println("boolean  to string=" + s5);
        s5 = String.valueOf(c);
        System.out.println("character to string=" + s5);
    }
}
