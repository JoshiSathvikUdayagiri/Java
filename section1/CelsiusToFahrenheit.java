// 1.3 Write a Java program that converts temperature from Celsius to Fahrenheit.
import java.util.Scanner;

public class CelsiusToFahrenheit {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double celsius = s.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
        s.close();
    }
}
