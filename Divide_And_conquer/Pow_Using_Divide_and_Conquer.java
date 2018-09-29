import java.util.Scanner;

//We are assuming that integer overflow does not occur

public class Pow_Using_Divide_and_Conquer 
{
	static Scanner scan = new Scanner(System.in);
	
	
	static int power(int x, int y)
	{
		if(y==0)
			return 1;
		else if(y%2==0)
			return power(x, y/2)*power(x, y/2);
		return 
				x*power(x, y/2)*power(x, y/2);
	}

	public static void main(String[] args) 
	{
		int x = scan.nextInt();
		int y = scan.nextInt();
		int answer = power(x, y);
		System.out.println(answer);

	}

}
