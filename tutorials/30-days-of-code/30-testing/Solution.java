import java.io.*;
import java.util.*;

public class Solution {
    /**
     * n = 3
     * k = 3
     *
     * The class is canceled because only 2 students
     * arrive on time (-1 and 0)
     *
     */
    private static void test1() {
        System.out.println("3 3");
        System.out.println("-1 0 1");	
    }

    /**
     * n = 4
     * k = 3
     * 
     * The class is not canceled because there 3 students
     * that arrive on time (-3, -1 and 0)
     *
     */    
    private static void test2() {
        System.out.println("4 3");
        System.out.println("-1 -3 0 2");	
    }

    /**
     * n = 5
     * k = 4
     *
     * The class is canceled because only 3 students
     * arrive on time (-4, -1 and 0)
     *
     */    
    private static void test3() {
        System.out.println("5 4");
        System.out.println("0 1 2 -1 -4");	
    }

    /**
     * n = 6
     * k = 5
     *
     * The class is not canceled because there are
     * 5 students that arrive on time (-999, -100, -99, -1, 0)
     *
     */    
    private static void test4() {
        System.out.println("6 5");
        System.out.println("-1 -90 -999 -100 0 32");	
    }     

    /**
     * n = 7
     * k = 3
     *
     * The class is canceled because only two students
     * arrive on time (-1 and 0)
     *
     */    
    private static void test5() {
        System.out.println("7 3");
        System.out.println("-1 0 1 30 222 123 9");	
    }
        
    public static void main(String[] args) {
        int tests = 5;
	
        System.out.println(tests);        
        test1();
        test2();
        test3();
        test4();
        test5();
    }
}
