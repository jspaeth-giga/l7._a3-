import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validTemp = false;
        double celsius = 0;
        double farenheit;
        boolean repeated = true;

        while (repeated) {
            do {
                System.out.println("Please enter a temperature in degrees C to be converted to degrees F:");
                if (scan.hasNextDouble()) {
                    celsius = scan.nextDouble();
                    validTemp = true;
                    scan.nextLine();
                } else if (scan.nextLine().equalsIgnoreCase("N")) {
                    repeated = false;
                    validTemp = true;
                } else {
                    System.out.println("You have entered an invalid temperature value. Please try again.");
                }
            } while (!validTemp);
            validTemp = false;

            if (repeated == true) {
                farenheit = (celsius * 1.8) + 32;
                System.out.printf( "%-15s %10.2f","Degrees C: ", celsius);
                System.out.printf("\n%-15s %10.2f", "Degrees F: ", farenheit);
                System.out.println();
            }
        }
    }
}