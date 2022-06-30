package study;

public class Primenocheck 
{
	public static void main(String[] args) 
	{
		int no=7;
		int count=0;//this variable is taken for checking factors count
		for (int i=1;i<= no;i++)
		{
			if (no % i==0) // if no. is divisible by one or itself gives reminder zero//1
			{
				count++;
			}
		}
		if (count==2) // cause it is divisible by itself and one so count=2
		{
		System.out.println("given no.is prime");
		}
		else
		{
			System.out.println("given no.is not prime no.");
		}
	}
}
