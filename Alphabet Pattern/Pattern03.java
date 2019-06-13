/*
	
*/
import java.io.*;
import java.util.*;
class Pattern03
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int alphabet=65;
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
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
5
A
BC
DEF
GHIJ
KLMNO
*/