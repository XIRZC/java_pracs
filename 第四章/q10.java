

import java.math.BigInteger;
import java.util.Scanner;

public class q10 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		BigInteger num1=new BigInteger(s.nextLine()),num2=new BigInteger(s.nextLine());
		System.out.println("两数和为："+num1.add(num2).toString());
		System.out.println("两数差为："+num1.subtract(num2).toString());
		System.out.println("两数积为："+num1.multiply(num2).toString());
		System.out.println("两数商为："+num1.divide(num2).toString());
		s.close();
	}
}
