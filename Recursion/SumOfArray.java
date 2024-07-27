package Recursion;

import java.util.Scanner;

public class SumOfArray {
    public static int sum(int []arr, int index)
    {
        if(index == arr.length)
        return 0;
        return arr[index] + sum(arr, index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Sum = "+sum(arr,0));
        sc.close();
    }
}
