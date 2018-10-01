package divideAndConquer;

import java.util.Scanner;

public class LongestCommonPrefix 
{
	static Scanner scan = new Scanner(System.in);
	
	static String common(String str1, String str2)
	{
		String com = "";
		
		for(int i=0;i<Math.min(str1.length(), str2.length());i++)
		{
			if(str1.charAt(i)==str2.charAt(i))
				com=com+Character.toString(str1.charAt(i));
			else
				break;
		}
		
		return com;
	}
	
	static String function(String array[], int low, int high)
	{
		if(low==high)
		{
			return array[low];
		}
		
		if(low<high)
		{
			int mid = (low+high)/2;
			String str1 = function(array, low, mid);
			String str2 = function(array, mid+1, high);
			return common(str1, str2);
			
		}
		return null;

	}
	
	public static void main(String args[])
	{
		int n = scan.nextInt();
		String array[] = new String[n];
		for(int i=0;i<n;i++)
			array[i]=scan.next();
		String result = function(array, 0, n-1);
		System.out.println(result);
		
	}

}
