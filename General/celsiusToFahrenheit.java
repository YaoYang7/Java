public class celsiusToFahrenheit {
    public static void main(String[] args) {
        float corkTempCelsius = 12.5f;
        double Fahrenheit = (corkTempCelsius * 9 / 5) + 32;
        System.out.println("Fahrenheit:" + Fahrenheit);
    }
}

// public class Main(){
//     public static void main(String[] args){
//         System.out.println(TemperatureConverter.convertToFahrenheit(12.5f));
//     }

//     private float convert(float celsius){
//         return celsius * 9/5 + 32;
//     }
// }

// public static class TemperatureConverter(){
//     private static float convertToFahrenheit(float celsius){
//         return celsius * 9/5 + 32;
//     }

//     private static float convertToCelsius(float fahrenheit){
//         return (fahrenheit -32) * 5/9;
//     }
// }