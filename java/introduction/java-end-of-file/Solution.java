import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
	    
            n++;
            System.out.println(n + " " + s);
        }

	scanner.close();
    }
}
