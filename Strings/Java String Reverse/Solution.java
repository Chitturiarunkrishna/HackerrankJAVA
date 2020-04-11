import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String ss=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String s = new StringBuilder(ss).reverse().toString();
        if(ss.equals(s))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}



