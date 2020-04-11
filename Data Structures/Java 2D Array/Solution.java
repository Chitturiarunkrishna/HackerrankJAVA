import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{

    public static void main(String[] arg)
    {
        int a[][] = new int[6][6];
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for(int i=0; i<6; i++)
        {
            for(int j=0; j<6; j++)
            {
                a[i][j] = sc.nextInt();

                if (i > 1 && j > 1) 
                {
                    int s = a[i][j] 
                            + a[i][j - 1] 
                            + a[i][j - 2] 
                            + a[i - 1][j - 1] 
                            + a[i - 2][j] 
                            + a[i - 2][j - 1] 
                            + a[i - 2][j - 2];

                    if(s>max)
                    {
                        max=s;
                    }
                }
            }
        }

        System.out.println(max);
        
    }
}
