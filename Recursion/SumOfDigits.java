package Recursion;
import java.util.*;
/*
 * Q1 : Given an integer, find out the sum of its digits using recursion.
 * Input: n= 1234
 * Output: 10
 * Explanation: 1+2+3+4=10
 */
public class SumOfDigits
{
    public static int sumOfDigits(int n)
    {
        if(n == 0) return 0;
        return n%10 + sumOfDigits(n/10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of digit = " + sumOfDigits(n));
        sc.close();
    }
    
}