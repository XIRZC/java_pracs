import shape.*;

import java.util.Scanner;

public class shape_main {
	public static void main(String[] args)
	{  //����Ϊ��ʹ�ù���ͼ�����ڶ�ȡ����ʱ�ķ��㣬�����˹��캯���ɴ�scanner���ڸ����ڲ������Ա��������ȡ
		Scanner s=new Scanner(System.in);
		Shape c=new Circle(s);
		System.out.printf("��Բ�����Ϊ��%.2f,��Բ���ܳ�Ϊ��%.2f\n",c.getArea(),c.getArcLength());
		Shape r=new Rectangle(s);
		System.out.printf("���ı��ε����Ϊ��%.2f,���ı��ε��ܳ�Ϊ��%.2f\n",r.getArea(),r.getArcLength());
		Shape t=new Triangle(s);
		System.out.printf("�������ε����Ϊ��%.2f,�������ε��ܳ�Ϊ��%.2f\n",t.getArea(),t.getArcLength());
		Shape p=new Pentagon(s);
		System.out.printf("��������ε����Ϊ��%.2f,��������ε��ܳ�Ϊ��%.2f\n",p.getArea(),p.getArcLength());
		s.close();
	}
}
