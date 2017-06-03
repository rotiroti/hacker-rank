import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int hourGlassSum(int arr[][], int row, int col) {
        return arr[row][col] + arr[row][col+1] + arr[row][col+2] + 
            arr[row+1][col+1] + arr[row+2][col] + arr[row+2][col+1] + 
            arr[row+2][col+2];
    }    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int maximumHourGlassSum = -63;
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int currentHourGlassSum = hourGlassSum(arr, row, col);
                
                if (currentHourGlassSum > maximumHourGlassSum) {
                    maximumHourGlassSum = currentHourGlassSum;   
                }
            }
        }
        
        System.out.println(maximumHourGlassSum);
    }    
}
