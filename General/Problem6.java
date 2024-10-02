import java.util.Scanner;

// For this program, I have decided to allow the user to design the 3D matrix instead of a pre-defined matrix, it still contains the option to search for if a number is present in the matrix in the function below.
public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter X-Dimension size: "); // for question purpose, we set this to 3
        int xMatrix = scanner.nextInt();   
        scanner.nextLine();

        System.out.println("Enter Y-Dimension size: "); // for question purpose, we set this to 3 again
        int yMatrix = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Z-Dimension size: "); // for question purpose, we set the z also to 3
        int zMatrix = scanner.nextInt();
        scanner.nextLine();

        int[][][] inputMatrix = new int[xMatrix][yMatrix][zMatrix]; // for testing purposes we will go off the below matrix by entering into the console when prompt
                                                                                                        // 1,1,1    2,2,2   3,3,3 
                                                                                                        // 4,4,4    5,5,5   6,6,6
                                                                                                        // 7,7,7    8,8,8   9,9,9

        // As said for question purposes, we use this to create the matrix shown above this, which is this ^^^^^^^^^^^^^^^^^^^^
        for (int x = 0; x < xMatrix; x++) {
            for (int y = 0; y < yMatrix; y++) {
                for (int z = 0; z < zMatrix; z++) {
                    System.out.println("Enter the number at x-dimension " + (x) + " y-dimension " + (y) + " z-dimension " + (z));
                    int userInput = scanner.nextInt();
                    inputMatrix[x][y][z] = userInput;
                    scanner.nextLine();
                }
            }
        }

        System.out.println("Enter the number you want to find: ");  // for question purpose, this allows us to enter a number we want to search of assuming matrix is made like the above scenario where we are dealing with the matrix written above 
        int findNumber = scanner.nextInt();
        scanner.nextLine();

        scanner.close();

        // This is for displaying the 3D matrix we made earlier, so this being the matrix we inputted earlier:
                                                                                                            // 1,1,1    2,2,2   3,3,3 
                                                                                                            // 4,4,4    5,5,5   6,6,6
                                                                                                            // 7,7,7    8,8,8   9,9,9
        for (int x = 0; x < xMatrix; x++) {
            System.out.println("");
            for (int y = 0; y < yMatrix; y++) {
                if (y != 0) {
                    System.out.print("\t");     // using \t for spacing purposes
                } 
                for (int z = 0; z < zMatrix; z++) {
                    if (z != zMatrix - 1) {
                        System.out.print(inputMatrix[x][y][z] + ",");   // this statement allows us to only print the comma(,) in between numbers and not in the last position
                    } else {
                        System.out.print(inputMatrix[x][y][z]);
                    }
                }
            }
        }

        // Assume it's a 3x3x3 matrix that we inputted earlier, dealing with this matrix:
                                                                                        // 1,1,1    2,2,2   3,3,3 
                                                                                        // 4,4,4    5,5,5   6,6,6
                                                                                        // 7,7,7    8,8,8   9,9,9
        if (findNumberInMatrix(findNumber, inputMatrix, xMatrix, yMatrix, zMatrix) == true) {
            System.out.println("\nThe number " + findNumber + " does exist in the matrix");     // using the information from above matrix, if we enter 1-9 it will show this statement
        } else {
            System.out.println("\nThe number " + findNumber + " does not exist in the matrix");     // using the information from above matrix, if we enter any number outside of 1-9 it will show this statement in the console
        }
    }

    // just use this function to check if a number is in matrix
    private static boolean findNumberInMatrix(int numberToFind, int matrixInput[][][], int xVal, int yVal, int zVal) {  // need the X-Y-Z(dimensions) of the matrix to figure out the amount of iterations we need 
        boolean checkCondition = false;     // base condition as false since nothing is found
        for (int x = 0; x < xVal; x++) {
            for (int y = 0; y < yVal; y++) {
                for (int z = 0; z < zVal; z++) {
                    if (matrixInput[x][y][z] == numberToFind) {
                        checkCondition = true;  // if number is found, sets condition to true
                    } else {
                        checkCondition = false;     // if number is not found, sets condition, this else statement isn't really required since the base condition is already false, but I included it so it looks neater in my code
                    }
                }
            }
        }

        return checkCondition;  // returns true if number is found and false if nothing is found.
    }
}
