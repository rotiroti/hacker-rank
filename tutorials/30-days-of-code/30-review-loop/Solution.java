import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String tests[] = new String[n];
        
        /* Workaround to consume rest of the line after reading an int */
        scan.nextLine();
        
        for (int i = 0; i < n; i++) {
            tests[i] = scan.nextLine();
        }

        String even, odd;
        
        for (int i = 0; i < n; i++) {
            even = odd = "";
            
            for (int j = 0; j < tests[i].length(); j++) {
                if (j % 2 == 0) {
                    even += tests[i].charAt(j);
                } else {
                    odd += tests[i].charAt(j);
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}
