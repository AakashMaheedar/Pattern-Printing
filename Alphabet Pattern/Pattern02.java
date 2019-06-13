/*
	
*/
import java.io.*;
import java.util.*;
class Pattern02
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			int alphabet=65;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)alphabet);
				alphabet++;
			}
			System.out.println();
		}
				
		
		
	}
}
/*

*/