import java.io.*;
import java.util.*;

class MutableInt {
    int value = 1;
    public void increment () { ++this.value; }
    public int get() { return this.value; }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, MutableInt> hmap = new HashMap<String, MutableInt>(n);
                
        for (int i = 0; i < n; i++) {
            String str = in.next();
            MutableInt count = hmap.get(str);
            
            if (count == null) {
                hmap.put(str, new MutableInt());
            } else {
                count.increment();
            }            
        }
        
        int q = in.nextInt();
        
        for (int i = 0; i < q; i++) {
            String str = in.next();
            
            if (hmap.containsKey(str)) {
                System.out.println(hmap.get(str).get());
            } else {
                System.out.println(0);
            }
        }
        
        in.close();
    }
}
