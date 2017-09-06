import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        long sum = 0;
               
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            sum += arr[arr_i];
        }
        
        long min, max;
        
        min = max = sum - arr[0];
        
        for (int i = 1; i < 5; i++) {
            if (sum - arr[i] < min) {
                min = sum - arr[i];
            }

            if (sum - arr[i] > max) {
                max = sum - arr[i];
            }      
        }
        
        System.out.println(min + " " + max);
    }
}
