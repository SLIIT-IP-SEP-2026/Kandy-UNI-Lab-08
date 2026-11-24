import java.util.Scanner;

public class IT26102625Lab8Q3{
	public static void main(String[]args){
		
	int number[] = new int[6];
	int i ,j;
	Scanner input=new Scanner(System.in);
	
	for(i=0 ; i<number.length ; i++)
	{
	System.out.println("Enter a positive number ("+(i+1) +"/6) :");
	number[i] = input.nextInt();
	if(number[i]<=0)
	{
		System.out.println("error : Please enter only positive number");
		i--;
		number[i]--;
	}	
	}	
		
		System.out.println("Array content :");
		for(i=0 ; i<number.length ; i++)
		{
		 System.out.print(number[i] +" ");
		}
		System.out.println(" ");
		
		int max = number[0];
		for(j=0 ; j<number.length ; j++)
		{
		 if(number[j]>max)
		 {
			 max = number[j];
			 
			 
		 }
		}
		System.out.println("The Maximum Number Entered :" +max);
		
		
		
	}
}