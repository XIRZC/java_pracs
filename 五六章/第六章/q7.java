

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
			System.out.println(i+"�Ľ׳ˣ�");
			int ans=1;
			for(int j=1;j<=i;j++)
				ans*=j;
			System.out.println("�ǵݹ�����"+ans);
			System.out.println("�ݹ���"+factorial(i));
			System.out.println("--------------");
		}
	}
}
