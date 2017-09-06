import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    protected static int hourGlassSum(int[][] arr, int i, int j) {
        return arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] +
            arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
    }    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
	
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        int maximumHourGlassSum = -63;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int currentHourGlassSum = hourGlassSum(arr, i, j);
                
                if (maximumHourGlassSum < currentHourGlassSum) {
                    maximumHourGlassSum = currentHourGlassSum;
                }
            }
        }
        
        System.out.println(maximumHourGlassSum);
    }
}
