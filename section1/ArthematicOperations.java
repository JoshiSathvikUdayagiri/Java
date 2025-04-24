
import java.util.Scanner;

//1.1 Write a Java program that takes two integers as input and prints their sum, difference, product, and quotient.
class ArthematicOperations{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s   = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.println("Enter the second number: ");    
        int num2 = s.nextInt();
        System.out.println("Sum: "+(num1+num2));
        System.out.println("Difference: "+(num1-num2));
        System.out.println("Product: "+(num1*num2));
        System.out.println("Quotient: "+(num1/num2));
        s.close();
    }
}