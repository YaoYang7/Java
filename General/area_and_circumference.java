public class area_and_circumference {
    public static void main(String[] args) {
        float radius = 181.55f;
        float pi = 3.14f;
        double circumference = 2 * pi * radius;
        double area = pi * radius * radius;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);

        circumference = roundToDecimalPlaces(circumference, 2);
        area = roundToDecimalPlaces(area, 2);
        System.out.println("Rounded Area: " + area);
        System.out.println("Rounded Circumference: " + circumference);
    }

    private static double roundToDecimalPlaces(double value, int decimalPlaces) {
        double shift = Math.pow(10, decimalPlaces);
        return Math.round(value * shift) / shift;
    }
}
