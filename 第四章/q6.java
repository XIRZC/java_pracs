

import java.util.Vector;
import java.util.Iterator;
import java.util.Collections;

public class q6 {
	public static void main(String[] args)
	{
		Vector<Character> rands=new Vector<Character>(10);
		while(rands.size()<10) //����ʮ�������
		{
			Character ch=(char)(Math.random()*('z'-'a'+1)+'a'); //a-z��Χ�ڵ������
			if(!rands.contains(ch))  //��δ������������������
				rands.add(ch);
		}
		for(Iterator<Character> it=rands.iterator();it.hasNext();) //����������
			System.out.print(it.next()+", ");
		Collections.sort(rands);  //����
		System.out.println("\n"+rands);  //ֱ�����
	}
}
