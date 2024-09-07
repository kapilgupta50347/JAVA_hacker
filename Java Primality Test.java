import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger b=new BigInteger(n);
        Boolean b1,b2,b3;
        b1=b.isProbablePrime(-1);
        b2=b.isProbablePrime(0);
        b3=b.isProbablePrime(1);
        
        if(b1==true&&b2==true&&b3==true)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}
