import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0;
        int max = 0;
        
        while (n > 0) {
            counter = ((n & 1) == 1) ? counter + 1 : 0;

            if (max < counter) {
                max = counter;
            }
	    
            n >>= 1;
        }
        
        System.out.println(max);   
    }
}
