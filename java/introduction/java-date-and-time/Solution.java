import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar calendar = Calendar.getInstance();
        
        try {
            calendar.setTime(new SimpleDateFormat("MM/dd/yyyy").parse(month + "/" + day + "/" + year));
            System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK, 
                                                       Calendar.LONG, 
                                                       Locale.US).toUpperCase());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
