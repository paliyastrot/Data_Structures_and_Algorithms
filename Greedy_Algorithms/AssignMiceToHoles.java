import java.util.Arrays;
import java.util.Scanner;

public class AssignMiceToHoles 
{
	static Scanner scan = new Scanner(System.in);
	
	
	static int function(int holes[], int mice[])
	{
		Arrays.sort(holes);
		Arrays.sort(mice);
		int max = Integer.MIN_VALUE;
		for(int i=0;i<holes.length;i++)
		{
			if(max<(int)Math.abs(holes[i] - mice[i]))
				max = (int)Math.abs(holes[i]-mice[i]);
		}
		return max;
		
	}

	public static void main(String[] args) 
	{
		int number = scan.nextInt();
		int holes[] = new int[number];
		int mice[] = new int[number];
		for(int i=0;i<number;i++)
		{
			holes[i]=scan.nextInt();
		}
		for(int i=0;i<number;i++)
		{
			mice[i]=scan.nextInt();
		}
		
		int result = function(holes, mice);
		System.out.println(result);


	}

}
