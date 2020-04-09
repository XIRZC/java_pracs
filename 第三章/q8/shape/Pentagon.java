package shape;

import java.util.Scanner;

public class Pentagon implements Shape{ 
	//这里为了简化正五边形的描述，规定五边形顶角正朝y轴正方向，从而可以用中心点和边长去描述它
	private double side;  //正五边形的边长
	private Point center= new Point();
	public Pentagon()  //默认参数设定
	{
		setParam(0,0,5);
	}
	public Pentagon(double x,double y,double side)  //构造函数传参
	{
		setParam(x,y,side);
	}
	public Pentagon(Scanner s)  //构造函数读参
	{
		setParam(s);
	}
	public double getArcLength()
	{
		return 5*side;
	}
	public double getArea()  //利用三角性的三角函数公式取求面积，然后乘五个
	{
		return 5*(0.5*side*side*Math.sin(Math.PI*2/5));
	}
	public void setParam(double x,double y,double side)
	{
		center.set(x, y);
		this.side=side;
	}
	public void setParam(Scanner s)
	{
		System.out.println("请依次输入这个正五边形的中心点坐标以及边长：");
		center.set(s.nextDouble(), s.nextDouble());
        this.side=s.nextDouble();
		//由于要在一个程序中多次分开调用scanner且当关闭一个scanner对象时其他也会关闭
		//因此会导致无法读取，因此只能close一次且要保证后续不再用
	}
	public void getParam()
	{
		System.out.printf("正五边形中心点点坐标：(%.2f,%.2f)，边长%.2f\n",center.x,center.y,side);
	}
}
