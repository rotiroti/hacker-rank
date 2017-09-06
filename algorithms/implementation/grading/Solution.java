import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int roundNextMultiple(int num) {
        
        /**
         * Since grades are positive, we can use
         * the following formula to calculate the
         * next multiple of 5.
         * In case the grades could also take negative
         * values we need to slightly modify the current
         * formula.
         */
        
        return ((num + 4) / 5) * 5;
    }
    
    static int[] solve(int[] grades){
       
        for (int i = 0; i < grades.length; i++) {
            
            if (grades[i] >= 38 && grades[i] <= 100) {
                int next = roundNextMultiple(grades[i]);
                
                if ((next - grades[i]) < 3) {
                    grades[i] = next;
                }
            }            
        }
        
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
