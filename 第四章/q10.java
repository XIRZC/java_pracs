

import java.math.BigInteger;
import java.util.Scanner;

public class q10 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		BigInteger num1=new BigInteger(s.nextLine()),num2=new BigInteger(s.nextLine());
		System.out.println("������Ϊ��"+num1.add(num2).toString());
		System.out.println("������Ϊ��"+num1.subtract(num2).toString());
		System.out.println("������Ϊ��"+num1.multiply(num2).toString());
		System.out.println("������Ϊ��"+num1.divide(num2).toString());
		s.close();
	}
}
