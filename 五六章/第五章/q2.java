
public class q2 {
	public static void main(String[] args)
	{
		ShapeHandler<Square> sq=new ShapeHandler<Square>();
		ShapeHandler<Circle> ci=new ShapeHandler<Circle>();
		Square squ=new Square();
		Circle cir=new Circle();
		System.out.println("正方形面积为："+sq.getArea(squ));
		System.out.printf("圆形面积为：%.2f",ci.getArea(cir));
	}
} 

class ShapeHandler<shape extends Shape>
{
	public double getArea(shape s)
	{
		return s.getArea();
	}
}
interface Shape{
	public double getArea();
}

class Square implements Shape
{
	private double side;
	public Square()
	{
		side=4;
	}
	public double getArea()
	{
		return side*side;
	}
}
class Circle implements Shape
{
	private double radius;
	public Circle()
	{
		radius=2;
	}
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
}
