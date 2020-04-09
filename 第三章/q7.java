import shape.*;

import java.util.Scanner;

public class q7 {
	public static boolean prime(int x)
	{
		if(x==1) return false;
		else if(x==2) return true;
		else
		{
			for(int i=2;i*i<=x;i++)
				if(x%i==0)  return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		if(prime(data))
			System.out.println("该数为素数");
		else
			System.out.println("该数不为素数");
		sc.close();
	}
}

