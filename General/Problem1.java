import java.util.Scanner;

public class Problem1 {
    // This version assumes we can't use ArrayList, must be done using Array only
    public static void main(String[] args) {
        int arraySize = 10; // adjustable array size, can change it to take more inputs 
        int [] numberArray = new int[arraySize]; // size will adjust to the input size
        int[] evenNumberArray = new int[arraySize]; // contains even numbers
        int[] oddNumberArray = new int[arraySize];  // contains odd numbers

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter a number");   // Numbers entered for testing is 1 to 10
            int userNum = scanner.nextInt();
            scanner.nextLine();
            numberArray[i] = userNum;            
        }
        scanner.close();

        int evenIndex = 0;  // used for maintaining the array size of even number array and placing the numbers into correct positions, when printing it can avoid the extra 0s at the end
        int oddIndex = 0;   // same purpose as above index but for odd number array
        for (int i = 0; i < arraySize; i++) {
            if (numberArray[i] % 2 == 0) {
                // if number is even
                evenNumberArray[evenIndex] = numberArray[i];
                evenIndex++;    // increment the array size and position of the even number array
            } else {
                // else if number is odd
                oddNumberArray[oddIndex] = numberArray[i];
                oddIndex++;     // increment array size and position of odd number array
            }
        }

        // printing/displaying the even and odd numbers
        System.out.println("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumberArray[i] + " ");
        }
        System.out.println("\nAmount of even: " + evenIndex);

        System.out.println("\n" + "Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumberArray[i] + " ");
        }
        System.out.println("\nAmount of odd: " + oddIndex);
    }
}