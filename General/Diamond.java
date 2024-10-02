import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd number of rows: ");
        int userNumber = scanner.nextInt();
        scanner.close(); 
        int splitNumber = 0;

        if (checkEven(userNumber) == true) {
            System.out.println("Run the program again and enter an odd number!!");
        } else {
            splitNumber = userNumber / 2;
            splitNumber ++;
        }

        String stars = "*";
        String spaces = "";

        for (int i = 0; i < splitNumber; i++) {
            int tempCount = 2 * i; 
            for (int j = 0; j < tempCount; j++) {
                stars += "*";
            }
            for (int x = splitNumber - i; x > 1; x--) {
                spaces += " ";
            }
            System.out.println(spaces + stars);

            stars = "*";
            spaces = "";
        }

        for (int i = 1; i <= splitNumber-1; i++) {
            int tempCount = 2 * i; 
            for (int j = 1; j < (userNumber - tempCount); j++) {
                stars += "*";
            }
            for (int x = 0; x < i; x++) {
                spaces += " ";
            }
            System.out.println(spaces + stars);
            stars = "*";
            spaces = "";
        }
    }

    private static Boolean checkEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false; 
        }
    }
}
