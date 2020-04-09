import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class q5 {
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
			scores[2]=avr;
			br.close();
			BufferedWriter bw=new BufferedWriter(new FileWriter("data.txt"));
			System.out.println("修改后数据为：");
			for(int i=0;i<scores.length;i++)
			{
				bw.write(String.valueOf(scores[i])+"\n");
				System.out.println(scores[i]);
			}
			bw.close();
		}
		catch(IOException e) {
			System.err.println("发生异常+e");
			e.printStackTrace();
		}
		finally {
			System.out.println("修改数据完成!!!");
		}
	}
}
