import java.util.Scanner;

public class SphereVolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        double volume = calculateSphereVolume(radius);

        System.out.println("Volume of the sphere with radius is : "  + volume);

        scanner.close();
    }

    public static double calculateSphereVolume(double radius) {
        final double PI = 3.1415;
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }
}