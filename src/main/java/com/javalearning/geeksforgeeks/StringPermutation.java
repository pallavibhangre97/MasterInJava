/*permutation of string
refer for explaination =https://www.youtube.com/watch?v=GuTPwotSdYw
refer for code = https://www.youtube.com/watch?v=AfxHGNRtFac

* */


package com.javalearning.geeksforgeeks;
import java.util.*;
public class StringPermutation {
    public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        StringPermutation permutation = new StringPermutation();
        permutation.permute(str, 0, n-1);
    }


    private void permute(String str, int l, int r)
    {

        if (l == r)
            System.out.println(str);
        else
        {

            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }


    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
/*import java.util.*;
import java.io.*;
import java.lang.*;

public class GFG {

    // Utility function to print the contents
    // of the ArrayList
    static void printArrayList(ArrayList<String> arrL)
    {
        Collections.sort(arrL);
        arrL.remove("");

        for (int i = 0; i < arrL.size(); i++)
            System.out.print(arrL.get(i) + " ");
    }

    // Function to returns the arraylist which contains
    // all the permutation of str
    public static ArrayList<String> getPermutation(String str)
    {

        // If string is empty
        if (str.length() == 0) {

            // Return an empty arraylist
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }

        // Take first character of str
        char ch = str.charAt(0);

        // Take sub-string starting from the
        // second character
        String subStr = str.substring(1);

        // Recurvise call
        ArrayList<String> prevResult = getPermutation(subStr);

        // Store the generated permutations
        // into the resultant arraylist
        ArrayList<String> Res = new ArrayList<>();

        for (String val : prevResult) {
            for (int i = 0; i <= val.length(); i++) {
                Res.add(val.substring(0, i) + ch + val.substring(i));
            }
        }

        // Return the resultant arraylist
        return Res;
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String str = sc.next();
            printArrayList(getPermutation(str));
            System.out.println();
        }


    }
}*/