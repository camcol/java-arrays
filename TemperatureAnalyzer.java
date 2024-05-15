import java.util.Scanner;

public class TemperatureAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of temperatures being compared: ");
        int numTemperatures = scanner.nextInt();

        System.out.println("Enter the temperatures to compare:");

        int[] temperatures = new int[numTemperatures];

        for (int i = 0; i < numTemperatures; i++) {
            temperatures[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int temp : temperatures) {
            sum += temp;
        }
        double averageTemperature = (double) sum / numTemperatures;

        System.out.println("Average temperature: " + averageTemperature);

        int countAboveAverage = 0;
        for (int temp : temperatures) {
            if (temp > averageTemperature) {
                countAboveAverage++;
            }
        }

        System.out.println("Number of temperatures above average: " + countAboveAverage);

        scanner.close();
    }
}
