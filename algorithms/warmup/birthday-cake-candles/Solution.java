import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        
        if (n == 0) {
            return 0;
        }
        
        if (n == 1) {
            return 1;
        }
        
        int height = ar[0];
        int candles = 1;
        
        for (int i = 1; i < n; i++) {
            if (height < ar[i]) {
                height = ar[i];                
                candles = 1;
            } else if (height == ar[i]) {
                candles++;
            }
        }
        
        return candles;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
	
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
	
        int result = birthdayCakeCandles(n, ar);
	
        System.out.println(result);
    }
}
