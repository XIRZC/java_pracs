import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;


public class q42 {
	public static void main(String [] args)
	{
		int[] scores=new int[5];
		int sum=0,avr=0;
		try {
			BufferedReader br=new BufferedReader(new FileReader("data.txt"));
			for(int i=0;i<scores.length;i++)
			{
				scores[i]=Integer.parseInt(br.readLine());
				sum+=scores[i];
			}
			avr=sum/scores.length;
			br.close();
		}
		catch(IOException e) {
			System.err.println("发生异常+e");
			e.printStackTrace();
		}
		finally {
			System.out.printf("平均值为：%d\n",avr);
		}
		Arrays.sort(scores);
		for(int i=0;i<scores.length;i++)
			System.out.print(scores[i]+" ");
	}
}
