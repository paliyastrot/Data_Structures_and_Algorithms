import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Leetcode Greedy
public class PartitionLables 
{
	static Scanner scan = new Scanner(System.in);
	
	static List<Integer> function(String str)
	{
		List<Integer> list = new ArrayList<Integer>();
		
		int mapping[] = new int[26];
		for(int i =0;i<str.length();i++)
		{
			mapping[str.charAt(i)-'a']=i;
		}
		int index = 0;
		int last =0;
		int start =0;
		for(int i=0;i<str.length();i++)
		{
			index = mapping[str.charAt(i)-'a'];
			last = Math.max(last, index);
			if(last==i)
			{
				list.add(last-start+1);
				start = last+1;
			}
		}
		return list;
	}

	public static void main(String[] args) 
	{
		String str = scan.next();
		List<Integer> list = function(str);
		for(Integer i : list)
			System.out.print(i+" ");

	}

}
