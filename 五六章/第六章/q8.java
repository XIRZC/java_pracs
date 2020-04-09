

public class q8 {
	public static void main(String[] args)
	{
		Doub one=Doub.getDoub(1),two=Doub.getDoub(2);
		System.out.println(one);
		System.out.println(two);
	}
}

class Doub
{
	private int num=0;
	private static int count=0;
	private static Doub one=new Doub(),other=new Doub();
	private Doub()
	{
		count++;
		num=count;
	}
	public static Doub getDoub(int order)  //order为两个实例中的序号
	{
		if(order==1)
			return one;
		else
			return other;
	}
	public String toString()
	{
		return "实例"+String.valueOf(num);
	}
}
