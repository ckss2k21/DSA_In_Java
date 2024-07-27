package Recursion;

import java.util.Scanner;

public class MaxValueOfArray {
    public static int maxValue(int [] arr, int index,int max_value)
    {
        if(index == arr.length)
        return max_value;
        if(max_value < arr[index])
        max_value = arr[index];
        return maxValue(arr, index + 1, max_value);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
    
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxValue(arr, 1, arr[0]));
        sc.close();
    }
}
