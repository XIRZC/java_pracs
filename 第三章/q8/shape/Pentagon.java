package shape;

import java.util.Scanner;

public class Pentagon implements Shape{ 
	//����Ϊ�˼�������ε��������涨����ζ�������y�������򣬴Ӷ����������ĵ�ͱ߳�ȥ������
	private double side;  //������εı߳�
	private Point center= new Point();
	public Pentagon()  //Ĭ�ϲ����趨
	{
		setParam(0,0,5);
	}
	public Pentagon(double x,double y,double side)  //���캯������
	{
		setParam(x,y,side);
	}
	public Pentagon(Scanner s)  //���캯������
	{
		setParam(s);
	}
	public double getArcLength()
	{
		return 5*side;
	}
	public double getArea()  //���������Ե����Ǻ�����ʽȡ�������Ȼ������
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
		System.out.println("�������������������ε����ĵ������Լ��߳���");
		center.set(s.nextDouble(), s.nextDouble());
        this.side=s.nextDouble();
		//����Ҫ��һ�������ж�ηֿ�����scanner�ҵ��ر�һ��scanner����ʱ����Ҳ��ر�
		//��˻ᵼ���޷���ȡ�����ֻ��closeһ����Ҫ��֤����������
	}
	public void getParam()
	{
		System.out.printf("����������ĵ�����꣺(%.2f,%.2f)���߳�%.2f\n",center.x,center.y,side);
	}
}
