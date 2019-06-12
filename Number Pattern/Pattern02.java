/*
	
*/
import java.io.*;
import java.util.*;
class Pattern02
{
	public static void main(String args[])
	{
	
		Scanner scan=new Scanner(System.in);
		int p=0;
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			p=0;
			for(int j=1;j<=i;j++)
			{
				p=(p>0)?0:1;
				System.out.print(p);
			}
			System.out.println();
		}
		
				
		
		
	}
}
/*

*/