import java.io.*;
import java.util.*;
class Pattern01
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value for n :");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("*");
		}
	}
}
/*
OUTPUT
enter value for n :
5
*
*
*
*
*

*/