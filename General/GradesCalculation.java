public class GradesCalculation {
    public static void main (String[] args) {
        float AliceExam1 = 0.9f;
        float AliceExam2 = 0.6f;
        float AliceExam3 = 0.8f;

        float BobExam1 = 0.5f;
        float BobExam2 = Float.NaN;
        float BobExam3 = 0.3f;

        float CliveExam1 = 0.6f;
        float CliveExam2 = 0.7f;
        float CliveExam3 = 0.75f;

        String AliceGrade1 = GradesConvert(AliceExam1);
        String AliceGrade2 = GradesConvert(AliceExam2);
        String AliceGrade3 = GradesConvert(AliceExam3);

        String BobGrade1 = GradesConvert(BobExam1);
        String BobGrade2 = GradesConvert(BobExam2);
        String BobGrade3 = GradesConvert(BobExam3);

        String CliveGrade1 = GradesConvert(CliveExam1);
        String CliveGrade2 = GradesConvert(CliveExam2);
        String CliveGrade3 = GradesConvert(CliveExam3);

        System.out.println("Name" + "\t" + "Exam 1" + "\t" + "Exam 2" + "\t" + "Exam 3");
        System.out.println("Alice" + "\t" + AliceGrade1 + "\t" + AliceGrade2 + "\t" + AliceGrade3);
        System.out.println("Bob" + "\t" + BobGrade1 + "\t" + BobGrade2 + "\t" + BobGrade3);
        System.out.println("Clive" + "\t" + CliveGrade1 + "\t" + CliveGrade2 + "\t" + CliveGrade3);

    }

    private static String GradesConvert (float ExamGrade) {
        if (Float.isNaN(ExamGrade)) {
            return "-";
        } else if (ExamGrade >= 0.8f) {
            return "A";
        } else if (ExamGrade >= 0.6f) {
            return "B";
        } else if (ExamGrade >= 0.4f) {
            return "C";
        } else {
            return "D";
        }
    }
}
