import java.util.Scanner;

public class IT26101292Lab8Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int i = 0;

        while (i < 6) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                arr[i] = num;
                i++;
            }
        }

        int max = arr[0];
        System.out.println("Array Contents:");
        for (int j = 0; j < 6; j++) {
            System.out.print(arr[j] + " ");
            if (arr[j] > max) max = arr[j];
        }

        System.out.println("The Maximum Number Entered: " + max);
    }
}
