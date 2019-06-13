/*
	
*/
import java.io.*;
import java.util.*;
class Pattern05
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			String display="";
			int alphabet=97;
			for(int j=1;j<=i;j++)
			{
				display=display+(char)alphabet+" + ";
				alphabet++;
				
			}
			System.out.println("("+display.substring(0,display.length()-3)+")");
			
		}
				
		
		
	}
}
/*

*/