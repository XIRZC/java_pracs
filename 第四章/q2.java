//该题输出结果为 21

public class q2 {
	public static void main(String[] args)
	{
		String[] s= {"1","2"};
		mb_swap(s);
		System.out.println(s[0]+s[1]);
	}
	public static void mb_swap(String[] s)
	{
		if(s.length<2)
			return;
		String temp=s[0];
		s[0]=s[1];
		s[1]=temp;
	}
}
