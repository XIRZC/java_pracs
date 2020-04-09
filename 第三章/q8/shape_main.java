import shape.*;

import java.util.Scanner;

public class shape_main {
	public static void main(String[] args)
	{  //这里为了使得构造图形用于读取数据时的方便，采用了构造函数可传scanner来在各类内部定义成员函数来读取
		Scanner s=new Scanner(System.in);
		Shape c=new Circle(s);
		System.out.printf("该圆的面积为：%.2f,该圆的周长为：%.2f\n",c.getArea(),c.getArcLength());
		Shape r=new Rectangle(s);
		System.out.printf("该四边形的面积为：%.2f,该四边形的周长为：%.2f\n",r.getArea(),r.getArcLength());
		Shape t=new Triangle(s);
		System.out.printf("该三角形的面积为：%.2f,该三角形的周长为：%.2f\n",t.getArea(),t.getArcLength());
		Shape p=new Pentagon(s);
		System.out.printf("该正五边形的面积为：%.2f,该正五边形的周长为：%.2f\n",p.getArea(),p.getArcLength());
		s.close();
	}
}
