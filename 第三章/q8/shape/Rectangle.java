package shape;

import java.util.Scanner;

public class Rectangle implements Shape{
	private Point p1=new Point();
	private Point p2=new Point();
	public Rectangle() { setParam(10,20,50,80); }   //默认初值
	public Rectangle(double x1,double y1,double x2,double y2)  //构造函数传值
	{
		setParam(x1,y1,x2,y2);
	}
	public Rectangle(Scanner s)  //构造函数读值
	{
		setParam(s);
	}
	public double getArcLength()
	{
		return 2*(p2.x-p1.x)+2*(p2.y-p1.y);
	}
	public double getArea()
	{
		return (p2.x-p1.x)*(p2.y-p1.y);
	}
	public void setParam(double left_top_x,double left_top_y,double right_bottom_x,double right_bottom_y)
	{
		p1.set(left_top_x, left_top_y);
		p2.set(right_bottom_x, right_bottom_y);
	}
	public void setParam(Scanner s)
	{
		System.out.println("请依次输入该矩形的左上角和右下角顶点坐标：");
		p1.set(s.nextDouble(), s.nextDouble());
		p2.set(s.nextDouble(), s.nextDouble());
		//由于要在一个程序中多次分开调用scanner且当关闭一个scanner对象时其他也会关闭
		//因此会导致无法读取，因此只能close一次且要保证后续不再用s.close();
	}
	public void getParam()
	{
		System.out.printf("左上角顶点坐标：(%.2f,%.2f)\n",p1.x,p2.y);
		System.out.printf("右下角顶点坐标：(%.2f,%.2f)\n",p2.x,p2.y);
	}
}
