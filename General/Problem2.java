import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The user inputs the value of N 
        System.out.println("Enter value of N: ");   // For testing N = 2
        int N = scanner.nextInt();
        // Declaring the array with size N, since dealing with decimals, need double
        double[] numberArray = new double[N]; 

        double xTotal = 0;
        // takes the x1 to xn values
        for (int i = 0; i < N; i++) {
            System.out.println("Enter value x" + (i+1) + ": ");     // For testing, x1 = 12.5 and x2 = 13.5
            double tempDouble = scanner.nextDouble();
            numberArray[i] = tempDouble;  // puts the input into the array
            xTotal += tempDouble;
            scanner.nextLine(); // deals with the enter
        }
        scanner.close();

        double xBar = xTotal / N; // xBar, the average

        double standardDeviation = standardDeviation(numberArray, xBar, N);
        System.out.println("Standard Deviation: "+ standardDeviation);        
    }

    // Standard Deviation function
    private static double standardDeviation(double[] valueArray, double xBar, int N) {
        double tempResult = 0;
        for (int i = 0; i < N; i++) {
            tempResult = tempResult + Math.pow((valueArray[i] - xBar), 2);  // math library, power to 2 
            }
        tempResult = Math.sqrt(tempResult / N);
        return tempResult;
    } 
}
