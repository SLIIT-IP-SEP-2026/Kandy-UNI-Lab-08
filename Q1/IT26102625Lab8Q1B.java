import java.util.Scanner;

public class IT26102625Lab8Q1B{
	public static void main(String[]args){
		
	Scanner input=new Scanner(System.in);
    int myarray[] = new int[5];
	int evenarray[] = new int[5];
    int i , j=0;
	
   System.out.println("Enter 5 numbers :");

   for( i=0 ; i< myarray.length ; i++)
   {
	   System.out.println("Enter number" +(i+1) +":");
	   myarray[i] = input.nextInt();
   }	   
		
	System.out.println("myarray contents :");
	
	for( i=0 ; i< myarray.length ; i++)
	{
		System.out.print(+myarray[i] +" ");
	}	
	
	System.out.println(" ");
	System.out.println("my evenarray contents :");
	
	for( i=0 ; i< myarray.length ; i++)	
	{
		if(myarray[i]%2==0)
		{
		evenarray[j] = myarray[i] ;
		j++;
		}

	}	
	for( i=0 ; i< evenarray.length ; i++)
	System.out.print(evenarray[i] +" ");

	
	}
}





