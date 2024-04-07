import java.util.Scanner;
public class Method_Overloading {
	public int SUM(int a,int b)
	{
		return (a+b);
	}
	public int SUM(int a,int b,int c)
	{
		
		return (a+b+c);
	}
	
	public int SUM(int a,int b,int c,int d)
	{
		
		return (a+b+c+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int a=scr.nextInt();
		int b=scr.nextInt();
		int c=scr.nextInt();
		int d=scr.nextInt();
		
		Method_Overloading m1=new Method_Overloading();
		int X=m1.SUM(a, b);
		int Y=m1.SUM(a, b, c);
		int Z=m1.SUM(a, b, c, d);
		
		System.out.println(X);
		System.out.println(Y);
		System.out.println(Z);
	}
	
	

}
