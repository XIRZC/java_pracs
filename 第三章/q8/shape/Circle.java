package shape;

import java.util.Scanner;

public class Circle implements Shape{
	private double radius;  //圆半径
	private Point center=new Point();  //圆中心点坐标
	public Circle() { setParam(0,0,5); }   //默认初值
	public Circle(double x,double y,double r)  //构造函数传值
	{
		setParam(x,y,r);
	}
	public Circle(Scanner s)   //构造函数读值
	{
		setParam(s);
	}
	public double getArcLength()
	{
		return 2*Math.PI*radius;
	}
	
	public double getArea()
	{
		return Math.pow(radius, 2)*Math.PI;
	}
	public void setParam(Scanner s)
	{
		System.out.println("请依次输入圆的半径和圆心坐标：");
		radius=s.nextDouble();
		center.set(s.nextDouble(), s.nextDouble());
		//由于要在一个程序中多次分开调用scanner且当关闭一个scanner对象时其他也会关闭
		//因此会导致无法读取，因此只能close一次且要保证后续不再用
	}
	public void setParam(double x,double y,double r)
	{
		this.radius=r;
		this.center.set(x, y);
	}
	public void getParam()
	{
		System.out.printf("半径r为：%.2f,圆心坐标为：(%.2f,%.2f)",radius,center.x,center.y);
	}
}
