import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String repeat(char c, int n) {
        String s = "";
        
        for (int i = 0; i < n; i++) {
            s += c;
        }
        
        return s;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(repeat(' ', n-i) + "" + repeat('#', i));
        }
    }
}
