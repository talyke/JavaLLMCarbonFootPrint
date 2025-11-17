package src.java.main.com.example;

import java.util.Scanner;

public class CarbonFootprintCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of words: ");
            int numWords = scanner.nextInt();

            System.out.print("Enter the complexity factor (1 for simple, 2 for medium, 3 for complex): ");
            int complexityFactor = scanner.nextInt();

            System.out.print("Enter the model size factor (1 for small, 2 for medium, 3 for large): ");
            int modelSizeFactor = scanner.nextInt();

            // Assuming a fixed energy consumption factor (adjust as needed)
            double energyConsumptionFactor = 0.0001;

            double carbonFootprint = numWords * complexityFactor * modelSizeFactor * energyConsumptionFactor;

            System.out.println("Estimated Carbon Footprint: " + carbonFootprint + " units");
        }
    }
}