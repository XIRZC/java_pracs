import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class q3 {
	public static void main(String[] args)
	{
		BufferedReader fr=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print("�������һ������");
			int a=Integer.parseInt(fr.readLine());
			System.out.print("������ڶ�������");
			int b=Integer.parseInt(fr.readLine());
			System.out.printf("��������%d+%d=%d",a,b,a+b);
			fr.close();
		}
		catch(IOException e)
		{
			System.err.println("�����쳣"+e);
			e.printStackTrace();
		}
	}
}
