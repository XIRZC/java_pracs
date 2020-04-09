package shape;

public class Point{
	public double x;
	public double y;
	Point()  { set(0,0); }
	Point(double x,double y)
	{
		set(x,y);
	}
	public void set(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	public double distance(Point other)  //计算当前点到其他点的距离
	{
		return Math.sqrt(Math.pow(this.x-other.x,2)+Math.pow(this.y-other.y,2));
	}
	public double toLine(Point one,Point two)  //计算一点到其他两点构成直线的距离
	{
		double A,B,C;  //直线方程y-y1=(y2-y1)/(x2-x1)*(x-x1)
		//化为一般式Ax+By+C=0即为：A=(y2-y1),B=-(x2-x1),C=-x1*(y2-y1)+(x2-x1)*y1
		A=two.y-one.y;
		B=one.x-two.x;
		C=-one.x*(two.y-one.y)+(two.x-one.x)*one.y;
		//点到直线距离公式 | Ax0+By0+C/根号下A^2+B^2 |
		return Math.abs((A*this.x+B*this.y+C)/Math.sqrt(A*A+B*B));
	}
}
