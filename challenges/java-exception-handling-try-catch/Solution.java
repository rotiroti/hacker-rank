import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println(in.nextInt()/in.nextInt());
            in.close();
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e){
            System.out.println(e);
        }	
    }
}
