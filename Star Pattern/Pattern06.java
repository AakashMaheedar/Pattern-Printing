import java.io.*;
import java.util.*;
class Pattern06
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value for n : ");
		int n=scan.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*
OUTPUT:
5
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
		

*/