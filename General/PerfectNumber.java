import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a number between 20 and 30");
        int userInput = scanner.nextInt();
        scanner.close();

        List<Integer> divList = checkDivisor(userInput);

        // 28 works 
        if (userInput >= 1 && userInput <= 30) {
            if (checkNumber(divList, userInput) == true) {
                System.out.println(divList);
                System.out.println(userInput + " is a perfect number");
            } else {
                System.out.println(userInput + " is not a perfect number");
            }

        }

    }

    private static boolean checkNumber (List<Integer> inputList, int inputNumber) {
        int totalSum = 0; 
        for (int numberElement : inputList) {
            totalSum += numberElement;
        }
        if (totalSum == inputNumber) {
            return true;
        } else {
            return false;
        }
    }

    private static List<Integer> checkDivisor(int inputNumber) {
        List<Integer> divisorList = new ArrayList<>();

        // for i start at 0, end at input number, increase by 1 
        for (int i = 1; i < inputNumber; i++) {
            if (inputNumber % i == 0) {
                divisorList.add(i);
            }
        }
        return divisorList;
    }
}