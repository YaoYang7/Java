public class LoanCalculation {
    public static void main (String[] args) {
        int AliceMonthlyIncome = 1500;
        int BobMonthlyIncome = 700;
        int CliveMonthlyIncome = 100;

        float AliceYearlyIncome = YearlyIncome(AliceMonthlyIncome);
        float BobYearlyIncome = YearlyIncome(BobMonthlyIncome);
        float CliveYearlyIncome = YearlyIncome(CliveMonthlyIncome);

        int AliceLoanCategory = LoanCategory(AliceMonthlyIncome);
        int BobLoanCategory = LoanCategory(BobMonthlyIncome);
        int CliveLoanCategory = LoanCategory(CliveMonthlyIncome);

        float AliceLoanAmount = LoanAmount(AliceYearlyIncome, AliceLoanCategory);
        float BobLoanAmount = LoanAmount(BobYearlyIncome, BobLoanCategory);
        float CliveLoanAmount = LoanAmount(CliveYearlyIncome, CliveLoanCategory);

        System.out.println("Name" + "\t" + "Monthly Income" + "\t\t" + "Yearly Income" + "\t\t" + "Loan Category" + "\t\t" + "Loan Amount");
        System.out.println("Alice" + "\t" + AliceMonthlyIncome + "\t\t\t" + AliceYearlyIncome + "\t\t\t" + AliceLoanCategory + "\t\t\t" + AliceLoanAmount);
        System.out.println("Bob" + "\t" + BobMonthlyIncome + "\t\t\t" + BobYearlyIncome + "\t\t\t" + BobLoanCategory + "\t\t\t" + BobLoanAmount);
        System.out.println("Clive" + "\t" + CliveMonthlyIncome + "\t\t\t" + CliveYearlyIncome + "\t\t\t" + CliveLoanCategory + "\t\t\t" + CliveLoanAmount);
    }

    private static float YearlyIncome (int MonthlyIncome) {
        return MonthlyIncome * 12;
    }

    private static int LoanCategory (int MonthlyIncome) {
        if (MonthlyIncome > 1000) {
            return 1;
        } else if (MonthlyIncome > 500 && MonthlyIncome <= 1000) {
            return 2;
        } else if (MonthlyIncome > 200 && MonthlyIncome <= 500) {
            return 3;
        } else {
            return 4;
        }
    }

    private static float LoanAmount (float YearlyIncome, int LoanCategory) {
        float LoanAmount; 

        switch (LoanCategory) {
            case 1:
                LoanAmount = YearlyIncome * 3.5f;
                break;
            case 2:
                LoanAmount = YearlyIncome * 2.5f;
                break;
            case 3:
                LoanAmount = YearlyIncome * 2f;
                break;
            case 4:
                LoanAmount = YearlyIncome * 0f;
                break;
            default:
                LoanAmount = 0;
                break;
        }
        return LoanAmount;
    }
}
