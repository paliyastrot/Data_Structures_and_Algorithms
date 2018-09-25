
import java.util.Scanner;

public class ActivitySelectionGreedy
{
	static Scanner scan = new Scanner(System.in);
	
	
	static int function(int start[], int end[])
	{
		int answer = 1 ;
		int number = start.length;
		
		int temp=0;
		
		for(int i=0;i<number;i++)
		{
			for(int j=0;j<number-1;j++)
			{
				if(end[j]>end[j+1])
				{
					temp = end[j];
					end[j] = end[j+1];
					end[j+1] = temp;
					
					
					temp = start[j];
					start[j] = start[j+1];
					start[j+1] = temp;
				}
			}
		}
		
		int k = 0;
		for(int i=1;i<number;i++)
		{
			if(end[k]<=start[i])
			{
				answer++;
				k=i;
				System.out.println(i);
			}
		}
		return answer;
	}
	public static void main(String args[])
	{
		int number = scan.nextInt();
		int start[] = new int[number];
		int end[] = new int[number];
		for(int i=0;i<number;i++)
			start[i]=scan.nextInt();
		for(int i=0;i<number;i++)
			end[i]=scan.nextInt();
		scan.close();
		int result = function(start, end);
		System.out.println(result);
	}
	
}
