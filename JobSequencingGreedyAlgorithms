import java.util.Arrays;
import java.util.Scanner;

public class JobSequencing
{
	static Scanner scan = new Scanner(System.in);
	
	static int function(int  max, int cost[], int deadline[])
	{
		int n = deadline.length;
		int temp;
		
		//sorting the cost array in increasing order 
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(cost[j]<cost[j+1])
				{
					temp = cost[j];
					cost[j] = cost[j+1];
					cost[j+1] = temp;
					
					
					temp = deadline[j];
					deadline[j] = deadline[j+1];
					deadline[j+1] = temp;
				}
			}
		}
//		System.out.println(Arrays.toString(cost));
//		System.out.println(Arrays.toString(deadline));
//		
		
		boolean allocation[] = new boolean[max];
		int maxProfit = 0;
		for(int i=0;i<n;i++)
		{
			for(int j = deadline[i]-1;j>=0;j--)
			{
				if(!allocation[j])
				{
					maxProfit = maxProfit + cost[i];
					allocation[j]=true;
					System.out.println(cost[i]);
					break;
				}
			}
		}
	
		return maxProfit;
	}
	public static void main(String args[])
	{
		int number = scan.nextInt();
		int cost[] = new int[number];
		int deadline[] = new int[number];
		int max = 0;
		for(int i=0;i<number;i++)
		{
			cost[i]=scan.nextInt();
		}
		for(int i=0;i<number;i++)
		{
			deadline[i]=scan.nextInt();
			if(deadline[i]>max)
				max=deadline[i];
		}
			
		int result = function(max, cost, deadline);
		System.out.println(result);
	}

}
