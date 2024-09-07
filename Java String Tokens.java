import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
         scan.close();
        
        // Use a list to store substrings
        List<String> substrings = new ArrayList<>();
        
        // Temporary string to build substrings
        StringBuilder temp = new StringBuilder();
        
        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                // If the character is a letter, append it to the temp string
                temp.append(ch);
            } else {
                // If the character is not a letter and temp is not empty, add temp to substrings
                if (temp.length() > 0) {
                    substrings.add(temp.toString());
                    temp.setLength(0); // Reset temp
                }
            }
        }
        
        // Add the last substring if there is any
        if (temp.length() > 0) {
            substrings.add(temp.toString());
        }
        
        // Output the number of substrings and the substrings themselves
        System.out.println(substrings.size());
        for (String str : substrings) {
            System.out.println(str);
        }
    }
}

