import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String line;
        int i = 1;
        while(input.hasNext())
        {
            line = input.nextLine();
            System.out.println(i + " "+ line);
            i++;
        }
    }
}
