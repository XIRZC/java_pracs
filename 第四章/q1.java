//����������Ϊ: A.B


public class q1 {
	public static void main(String[] args)
	{
		String x="A",y="B";
		mb_info(x,y);
		System.out.println(x+'.'+y);   //��������A.B
	}
	public static void mb_info(String x,String y)  //String�����������ֻ��ֵ���ı���Ǿֲ�����
	{
		x=x.concat(y);  //concat����ֵ�������ӽ�����ú������ò��ı�x����
		y=x;
		System.out.println(x+'.'+y);  //������ AB.AB
	}
}
