

import java.util.Vector;
import java.util.Iterator;
import java.util.Collections;

public class q6 {
	public static void main(String[] args)
	{
		Vector<Character> rands=new Vector<Character>(10);
		while(rands.size()<10) //产生十个随机数
		{
			Character ch=(char)(Math.random()*('z'-'a'+1)+'a'); //a-z范围内的随机数
			if(!rands.contains(ch))  //若未包含该随机数，则添加
				rands.add(ch);
		}
		for(Iterator<Character> it=rands.iterator();it.hasNext();) //迭代器索引
			System.out.print(it.next()+", ");
		Collections.sort(rands);  //排序
		System.out.println("\n"+rands);  //直接输出
	}
}
