package shape;

import java.util.Scanner;

public class Circle implements Shape{
	private double radius;  //Բ�뾶
	private Point center=new Point();  //Բ���ĵ�����
	public Circle() { setParam(0,0,5); }   //Ĭ�ϳ�ֵ
	public Circle(double x,double y,double r)  //���캯����ֵ
	{
		setParam(x,y,r);
	}
	public Circle(Scanner s)   //���캯����ֵ
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
		System.out.println("����������Բ�İ뾶��Բ�����꣺");
		radius=s.nextDouble();
		center.set(s.nextDouble(), s.nextDouble());
		//����Ҫ��һ�������ж�ηֿ�����scanner�ҵ��ر�һ��scanner����ʱ����Ҳ��ر�
		//��˻ᵼ���޷���ȡ�����ֻ��closeһ����Ҫ��֤����������
	}
	public void setParam(double x,double y,double r)
	{
		this.radius=r;
		this.center.set(x, y);
	}
	public void getParam()
	{
		System.out.printf("�뾶rΪ��%.2f,Բ������Ϊ��(%.2f,%.2f)",radius,center.x,center.y);
	}
}
