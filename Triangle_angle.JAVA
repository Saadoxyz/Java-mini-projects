import java.util.Scanner;

public class TriangleThirdAngleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first angle of the triangle: ");
        double angle1 = scanner.nextDouble();

        System.out.print("Enter the second angle of the triangle: ");
        double angle2 = scanner.nextDouble();

        // Calculating the third angle using the function
        double thirdAngle = calculateThirdAngle(angle1, angle2);

        // Displaying the third angle
        System.out.println("The third angle of the triangle is: " + thirdAngle + " degrees");

        scanner.close();
    }

    // Function to calculate the third angle of a triangle
    public static double calculateThirdAngle(double angle1, double angle2) {
        // The sum of angles in a triangle is always 180 degrees
        return 180 - angle1 - angle2;
    }
}