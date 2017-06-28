import java.io.*;
import java.util.*;

public class Solution {
    
    private static int[] generateSequence(int n) {
        int seq[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            seq[i] = i+1;
        }
        
        return seq;
    }

    public static int bitwiseAnd(int n, int k) {
        int seq[] = generateSequence(n);
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int tempMax = seq[i] & seq[j];
                
                if (tempMax < k && tempMax > max) {
                    max = tempMax;
                }
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        
        for (int i = 0; i < tests; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            
            System.out.println(bitwiseAnd(n, k));
        }
        
        in.close();
    }
}
