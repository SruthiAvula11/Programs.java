write a java program to find the frequency of each number in an array.
Source code:
import java.util.*;
public class array
{
 public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++)
   {
       a[i]=sc.nextInt();
   }
   for(int i=0;i<n;i++)
   {
       if(a[i]==-1)
       {
           continue;
       }
       int count=1;
       for(int j=i+1;j<n;j++)
      {
          if(a[i]==a[j])
          {
           count++;
           a[j]=-1;
          }
       }
        System.out.print(a[i]+ ""+count);
   }
}   
}
Output:
12
3 2 1 2 2 1 3 1 5 5 4 1 
3223145241
