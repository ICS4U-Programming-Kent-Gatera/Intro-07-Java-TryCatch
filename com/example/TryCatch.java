import java.lang.Math;
import java.util.Scanner;

/**
 * My program calculates the volume of a sphere.
 *
 * @author  Kent Gatera
 * @version 1.0
 * @since   2024-Feb-8
 */

public final class TryCatch {
    /**
    * Pleases the style checker.
    *
    *
    * @exception IllegalStateException Utility class
    * @see IllegalStateException
    */

    private TryCatch() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * This is where the main code will be.
    *
    * @param args
    *
    */
    public static void main(String[] args) {
        try {
            // Initializing constants for:
            // Cube for the power n the formula.
            final Double cube = 3.0;
            // The coefficient for the formula.
            final Double volumeCoefficient = 3.0 / 4.0;
            // The scanner for input.
            final Scanner inputReader = new Scanner(System.in);
            // Printing the console prompt asking the radius.
            System.out.print(
                  "Enter the radius of the sphere (allowing decimal input): ");
            // Getting and storing the radius as a "double" value
            final double sphereRadius = inputReader.nextDouble();
            // If the sphere radius is 0 or less then returns an error.
            if (sphereRadius <= 0) {
                System.out.print("Sphere radius must be > 0.\n");
            } else {
                // Initializing the volume and calculating it.
                final Double volume;
                volume = volumeCoefficient * (
                    Math.PI * Math.pow(sphereRadius, cube));
                // Printing the volume.
                System.out.printf(
                    "The volume of the sphere is: %.3f" + " cm^3\n", volume);
            }
            // Closing the scanner for input for memory conservation.
            inputReader.close();
        } catch (NumberFormatException e) {
            System.out.print("Please enter a valid integer > 0\n");
        }
    }
}
