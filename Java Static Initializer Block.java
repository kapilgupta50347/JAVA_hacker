import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

//Write your code here
public static int B;
public static int H;
private static boolean flag()
{
Scanner sc =new Scanner(System.in);
B=sc.nextInt();
H=sc.nextInt();

if(B<=0||H<=0)
{
    System.out.println("java.lang.Exception: Breadth and height must be positive");
    return false;
}
else
{
    return true;
}
}
public static boolean flag = flag(); 

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

