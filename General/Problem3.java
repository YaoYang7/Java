import java.util.Scanner;
// import java.util.Arrays; // importing sort, assuming we don't have to write our own sorting algorithm

public class Problem3 {
    public static void main(String[] args) {
        String[] studentNames = new String[10]; // array containing 10 random names

        Scanner scanner = new Scanner(System.in); 
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter student name: ");
            studentNames[i] = scanner.nextLine();
        }
        scanner.close();

        // Arrays.sort(studentNames);  // Assuming we do not need to write our own sorting algorithm 

        int i = 0;
        // Selection sort implementation, Java version
        for (String nameOfStudent : studentNames) {
            int k = i; 
            for (int j = i + 1; j < studentNames.length; j++) {
                if ((nameOfStudent.toLowerCase()).compareTo(studentNames[j].toLowerCase()) > 0) {
                    nameOfStudent = studentNames[j]; 
                    k = j; 
                }
            }
            //Swapping the object
            studentNames[k] = studentNames[i];
            studentNames[i] = nameOfStudent;

            i++;
        }

        System.out.println("Name in alphabetical order: ");
        // For name in the array studentNames, print the name 1 by 1 
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}
