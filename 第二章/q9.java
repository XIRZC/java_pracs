
public class q9 {
	public static void main(String[] args) {
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3-i;j++) System.out.print(' ');
			for(j=0;j<2*i;j++) System.out.print('*');
			System.out.println('*');
		}
		for(i=0;i<3;i++) System.out.print('*');
		System.out.print('+');
		for(i=0;i<2;i++) System.out.print('*');
		System.out.println('*');
		for(i=4;i<7;i++)
		{
			for(j=0;j<i-3;j++) System.out.print(' ');
			for(j=0;j<2*(6-i);j++) System.out.print('*');
			System.out.println('*');
		}
	}
}
