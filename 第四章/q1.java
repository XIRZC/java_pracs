//该题输出结果为: A.B


public class q1 {
	public static void main(String[] args)
	{
		String x="A",y="B";
		mb_info(x,y);
		System.out.println(x+'.'+y);   //输出结果：A.B
	}
	public static void mb_info(String x,String y)  //String这里参数传递只是值，改变的是局部变量
	{
		x=x.concat(y);  //concat返回值才是连接结果，该函数调用不改变x本身
		y=x;
		System.out.println(x+'.'+y);  //输出结果 AB.AB
	}
}
