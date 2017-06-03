import java.util.*;
import java.util.Scanner;

class MyCalculator {
    public static int power(int n, int p) throws Exception {
        
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        
        if (p == 0) {
            return 1;
        } else if (p % 2 == 0) {
            return power(n, p/2) * power(n, p/2);
        } else {
            return n * power(n, p/2) * power(n, p/2);
        }
    }
}

class Solution {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	while ( in .hasNextInt()) {
	    int n = in .nextInt();
	    int p = in .nextInt();
	    MyCalculator my_calculator = new MyCalculator();
	    
	    try {
		System.out.println(my_calculator.power(n, p));
	    } catch (Exception e) {
		System.out.println(e);
	    }
	}
    }
}
