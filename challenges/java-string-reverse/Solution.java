import java.io.*;
import java.util.*;

public class Solution {

    public static boolean palindrome(String str) {

        for (int inf = 0, sup = str.length() - 1; sup > inf; inf++, sup--) {
            if (str.charAt(inf) != str.charAt(sup)) {
                return false;
            }
        }
        
        return true;
    }
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
	
        sc.close();
        System.out.print(palindrome(A) ? "Yes" : "No");
    }
}
