import java.util.Scanner;
import java.util.ArrayList;

public class Problem1V2 {
    // This version assumes we are using ArrayList instead of Array
    public static void main(String[] args) {
        ArrayList<Integer> evenNumberList = new ArrayList<>();  // Even numbers
        ArrayList<Integer> oddNumberList = new ArrayList<>();   // Odd numbers
        int evenCount = 0;
        int oddCount = 0;

        Scanner scanner = new Scanner(System.in);
        // This program does not count DISTINCT entries, if same even number is entered twice, it will count twice
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");   // Numbers entered are 1 to 10 for testing.
            int userNum = scanner.nextInt();
            scanner.nextLine();
            if (userNum % 2 == 0) {
                // If number is even, add it to the even list
                evenNumberList.add(userNum);
                evenCount += 1;
            } else {
                // Else wise just add it to the odd list assuming only integer inputs
                oddNumberList.add(userNum);
                oddCount += 1;
            }
        }
        scanner.close();

        System.out.println("Even numbers: " + evenNumberList + " | Total amount of even numbers entered: " + evenCount);
        System.out.println("Odd numbers: " + oddNumberList + " | Total amount of odd numbers entered: " + oddCount);
    }
}