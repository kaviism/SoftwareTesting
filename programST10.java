import java.util.Scanner;

public class programST10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double number = scanner.nextDouble();
        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        System.out.println("Square of " + number + " is: " + square);
        System.out.println("Cube of " + number + " is: " + cube);
        scanner.close();
    }
}