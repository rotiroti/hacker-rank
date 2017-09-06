import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        
        in.close();        
        System.out.println(sum);
    }
}
