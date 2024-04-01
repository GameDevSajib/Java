import java.util.Scanner;
import java.util.HashMap;

public class Car {
	
	static final Scanner scanner = new Scanner(System.in);
	//private static final Scanner scanner = null;
	static int[] temp=new int[100005];
	 static int[] num=new int[100005];
	 
	static void Seive(int n)
	  {
		
		int[] prime=new int[100005];
		
		for(int i=2;i*i<=n;i++)
		{
			if(prime[i]==0)
			{
				for(int j=i*i;j<=n;j+=i)
				{
					prime[j]=1;
				}
			}
		}
		for(int i=2;i<=n;i++)
		{
			if(prime[i]==0)
			{
				System.out.println(i);
			}
		}
		
		
	}
	 
	 static void Demo()
	 {
		 String[] cars= {"Bike","Bycycle","BUS","Plane"};
		 for(int i=0;i<cars.length;i++)
		 {
			 System.out.println(cars[i]);
		 }
		 
	 }
	 
	 
	 static void Marge(int lo,int hi)
	 {
		 if(lo==hi) return;
		 int mid=(lo+hi)/2;
		 Marge(lo,mid);
		 Marge(mid+1,hi);
		 int i,j,k;
		 for(i=lo,j=mid+1,k=lo;k<=hi;k++)
		 {
			 if(i==mid+1) temp[k]=num[j++];
			 else if(j==hi+1) temp[k]=num[i++];
			 else if(num[i]<num[j])temp[k]=num[i++];
			 else temp[k]=num[j++];
		 }
		 for(k=lo;k<=hi;k++)
		 {
			 num[k]=temp[k];
		 }		 
	 }

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter two numbers you want to print ");
		int n=scr.nextInt();
	    int m=scr.nextInt();
	    
	    System.out.println("Print the prime numbers : ");
	    
		Seive(n);
		Demo();
		
		int lo=1,hi=m;
		for(int i=lo;i<=hi;i++)
		{
			num[i]=scanner.nextInt();
		}
		
		Marge(lo,hi);
		for(int i=1;i<=m;i++)
		{
			System.out.println(num[i]);
		}
	}

}

