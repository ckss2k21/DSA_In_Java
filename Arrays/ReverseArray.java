/* Problem : Given Multiple testCase t, Every testCases has array of size n. 
*  Task is to  Reverse the array
*  Input : 
   2
   5 
   1 2 3 4 5
   10 
   1 2 3 4 5 6 7 8 9 10
   
   Output : 
   5 4 3 2 1
   10 9 8 7 6 5 4 3 2 1

   Approach : We will solve it by using two pointer approach
   1 2 3 4 5 
   intially : i = 0 (1) j = n-1  (5)
   now we will swap ith and jth position value of the array till i < j
   1 swap with 5
   2 swap with 4
   3 remains same
   Finally, array becomes {5,4,3,2,1} 
*/
package Arrays;
import java.util.*;
class ReverseArray{

	public void swap(int arr[], int i , int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
    public void reverseArray(int arr[], int n)
    {
        for(int i = 0 , j = n-1; i < j; i++, j--)
        {
            swap(arr, i, j);
        }
    }
    void printArray(int arr[])
    {
        for(int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

class Launch {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        ReverseArray rev = new ReverseArray();
        while( t > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int [n];
            for(int i = 0; i < n; i++)
            {
            	arr[i] = sc.nextInt();
            }
            rev.reverseArray(arr,n);
            rev.printArray(arr);
            t--;
        }
        sc.close();
    }
}