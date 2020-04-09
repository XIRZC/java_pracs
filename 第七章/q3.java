import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class q3 {
	public static void main(String[] args)
	{
		BufferedReader fr=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print("请输入第一个数：");
			int a=Integer.parseInt(fr.readLine());
			System.out.print("请输入第二个数：");
			int b=Integer.parseInt(fr.readLine());
			System.out.printf("计算结果：%d+%d=%d",a,b,a+b);
			fr.close();
		}
		catch(IOException e)
		{
			System.err.println("发生异常"+e);
			e.printStackTrace();
		}
	}
}
