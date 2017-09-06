import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        double positives, negatives, zeros;
        
        positives = negatives = zeros = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positives++;
            } else if (arr[i] < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }
        
        DecimalFormat f = new DecimalFormat("0.000000");
	
        System.out.println(f.format(positives / n));
        System.out.println(f.format(negatives / n));
        System.out.println(f.format(zeros / n));
    }
}
