import java.util.Scanner;

public class IT26102748Lab8Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        for (int i = 0; i < 6; ) {

            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");

            int value = input.nextInt();

            if (value > 0) {

                numbers[i] = value;
                i++;

            } else {

                System.out.println("Error: Please Enter ONLY Positive Numbers");

            }
        }

        int maximum = numbers[0];

        for (int i = 1; i < 6; i++) {

            if (numbers[i] > maximum) {

                maximum = numbers[i];

            }
        }

        System.out.println("\nArray Contents:");

        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nThe Maximum Number Entered: " + maximum);

        input.close();
    }
}