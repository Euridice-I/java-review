package conditional_shipping_system;

import java.util.Scanner;

public class ShippingSystems {
    public static void main(String[] args) {
        System.out.println("****Shipping Systems****");
        final var NATIONAL_TARIFF = 10.0;
        final var INTERNATIONAL_TARIFF = 20.0;

        var console = new Scanner(System.in);
        System.out.println("Enter the shipping destination: (NATIONAL/INTERNATIONAL)");
        var destination = console.nextLine().strip().toLowerCase();

        System.out.print("Enter the weight of the package in kg: ");
        var weight = Double.parseDouble(console.nextLine());

        Double shippingCost = switch (destination) {
            case "national" -> weight * NATIONAL_TARIFF;
            case "international" -> weight * INTERNATIONAL_TARIFF;
            default -> {
                System.out.println("Invalid destination: " + destination);
                yield null;
            }
        };

        if (shippingCost != null) {
            System.out.printf("""
                    \nShipping destination: %s
                    Weight of the package: %.2f kg
                    Shipping cost: $%.2f
                    """, destination, weight, shippingCost);
        } else {
            System.out.println("Please enter a valid destination.");
        }
    }
}
