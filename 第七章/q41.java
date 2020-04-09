import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class q41 {
	public static void main(String[] args)
	{
		int[] scores=new int[5];
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new FileWriter("data.txt"));
			System.out.println("请依次输入五个数，以Enter间分开");
			for(int i=0;i<scores.length;i++)
			{
				scores[i]=Integer.parseInt(br.readLine());
				bw.write(String.valueOf(scores[i])+"\n");
			}
			br.close();
			bw.close();
		}
		catch(IOException e) {
			System.err.println("发生异常"+e);
			e.printStackTrace();
		}
		finally {
			System.out.println("输入数据完成!!!");
		}
	}
}
