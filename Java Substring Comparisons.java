import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        int n=k;
        int j=0;
        smallest=s.substring(0,n);
        largest=s.substring(0,n);
        String t="";
        for(int i=0;n<=s.length();i++,n++)
        {
            t=s.substring(i,n);
            if(smallest.compareTo(t)>0)
            smallest=t;
            
            if(largest.compareTo(t)<0)
            largest=t;
            
            // n=n+3;
            // j=j+3;
            // if(n>s.length()||j>s.length()||n-j<3)
            // {n=s.length();
            // j=n-4;}
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
