import java.io.*;
import java.util.*;
class Pattern02
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value for n :");
		int n=scan.nextInt();
		System.out.println("no of stars in each line :");
		int m=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
/*
OUTPUT
enter value for n :
4
no of stars in each line :
5
*****
*****
*****
*****


*/