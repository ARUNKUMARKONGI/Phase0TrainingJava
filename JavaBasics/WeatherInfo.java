import java.util.Scanner;

public class WeatherInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input values
        double temperature = scanner.nextDouble(); // Temperature in Celsius
        int humidity = scanner.nextInt();          // Humidity percentage
        double windSpeed = scanner.nextDouble();   // Wind speed in km/h
        scanner.nextLine();  // Consume the newline character after the number input
        String location = scanner.nextLine();      // Location

        // Output formatting
        System.out.println("Weather Information for Location: " + location);
        System.out.println("Temperature: " + temperature + " \u00B0C");
        System.out.println("Humidity: " + humidity + " %");
        System.out.println("Wind Speed: " + windSpeed + " km/h");
        
        scanner.close();  // Close the scanner
    }
}
// to add degree symbol use \u00B0 or press windows + .(dot) and select degree symbol from menu