import java.util.Scanner;



public class StockBuyingandSellingOnce 
{
	static Scanner scan = new Scanner(System.in);
	
	static int function(int price[], int n)
	{
		int minP = Integer.MAX_VALUE;
		int profit =0;
		for(int i=0;i<n;i++)
		{
			minP = Math.min(minP, price[i]);
			if(profit<(price[i]-minP))
					profit += price[i]-minP;
		}
		return profit;
	}
	
	
	public static void main(String args[])
	{
		int n = scan.nextInt();
		int price[] = new int[n];
		for(int i=0;i<n;i++)
			price[i]=scan.nextInt();
		int result = function(price, n);
		System.out.println(result);
	}

}
