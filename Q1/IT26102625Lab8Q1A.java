import java.util.Scanner;

public class IT26102625Lab8Q1A{
public static void main(String[]args){
	
	Scanner input= new Scanner(System.in);
	int myarray[] = new int[5];
	int i ;
	
	System.out.println("Enter 5 numbers :");
	
	for(i=0 ; i < myarray.length ; i++)
	{
	System.out.println("Enter numbers" +(i+1) +":");
    myarray[i] = input.nextInt();
	}
	
	System.out.println("Array in Reverse Order :");
	for(i=0 ; i < myarray.length ; i++)
	{
	System.out.print(+ myarray[4-i] +" " );
	}
}
}