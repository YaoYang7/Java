import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        int[][] matrix1 = {{0, 0, 0}, 
                           {0, 0, 0}, 
                           {0, 0, 0}};  // first 3x3 matrix, indented like this for easier to read 

        int[][] matrix2 = {{0, 0, 0}, 
                           {0, 0, 0}, 
                           {0, 0, 0}};  // second 3x3 matrix, indented like this for easier to read 

        int[][] sumMatrix = {{0, 0, 0}, 
                             {0, 0, 0}, 
                             {0, 0, 0}}; // used to contain the sum of  2 matrices

        Scanner scanner = new Scanner(System.in);
        System.out.println("This is matrix 1");
        // starting at row(i) indexed at 0, getting all the column integers, and the next one and last one
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter row " + (i) + " column " + (j) +" of matrix 1");  // can add 1 to i and j to make it clear for users who starts index at 1
                int userNum = scanner.nextInt();
                matrix1[i][j] = userNum;
                scanner.nextLine();
            }
        }

        System.out.println("This is matrix 2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter row " + (i) + " column " + (j) +" of matrix 2");  // can add 1 to i and j to make it clear for users who starts index at 1
                int userNum = scanner.nextInt();
                matrix2[i][j] = userNum;
                scanner.nextLine();
            }
        }
        scanner.close();

        sumMatrix = sumOfMatrix(matrix1, matrix2);  // function for calculation written down below
        // displaying the matrix
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
        }
    }

    // function of adding 2 matrices together
    private static int[][] sumOfMatrix(int firstMatrix[][], int secondMatrix[][]) {
        int[][] sumOfMatrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};    // used for storing the sum of 2 matrices

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumOfMatrix[i][j] = firstMatrix[i][j] + secondMatrix [i][j];
            }
        }

        return sumOfMatrix;
    }
}
