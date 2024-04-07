import java.util.Scanner;

public class Object {
	
	
	int prime[]=new int[100005];
	
	public void Seive(int n)
	{
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a number to print the prime numbers: ");
		int n=scr.nextInt();
		Object o1=new Object();
		Object o2=new Object();
		System.out.println("Printing for the First Object: ");
		o1.Seive(n);
		System.out.println("Printing for the second Object: ");
		o2.Seive(n);

	}
	
	
	
	

}
