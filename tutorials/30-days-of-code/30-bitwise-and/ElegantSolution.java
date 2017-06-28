import java.io.*;
import java.util.*;

public class ElegantSolution {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();

	for (int i = 0; i < t; i++) {
	    int n = in.nextInt();
	    int k = in.nextInt();

	    System.out.println((((k-1) | k) > n && k % 2 == 0) ? k-2 : k-1);

	}

	in.close();
    }
}
