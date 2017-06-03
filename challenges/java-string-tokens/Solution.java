import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
	
        scan.close();
        
	String[] tokens = s.trim().split("[ !,?\\._'@]+",0);
		
	if (tokens.length == 1 && tokens[0].equals("")) {
	    System.out.println(0);
	} else {
	    System.out.println(tokens.length);
	    
	    for (String token : tokens) {
		System.out.println(token);
	    }
	}  
    }
}
