import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lastAnswer = 0;
        int n = in.nextInt();
        int q = in.nextInt();
        int x, y, query;
               
        ArrayList<Integer>[] seqList = new ArrayList[n];
        
        while(q --> 0) {
            query = in.nextInt();
            x = in.nextInt();
            y = in.nextInt();
            int seq = ((x ^ lastAnswer) % n);
            
            switch (query) {
	    case 1:
		if (seqList[seq] == null) {
		    ArrayList<Integer> myList = new ArrayList<>();
		    myList.add(y);
		    seqList[seq] = myList;
		} else {
		    seqList[seq].add(y);
		}
                    
		break;
	    case 2:
		lastAnswer = seqList[seq].get(y % seqList[seq].size());
		System.out.println(lastAnswer);
		break;
            }
        }
        
        in.close();
    }
}
