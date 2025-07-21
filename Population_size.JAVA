import java.util.Scanner;

public class PopulationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the starting size of the population: ");
        double startingSize = scanner.nextDouble();

        System.out.print("Enter the annual birth rate (%): ");
        double birthRate = scanner.nextDouble();

        System.out.print("Enter the annual death rate (%): ");
        double deathRate = scanner.nextDouble();

        System.out.print("Enter the number of years to display: ");
        int years = scanner.nextInt();

        if (startingSize < 2 || birthRate < 1) {
            System.out.println("Invalid input. Starting size should be at least 2 and birth rate should be at least 1%.");
            System.exit(1);
        }

        // Displaying the size of the population for each year
        System.out.println("\nPopulation Size Over " + years + " Years:");
        double population = startingSize;
        for (int i = 0; i < years; ++i) {
            System.out.println("Year " + (i + 1) + ": " + population);
            population = calculatePopulationSize(population, birthRate, deathRate);
        }

        scanner.close();
    }

    public static double calculatePopulationSize(double previousPopulation, double birthRate, double deathRate) {
        return previousPopulation + (previousPopulation * birthRate / 100) - (previousPopulation * deathRate / 100);
    }
}