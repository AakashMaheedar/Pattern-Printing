import java.io.*;
import java.util.*;
class Pattern08
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}