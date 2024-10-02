import java.util.Scanner;  // Import the Scanner class

public class CoffeeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter the unit weight of a bag of coffee in pounds: ");
        int unitWeight = scanner.nextInt();  // Read user input

        System.out.println("Enter the number of bags sold: ");
        int numberOfUnits = scanner.nextInt();  // Read user input

        scanner.close();

        double totalPrice = unitWeight * numberOfUnits * 5.99f; 
        totalPrice = roundToDecimalPlaces(totalPrice,  2);
        double totalPriceWithTax = totalPrice + totalPrice * 0.0725f;
        totalPriceWithTax = roundToDecimalPlaces(totalPriceWithTax, 2);

        System.out.println("Number of bags sold: " + numberOfUnits);
        System.out.println("Weight per bag: " + unitWeight + " lb");
        System.out.println("Price per pound: $5.99");
        System.out.println("Sales tax: 7.25%");
        System.out.println("Total price excluding tax: $" + totalPrice);
        System.out.println("Total price including tax: $" + totalPriceWithTax);
    }

    private static double roundToDecimalPlaces(double value, int decimalPlaces) {
        double shift = Math.pow(10, decimalPlaces);
        return Math.round(value * shift) / shift;
    }
}