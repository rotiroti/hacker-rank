import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws ParseException{
        Scanner in = new Scanner(System.in);
        String time = in.next();        
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssaa");
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");        
        Date date = parseFormat.parse(time);
        
        System.out.println(displayFormat.format(date));
    }
}
