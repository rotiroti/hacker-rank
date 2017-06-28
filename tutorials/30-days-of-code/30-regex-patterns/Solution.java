import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    private static boolean validEmailsRow(String firstName, String email) {
        String firstNamePattern = "[a-z]{1,20}";
        String emailIdPattern = "^[a-z](\\.?[a-z]){1,50}@gmail\\.com$";
        Pattern r1 = Pattern.compile(firstNamePattern);
        Pattern r2 = Pattern.compile(emailIdPattern);
        Matcher m1 = r1.matcher(firstName);
        Matcher m2 = r2.matcher(email);
        
        return m1.find() && m2.find();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> emails = new ArrayList<String>(n);
                
        for (int i = 0; i < n; i++) {
            String firstName = in.next();
            String email = in.next();
            
            if (validEmailsRow(firstName, email)) {
                emails.add(firstName);                
            }
        }

        in.close();
	
        Collections.sort(emails);
        
        for (String e : emails) {
            System.out.println(e);
        }
    }
}
