import java.util.*;
class find_largest_no
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the First Number");
		int n1=s.nextInt();
		System.out.println("Enter the Second Number");
		int n2=s.nextInt();
		System.out.println("Enter the Thard Number");
		int n3=s.nextInt();

		if(n2 > n3 && n1 > n3)
		{
			System.out.println("the n1 is greter than n1 and n2 :- "+n1);
		}
		else if(n2 > n3 && n1 > n3)
		{
			System.out.println("the n2 is greter than n1 and n3 :- "+n2);
     	}
     	else
     	{
			System.out.println("the n3 is greter than n2 and n1 :-"+n3);
		}
	}
}