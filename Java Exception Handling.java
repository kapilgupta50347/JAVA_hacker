import java.util.Scanner;
import java.util.*;
import java.io.*;
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    public long power(int a,int b) throws Exception
    {
        long mul=1;
        if(a==0&&b==0)
        {
            //System.out.println("java.lang.Exception: n and p should not be zero.");
             throw new Exception("n and p should not be zero.");
        }
        
        if(a<0||b<0)
        {
            //System.out.println("java.lang.Exception: n or p should not be negative.");
            throw new Exception("n or p should not be negative.");
        }
        
       
        for(int i=0;i<b;i++)
        {
            mul=mul*a;
        }
        
        return mul;
        
        
    }
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
