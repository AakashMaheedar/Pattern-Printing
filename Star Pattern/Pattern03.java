import java.io.*;
import java.util.*;
class Pattern03
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value for n :");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();	
		}
	}
}
/*
OUTPUT
enter value for n :
5
    *
   * *
  * * *
 * * * *
* * * * *


*/