package shape;

import java.util.Scanner;

public class Triangle implements Shape{
	private Point p1=new Point();
	private Point p2=new Point();
	private Point p3=new Point();
	public Triangle()
	{
		setParam(10,10,50,60,80,100);
	}
	public Triangle(double x1,double y1,double x2,double y2,double x3,double y3)
	{
		setParam(x1,y1,x2,y2,x3,y3);
	}
	public Triangle(Scanner s)
	{
		setParam(s);
	}
	public double getArcLength()
	{
		return p1.distance(p2)+p1.distance(p3)+p2.distance(p3);
	}
	public double getArea()
	{
		double height,edge;  //�������εĵ׺͸�
		edge=p1.distance(p2);
		height=p3.toLine(p2, p1);
		return height*edge/2;
	}
	public void setParam(double x1,double y1,double x2,double y2,double x3,double y3)
	{
		p1.set(x1, y1);
		p2.set(x2, y2);
		p3.set(x3, y3);
	}
	public void setParam(Scanner s)
	{
		System.out.println("������������������ε�������������꣺");
		p1.set(s.nextDouble(), s.nextDouble());
		p2.set(s.nextDouble(), s.nextDouble());
		p3.set(s.nextDouble(), s.nextDouble());
		//����Ҫ��һ�������ж�ηֿ�����scanner�ҵ��ر�һ��scanner����ʱ����Ҳ��ر�
		//��˻ᵼ���޷���ȡ�����ֻ��closeһ����Ҫ��֤����������
	}
	public void getParam()
	{
		System.out.printf("��һ�������꣺(%.2f,%.2f)\n",p1.x,p1.y);
		System.out.printf("�ڶ��������꣺(%.2f,%.2f)\n",p2.x,p2.y);
		System.out.printf("�����������꣺(%.2f,%.2f)\n",p3.x,p3.y);
	}
}
