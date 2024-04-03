///BISMILLAH
//Author: Md Sajibur Rahman
//Dept of Computer Science & Engineering(CSE)
//Roll:18CSE048

import java.util.Scanner;

public class Demo  extends Car{
	static int[] prime=new int[100005];
	static int[] num=new int[100005];
	static int[] temp=new int[100005];
	static int[] spf=new int[100005];
	static boolean[] sajib=new boolean[90000001];
	static int [] a=new int[100005];
	static int N=100000;
	
	//printing start using nested loop in java 
	static void star1()
	{
	     for(int row=1;row<=5;row++)
	     {
	    	 for(int col=1;col<=row;col++)
	    	 {
	    		 System.out.print(row);
	    	 }
	    	 System.out.print("\n"); 
	     }	
	}
	
	static void star2()
	{
		for(int row=5;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row);
			}
			System.out.print("\n");
			
		}		
	}
	
	///GCD Recursion
	///
	static int GCD(int a, int b)
	{
		if(a%b==0)
		{
			return b;
			
		}
		return GCD(b,a%b);	
	}
	
	///Euler Tosent Function
	///
	static int gcd(int a,int b)
	{
		if(a%b==0)
		{
			return b;
		}
		else {
			
			return gcd(b,a%b);
		}
	}
	static int phi(int n)
	{
		int cnt=0;
		for(int i=1;i<n;i++)
		{
			if(gcd(i,n)==1)
			{
				cnt++;
			}
		}
		return cnt;
	}
	
	//Number theory Recursion:
	//Factorial
	 
	static int fact(int n)
	{
		if(n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	
	
    ////Let's gets started with Algorithm
	//Number Theory:Seive 
	
	static void Seive(int n) {
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
	for(int i=2;i<=n;i++) {
	   if(prime[i]==0)
	   {
	   	 System.out.println(i);
	   }
	
	}	
	}
	
	///Prime Factorization :
	
	static void SPF(int p)
	{
		for(int i=2;i<p;i++)
		{
			spf[i]=i;
		}
		
		for(int i=2;i*i<=p;i++)
		{
			if(spf[i]==i)
			{
				for(int j=i*i;j<=p;j+=i)
				{
					spf[j]=i;
				}
			}
		}
		while(p!=1)
		{
				System.out.println(spf[p]);
				p=p/spf[p];
		}
	}
	
	///Precalculation of Seive
	///Finding the kth prime number 
	
	
	static void Precalculation_of_Seive()
	{
		for(int i=2;i*i<=N;i++)
		{
			if(sajib[i]==false)
			{
				for(int j=i*i;j<=N;j+=i)
				{
					sajib[j]=true;
				}
			}
		}
		int k=0;
		for(int i=2;i<=N;i++)
		{
			if(sajib[i]==false)
			{
				a[k]=i;
				k++;
			}
		}	
	}
	
	
	///Now here is the code of Marge sort to (time complexity =O(nlogn) space complexity=o(n)
	
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
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("hello siku");
		star1();
		star2();
		System.out.println("Enter a number to print the prime Numbers : ");
		int n=scr.nextInt();
		Seive(n);
		System.out.println("Enter a number to sort the array ");
		int m=scr.nextInt();
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
		
		System.out.println("Enter a number to see who are the factor of p ");
		int p=scr.nextInt();
		SPF(p);
		
		
		System.out.println("Enter a number to print the  factorial value of that number ");
		int q=scr.nextInt();
		int x=fact(q);
		System.out.println(x);
		
		System.out.println("Enter a number to see the kth prime Number");
		
		Precalculation_of_Seive();
		int N=scr.nextInt();
		System.out.println(a[N-1]);	
		
		System.out.println("Enter a number a to print the GCD ");
		
		int NUM1=scr.nextInt();
		int NUM2=scr.nextInt();
		int RESULT=GCD(NUM1,NUM2);
		System.out.println(RESULT);
		
		System.out.println("Enter a number Nmber to see the total number of Relatively Prime ");
		int E=scr.nextInt();
		System.out.println(phi(E));
		
	}
	
}
