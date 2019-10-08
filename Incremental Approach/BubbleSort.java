import java.util.*;
import java.io.*;
class BubbleSort
{
    public static void sort(int arr[])
    {
        int n=arr.length;
        int i=0,j=0;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        sort(arr);
        System.out.println("Elements in sorted order");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
