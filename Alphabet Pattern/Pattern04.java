/*
	
*/
import java.io.*;
import java.util.*;
class Pattern04
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int alphabet=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)alphabet);
			}
			System.out.println();
			alphabet++;
		}
				
		
		
	}
}
/*

*/