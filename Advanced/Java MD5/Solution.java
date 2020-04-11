import java.io.*;
import java.util.*;
import java.security.*;


public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException 
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str.getBytes());
        byte[] digest = md.digest();
        for (byte b : digest) {
            System.out.format("%02x", b);
        }
    }
}
