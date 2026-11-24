import java.util.Scanner;

public class IT26102625Lab8Q4{
	public static void main(String[]args){
	
    int student=0 ;	
	int number[] = new int[8];
	int i ,j;
	Scanner input=new Scanner(System.in);
	
	for(i=0 ; i<number.length ; i++)
	{
	System.out.println("Enter Student ID for student"+(i+1) +" :");
	number[i] = input.nextInt();
	if(number[i]<=0)
	{
		System.out.println("Error : Please enter only positive number");
		i--;
		number[i]--;
	}	
	}	
		
	System.out.println("Enter a Student ID to Search :");
	student = input.nextInt();
		
	boolean av = false ;
	for(i=0 ; i<number.length ; i++)
	{	
      if(student==number[i])
		  av = true;
	}
	if(av == true)
	{
	System.out.println("Student is Available");
	}
	else
    {
		System.out.println("Student is Not Available");		
	}
 }
}