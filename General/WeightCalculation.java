public class WeightCalculation {
    public static void main(String[] args) {
        float AliceWeight = 50.0f;
        float xMercury = 0.4f; 
        float xVenus = 0.9f;
        float xJupiter = 2.5f;
        float xSaturn = 1.1f;
        
        float AliceWeightMercury = weightConvert(AliceWeight, xMercury);
        float AliceWeightVenus = weightConvert(AliceWeight, xVenus);
        float AliceWeightJupiter = weightConvert(AliceWeight, xJupiter);
        float AliceWeightSaturn = weightConvert(AliceWeight, xSaturn);

        System.out.println("Planet" + "\t\t" + "Multiplier" + "\t" + "Weight");
        System.out.println("Earth" + "\t\t" + "1.0" + "\t\t" + AliceWeight+"KG");
        System.out.println("Mercury" + "\t\t" + xMercury + "\t\t" + AliceWeightMercury+"KG");
        System.out.println("Venus" + "\t\t" + xVenus + "\t\t" + AliceWeightVenus+"KG");
        System.out.println("Jupiter" + "\t\t" + xJupiter + "\t\t" + AliceWeightJupiter+"KG");
        System.out.println("Saturn" + "\t\t" + xSaturn + "\t\t" + AliceWeightSaturn+"KG");
    }

    private static float weightConvert (float value, float multiplier) {
        return value * multiplier;
    }
}
