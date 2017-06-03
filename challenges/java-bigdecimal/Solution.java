import java.math.BigDecimal;
import java.util.*;

public class Solution {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []s = new String[n+2];
	
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
	
      	sc.close();
	
        Arrays.sort(s, 0, n, Collections.reverseOrder(new Comparator<String>() {
		@Override
		public int compare(String str1, String str2) {
		    BigDecimal a = new BigDecimal(str1);
		    BigDecimal b = new BigDecimal(str2);
                
		    return a.compareTo(b);
		}
	    }));
	
        for(int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
