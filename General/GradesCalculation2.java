import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;

public class GradesCalculation2 {
    public static void main (String[] args) {
        List<String> gradeList = new ArrayList<>();
        List<String> studentList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter student name: ");
            scanner.nextLine();
            String studentName = scanner.nextLine();
            studentList.add(studentName);

            System.out.println("Enter student mark: ");
            int studentMark = scanner.nextInt();
            gradeList.add(markCalc(studentMark));
        }

        scanner.close(); 

        for (int i = 0; i < numberOfStudents ; i++) {
            System.out.println(studentList.get(i) + "\t" +gradeList.get(i));
        }

    }

    private static String markCalc(int studentMark) { 
        if (studentMark >=80 ) {
            return "A";
        } else if (studentMark >= 60) {
            return "B";
        } else if (studentMark >= 40) {
            return "C";
        } else {
            return "D";
        }
    }
}