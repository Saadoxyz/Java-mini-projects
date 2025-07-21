import java.util.Scanner;  
public class ab6 {
    public static double loading(double radius) {
        double PI = 3.14;
        return(4.0/3) * PI * Math.pow(radius,3);
    }
    public static double loading(double prevPopulation, double birthRate, double deathRate) {
        return prevPopulation + (birthRate * prevPopulation) - (deathRate * prevPopulation);
    }
    public static double loading(double angle1, double angle2) {
        return 180 - (angle1 + angle2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of sphere: ");
        double radius = sc.nextDouble();
        System.out.println("First Function Overloaded");
        double volume = loading(radius);
        System.out.println("Volume of sphere is: " + volume);
        System.out.print("Enter the initial population size: ");
        double initialPopulation = sc.nextDouble();
        System.out.print("Enter the annual birth rate (as a decimal): ");
        double birthRate = sc.nextDouble();
        System.out.print("Enter the annual death rate (as a decimal): ");
        double deathRate = sc.nextDouble();
        System.out.print("Enter the number of years to display: ");
        int numOfYears = sc.nextInt();
        System.out.println("Second Function Overloaded");
        for (int year = 1; year <= numOfYears; ++year) {
            double newPopulation = loading(initialPopulation, birthRate, deathRate);
            System.out.println("Year " + year + ": Population = " + newPopulation);
            initialPopulation = newPopulation;
        }
        System.out.print("Enter First angle: ");
        double angle1 = sc.nextDouble();
        System.out.print("Enter Second angle: ");
        double angle2 = sc.nextDouble();
        System.out.println("Third Function Overloaded");
        double angle3 = loading(angle1, angle2);
        System.out.println("The third angle of triangle is: " + angle3 + " degrees");
}
}