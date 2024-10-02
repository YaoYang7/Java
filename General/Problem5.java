import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount of rows: ");
        int matrixRows = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Amount of columns: ");
        int matrixColumns = scanner.nextInt();
        scanner.nextLine();

        int[][] inputMatrix = new int[matrixRows][matrixColumns];   // setting up the matrix of however many Rows X Columns depending on the user input

        for (int i = 0; i < matrixRows; i++) {
            for (int j = 0; j < matrixColumns; j++) {
                System.out.println("Enter the number at row " + (i) + " column " + (j));    // can add 1 to i and j to make it clear for users who starts index at 1
                int inputCol = scanner.nextInt();
                inputMatrix[i][j] = inputCol;   // feeds the data into the matrix column by column and then moves onto the next row and repeats this process everything is done
                scanner.nextLine();
            }
        }        
        scanner.close();

        System.out.print("\nOriginal Matrix");  // displays the original matrix designed by the user
        for (int i = 0; i < matrixRows; i++){
            System.out.println(" ");
            for (int j = 0; j < matrixColumns; j++) {
                System.out.print(inputMatrix[i][j] + " ");
            }
        }

        int[][] transposedMatrix = arrayTranspose(inputMatrix, matrixRows, matrixColumns);  // function used to transpose the matrix
        System.out.print("\n\nTransposed Matrix: ");    // displays the matrix after transposition
        for (int i=0; i < matrixColumns; i ++) {
            System.out.println(" ");
            for (int j = 0; j < matrixRows; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
        }
    }

    private static int[][] arrayTranspose(int arrayInput[][], int row, int col) {
        int[][] transposedArray = new int[col][row];    // create a transposed matrix

        // Assume 2x4 matrix, row = 2, iterates through 2 times, transposing this would require us 
        // to operate 4times on the col of new matrix, 
        for (int i = 0; i < row; i++) {     // looping through i, gives us 2 iterations
            for (int j = 0; j < col; j++) {     // looping through j gives 4 iterations to put item into matrix
                transposedArray[j][i] = arrayInput[i][j];   // swapping 
            }
        }
        return transposedArray;
    }
}
