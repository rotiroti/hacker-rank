import java.io.*;
import java.util.*;

public class Solution {

    private static void leftRotation(int[] arr, int n, int d) {
	int[] temp = new int[d];

	// Store d elements in a temp array
	temp = Arrays.copyOfRange(arr, 0, d);

	for (int i = d - 1; i >= 0; i--) {
	    arr[i + 1] = arr[i];
	}
    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int d = in.nextInt();
	int[] arr = new int[n];

	for (int i = 0; i < n; i++) {
	    arr[i] = in.nextInt();
	}

	leftRotation(arr, n, d);

	for (int i = 0; i < n; i++) {
	    System.out.println(arr[i] + " ");
	}

	in.close();
    }
}
