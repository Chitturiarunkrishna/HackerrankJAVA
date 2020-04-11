import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{
    

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        sc.close();
        
        if(n.isProbablePrime(10))
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}
