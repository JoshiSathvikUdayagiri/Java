
import java.util.Scanner;

// 1.2. Write a Java program that calculates the area of a circle given its radius.

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");     
        double radius = s.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is: " + area);
        s.close();
    }
}
