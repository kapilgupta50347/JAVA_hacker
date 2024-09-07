import java.util.Scanner;

public class Solution {
    

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();
        
        // If lengths are different, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }
        
        // Convert strings to char arrays
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        
        // Sort the char arrays using Bubble Sort
        bubbleSort(aArray);
        bubbleSort(bArray);
        
        // Compare the sorted arrays
        return areArraysEqual(aArray, bArray);
    }
    
    // Bubble Sort implementation for char array
    static void bubbleSort(char[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    // Function to compare two char arrays
    static boolean areArraysEqual(char[] a, char[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
