package Recursion;

import java.util.Scanner;

/*
 * Q5. Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum
of every digit in that number raised to the power of total digits in that number is equal to the number.
Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number. (Easy)
Input1 : 153
Output1 : Yes
Input 2 : 134
Output2 : No
 */
public class CheckForArmStrong {
    public static int findNumOfdigits(int n)
    {
        if(n == 0) return 0;
        return 1 + findNumOfdigits(n/10);
    }
    public static int calculatePow(int a, int b)
    {
        if(b == 1)
        return a;
        return  a * calculatePow(a,b-1);
    }
    public static boolean check(int n, int num, int powSum, int digits)
    {
        if(n > 0)
        {
            powSum += calculatePow(n%10,digits);
            System.out.println(powSum);
            if(powSum == num)
            return true;
            return check(n/10, num,powSum,digits);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits = findNumOfdigits(n);
        if(check(n, n, 0, digits))
        System.out.print("YES");
        else
        System.out.print("NO");
        sc.close();
    }
}
