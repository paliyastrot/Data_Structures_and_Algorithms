import java.util.ArrayList;
import java.util.Scanner;

public class PolicemenCatchThieves 
{
	static Scanner scan = new Scanner(System.in);
	
	public static int function(int array[], int k)
	{
		int answer =0;
		ArrayList<Integer> police = new ArrayList<Integer>();
		ArrayList<Integer> thieves = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==0)
				police.add(i);
			else
				thieves.add(i);
		}
		int pol =0;
		int thie = 0;
		while(pol < police.size() && thie < thieves.size())
		{
			if(Math.abs(police.get(pol)-thieves.get(thie)) <= k)
			{
				pol++;
				thie++;
				answer++;
			}
			
			else if(pol<thie)
				pol++;
			else
				thie++;
				
		}
		return answer;
		
	}

	public static void main(String[] args) 
	{
		int num = scan.nextInt();
		int array[] = new int[num];
		//0 for Police 
		//1 for Thieves
		for(int i=0;i<num;i++)
			array[i]=scan.nextInt();
		int k = scan.nextInt();
		int result = function(array, k);
		System.out.println(result);
	
	}

}
