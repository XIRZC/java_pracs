package shape;

import java.util.Scanner;

public class Rectangle implements Shape{
	private Point p1=new Point();
	private Point p2=new Point();
	public Rectangle() { setParam(10,20,50,80); }   //Ĭ�ϳ�ֵ
	public Rectangle(double x1,double y1,double x2,double y2)  //���캯����ֵ
	{
		setParam(x1,y1,x2,y2);
	}
	public Rectangle(Scanner s)  //���캯����ֵ
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
		System.out.println("����������þ��ε����ϽǺ����½Ƕ������꣺");
		p1.set(s.nextDouble(), s.nextDouble());
		p2.set(s.nextDouble(), s.nextDouble());
		//����Ҫ��һ�������ж�ηֿ�����scanner�ҵ��ر�һ��scanner����ʱ����Ҳ��ر�
		//��˻ᵼ���޷���ȡ�����ֻ��closeһ����Ҫ��֤����������s.close();
	}
	public void getParam()
	{
		System.out.printf("���ϽǶ������꣺(%.2f,%.2f)\n",p1.x,p2.y);
		System.out.printf("���½Ƕ������꣺(%.2f,%.2f)\n",p2.x,p2.y);
	}
}
