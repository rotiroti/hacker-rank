import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    protected static boolean isPrime(int n) {
        
        if (n <= 1) return false;
        
        if (n <= 3) return true;
        
        if (n % 2 == 0 || n % 3 == 0)   return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i+2) == 0)   return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();

        for (int t = 0; t < tests; t++) {
            int n = in.nextInt();

            System.out.println(isPrime(n) ? "Prime" : "Not prime");
        }

        in.close();
    }
}
