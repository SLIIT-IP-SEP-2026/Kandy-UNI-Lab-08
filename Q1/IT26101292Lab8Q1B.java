import java.util.Scanner;

public class IT26101292Lab8Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        int count = 0;

        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = sc.nextInt();
            if (myArray[i] % 2 == 0) {
                evenArray[count] = myArray[i];
                count++;
            }
        }

        System.out.println("myArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println("evenArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(evenArray[i] + " ");
        }
    }
}
