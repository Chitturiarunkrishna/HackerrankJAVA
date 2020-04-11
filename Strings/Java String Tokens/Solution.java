import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = s.trim();
        if (s.length()>400000)
        {
            return ;
        }
        else if(s.length()==0)
        {
            System.out.println(0);
        }
        else
        {
           String[] words = s.split("[!,?.*_'@\\ ]+");
             int count = words.length;
               System.out.println(count);
               for(String word : words)
               {
                   System.out.println(word);
               }    
        }
        
        scan.close();
    }
}

