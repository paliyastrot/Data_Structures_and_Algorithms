import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//This Algorithm does not work for all denominations. 
//DP Alternative is a better appraoach for this problem
public class MinimumNumberOfCoins
{
	static Scanner scan = new Scanner(System.in);
	
	
	static ArrayList<Integer> function(int deno[] , int value)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i  = deno.length-1;
		Arrays.sort(deno);
		
		while(value!=0)
		{
			if(value>=deno[i])
			{
				value -= deno[i];
				list.add(deno[i]);
			}
			else
				i--;
		}
		return list;
	}
	
	
	public static void main(String args[])
	{
		int number = scan.nextInt();
		int deno[] = new int[number];
		for(int i=0;i<number;i++)
		{
			deno[i]= scan.nextInt();
		}
		
		int value = scan.nextInt();
		ArrayList<Integer> result = function(deno, value); 
		for(Integer answer: result)
			System.out.print(answer + " ");
		System.out.println("");
	}

}
