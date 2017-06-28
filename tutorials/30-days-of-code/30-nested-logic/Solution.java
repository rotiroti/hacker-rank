import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d_a = in.nextInt();
        int m_a = in.nextInt();
        int y_a = in.nextInt();
        int d_e = in.nextInt();
        int m_e = in.nextInt();
        int y_e = in.nextInt();
        int fine = 0;
        
        in.close();
        
        if (y_e < y_a) {
            fine = 10000;
        }
        
        if (y_a == y_e && m_e < m_a) {
            fine = 500 * (m_a - m_e);
        }        
        
        if (y_a == y_e && m_a == m_e && d_e < d_a) {
            fine = 15 * (d_a - d_e);
        }

        System.out.println(fine);
    }
}
