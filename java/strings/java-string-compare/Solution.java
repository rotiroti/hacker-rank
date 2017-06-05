import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int k = in.nextInt();
        
        in.close();

        String min = str.substring(0, k);
        String max = str.substring(0, k);        
        String curr;
        
        for (int i = 1; i < (str.length() - k + 1); i++) {
            curr = str.substring(i, i + k);
            
            if (curr.compareTo(max) > 0) {
                max = curr;
            } else if (curr.compareTo(min) < 0) {
                min = curr;
            }            
        }

        System.out.println(min);
        System.out.println(max);
    }
}
