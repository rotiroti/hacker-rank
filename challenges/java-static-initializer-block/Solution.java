import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int B;
    static int H;
    static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }            
        } catch (Exception e) {
            System.out.println(e);
        }        
    }

    public static void main(String[] args){
	if(flag) {
	    int area = B * H;
	    
	    System.out.print(area);
	}
    }
}
