import java.io.*;
import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] frequencies = new int[26];

        for (int i = 0; i < a.length(); i++) {
            frequencies[Character.toLowerCase(a.charAt(i)) - 'a']++;
        }

        for (int i = 0; i < b.length(); i++) {
            if (frequencies[Character.toLowerCase(b.charAt(i)) - 'a'] == 0) return false;
            frequencies[Character.toLowerCase(b.charAt(i)) - 'a']--;
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
