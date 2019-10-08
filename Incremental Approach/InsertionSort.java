import java.util.*;
import java.io.*;
class InsertionSort
{
    public static void sort(int arr[])
    {
        int n=arr.length;
        int key=0,i,j;
        for(i=1;i<n;i++)
        {
            key=arr[i];
            j=i-1;
            while(j>=0&&arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int []arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=s.nextInt();
        }
        InsertionSort x=new InsertionSort();
        sort(arr);
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
