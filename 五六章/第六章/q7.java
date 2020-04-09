

public class q7 {
	public static int factorial(int n)
	{
		if(n==1)  return 1;
		else return factorial(n-1)*n;
	}
	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"的阶乘：");
			int ans=1;
			for(int j=1;j<=i;j++)
				ans*=j;
			System.out.println("非递归结果："+ans);
			System.out.println("递归结果"+factorial(i));
			System.out.println("--------------");
		}
	}
}
