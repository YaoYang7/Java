public class BloodCalculation {
    public static void main (String[] args) {
        int AliceAge = 19;
        float AliceWeight = 50.0f;
        boolean AliceAgeCheck = AgeCheck(AliceAge);
        boolean AliceWeightCheck = WeightCheck(AliceWeight);

        int BobAge = 20;
        float BobWeight = 36.0f; 
        boolean BobAgeCheck = AgeCheck(BobAge);
        boolean BobWeightCheck = WeightCheck(BobWeight);

        int CliveAge = 80;
        float CliveWeight = 100.0f;
        boolean CliveAgeCheck = AgeCheck(CliveAge);
        boolean CliveWeightCheck = WeightCheck(CliveWeight);

        int JemmyAge = 17;
        float JemmyWeight = 45.0f;
        boolean JemmyAgeCheck = AgeCheck(JemmyAge);
        boolean JemmyWeightCheck = WeightCheck(JemmyWeight);

        String AliceBloodDonation = BloodDonation(AliceAgeCheck, AliceWeightCheck);
        String BobBloodDonation = BloodDonation(BobAgeCheck, BobWeightCheck);
        String CliveBloodDonation = BloodDonation(CliveAgeCheck, CliveWeightCheck);

        System.out.println("Name" + "\t" + "Age" + "\t" + "Weight" + "\t" + "Blood Donation");
        System.out.println("Alice" + "\t" + AliceAge + "\t" + AliceWeight + "\t" + AliceBloodDonation);
        System.out.println("Bob" + "\t" + BobAge + "\t" + BobWeight + "\t" + BobBloodDonation);
        System.out.println("Clive" + "\t" + CliveAge + "\t" + CliveWeight + "\t" + CliveBloodDonation);
        System.out.println("Jemmy" + "\t" + JemmyAge + "\t" + JemmyWeight + "\t" + BloodDonation(JemmyAgeCheck, JemmyWeightCheck));
    }

    private static Boolean AgeCheck (int Age) {
        if (Age >= 18 && Age <= 60) {
            return true;
        } else {
            return false;
        }
    }
    private static Boolean WeightCheck (float Weight) {
        if (Weight >= 40.0f){
            return true;
        } else {
            return false;
        }
    }

    private static String BloodDonation (Boolean AgeCheck, Boolean WeightCheck) {
        if (AgeCheck == true && WeightCheck == true) {
            return "Yes, you can donate blood.";
        } else if (AgeCheck == false && WeightCheck == true) {
            return "Sorry, you are too young to donate blood.";
        } else if (AgeCheck == true && WeightCheck == false) {
            return "Sorry, you are too light to donate blood.";
        } else {
            return "Sorry, you are too young and too light to donate blood.";
        }
    }
}
