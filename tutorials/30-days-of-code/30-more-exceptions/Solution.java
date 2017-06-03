import java.util.*;
import java.io.*;


class Calculator {
    
    public int power(int n, int p) {

        if (n < 0 || p < 0) {
            throw new IllegalArgumentException ("n and p should be non-negative");
        }
        
        int result = 1;

        while (p > 0) {
            if ((p % 2) != 0) {
                result *= n;
            }

            p >>= 1;
            n *= n;
        }
	
        return result;            
    }
}

public class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
	
        while (t-- > 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
	    
            try {
                int ans = myCalculator.power(n, p);
		
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
	
        in.close();
    }
}
