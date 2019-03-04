package FirdtQuestion;

import java.util.Scanner;

public class findDay {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the day today");
		String day=sc.nextLine();
		
		System.out.println("Enter the number : x");
		int x=sc.nextInt();
		
		x=x%7; //Within Range 0-7
		
		String[] week= {"Sun","Mon","Tue","Wed","Thurs","Fri","Sat"};
		
		findDay(week,x,day); //Function to calculate day
		
		sc.close();
	}	
	
	public static void findDay(String[] week,int x,String Day)
	{
		int size=week.length;
		for(int i=0;i<size;i++)
		{
			try //Arithmetic Exception
			{
			if(week[i].equals(Day))
			{
				if(size-1-i>=x)
				{
					System.out.println("Required Day is :"+week[i+x]);
					break;
				}
				else
				{
					System.out.println("Required Day is :"+week[x-(size-1-i)-1]);
					break;
				}
			}
			}
			catch(ArithmeticException e)
			{
				System.out.println("Required Day is :"+week[x-1]);
			}
			catch(Exception e)
			{
				System.out.println("Exception Found");
			}
			
		
		}
	}
}
