import java.util.Scanner;



//Problem Statement : The cost of a stock on each day is given in an array, find the max profit that you can make by buying and selling in those days. 
//Note: We can buy and sell multiple times.


public class StockBuyAndSell 
{
	static Scanner scan =new Scanner(System.in);
	
	static int function(int stockPrices[], int n)
	{
		int answer = 0 ;
		int minP = Integer.MAX_VALUE;
		int currentPrice = 0;
		int profit =0;
		int currentHigh = 0;
		for(int i=0;i<n;i++)
		{
			while(i<n-1 && stockPrices[i+1] < stockPrices[i])
			{
				i++;
			}
			
			if(i==n-1)
				break;
				
			minP = stockPrices[i];
			
			//System.out.println("minP "+ minP);
			
			while(i<n-1 && stockPrices[i+1]>= stockPrices[i])
			{
				currentHigh = stockPrices[i+1];
				i++;
			}
		
			//System.out.println("currentHigh "+ currentHigh);
			
			profit += currentHigh-minP;
			
			//System.out.println("profit : "+ profit);
		}
		return profit ;
	}
	
	public static void main(String args[])
	{
		int n = scan.nextInt();
		int stockPrice[] = new int[n];
		for(int i =0 ; i<n;i++)
			stockPrice[i]= scan.nextInt();
		int profit = function(stockPrice, n);
		System.out.println(profit);
		
	}

}
