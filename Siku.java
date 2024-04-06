import java.util.Scanner;

public class Siku{
	
	public int sum  (int x, int y)
	{
		return (x+y);
	}
	
	public int sub(int x,int y)
	{
		
		return (x-y);
	}
	public int mul(int x,int y)
	{
		return (x*y);
	}
	public int div(int x,int y)
	{
		
		return (x/y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int x=scr.nextInt();
		int y=scr.nextInt();
		
		Siku s1=new Siku();
		Siku s2=new Siku();

		
		int A=s1.sum(x, y);
		int B=s1.sub(x, y);
		int C=s1.mul(x, y);
		int D=s1.div(x, y);
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
	}

}
