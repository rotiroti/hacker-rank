import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> l = new ArrayList<Integer>();
        
        // Retrieving list elements
        for (int i = 0; i < n; i++) {
            l.add(i, in.nextInt());
        }
        
        // Read the number of queries to be performed on the list
        int q = in.nextInt();
        
        for (int i = 0; i < q; i++) {
            String query = in.next();
            
            if (query.equals("Insert")) {
                int x = in.nextInt();
                int y = in.nextInt();
                
                l.add(x, y);
            } else if (query.equals("Delete")) {
                int x = in.nextInt();
                
                l.remove(x);
            } else {
                throw new IllegalArgumentException("Query '" + query + "' is not supported");
            }
        }
        
        in.close();
        
        for (Integer el : l) {
            System.out.print(el + " ");
        }
    }
}
