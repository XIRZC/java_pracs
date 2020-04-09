

import java.util.Vector;
import java.util.Iterator;
public class q3 {
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
		Integer sum=0;
		Vector<Integer> primes=new Vector<Integer>();
		for(int i=2;i<=100;i++)
		{
			if(prime(i))
				primes.add(i);	
		}
		for(Iterator<Integer> it=primes.iterator();it.hasNext();)
		{
			Integer t=it.next();
			System.out.print(t+", ");  //ע�������ʽ���ַ����еļӺŲ������ӵ��������ַ���
			//���ֻ��Զ�ת��Ϊ�ַ����������ɼ��ַ�������ᵼ���ֽ����������ַ����ļ�Ȼ��ת��Ϊ�ַ������
			sum+=t;
		}
		System.out.println(sum);
	}
}
