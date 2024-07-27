import java.util.*;
// Given a nxn matrix  Rotate matrix by 90 deg CW
public class RotateMatrix {
    public static void rotateMatrix(int  arr[][], int m, int n)
    {
        // Step first is to calculate the tarspose of matrix
        for(int i = 0; i< n ; i++)
        {
            for(int j = i; j < n; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Step two swaping first and last column
        for(int i = 0; i<n ; i++)
        {
            for(int j = 0, k = n -1; j< k; j++, k--)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
            }
        }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        n = sc.nextInt();
        System.out.println("Enter " + n + "X" + n + " Matrix");
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        rotateMatrix(arr,n,n);
        for(var mat : arr)
        System.out.println(Arrays.toString(mat));
        sc.close();
    }

}
