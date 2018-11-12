import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            System.out.println(num1/num2);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getClass().getName() + ": / by zero");
        } catch (InputMismatchException ex) {
            System.out.println(ex.getClass().getName());
        }
        
    }
}