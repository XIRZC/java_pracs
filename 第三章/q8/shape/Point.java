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
	public double distance(Point other)  //���㵱ǰ�㵽������ľ���
	{
		return Math.sqrt(Math.pow(this.x-other.x,2)+Math.pow(this.y-other.y,2));
	}
	public double toLine(Point one,Point two)  //����һ�㵽�������㹹��ֱ�ߵľ���
	{
		double A,B,C;  //ֱ�߷���y-y1=(y2-y1)/(x2-x1)*(x-x1)
		//��Ϊһ��ʽAx+By+C=0��Ϊ��A=(y2-y1),B=-(x2-x1),C=-x1*(y2-y1)+(x2-x1)*y1
		A=two.y-one.y;
		B=one.x-two.x;
		C=-one.x*(two.y-one.y)+(two.x-one.x)*one.y;
		//�㵽ֱ�߾��빫ʽ | Ax0+By0+C/������A^2+B^2 |
		return Math.abs((A*this.x+B*this.y+C)/Math.sqrt(A*A+B*B));
	}
}
