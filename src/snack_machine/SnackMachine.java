package snack_machine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnackMachine {
    public static void main(String[] args) {
        snackMachine();
    }

    public static void snackMachine() {
        var leave = false;
        var console = new Scanner(System.in);

        List<Snack> product = new ArrayList<>();
        System.out.println("-----------------Welcome to the Snack Machine!-----------------");
        Snacks.getSnacks();

        while (!leave) {
            try {
                var option = showMenu(console);
                leave = processOption(console, option, product);


            } catch (Exception e) {
                System.out.println("something went wrong" + e.getMessage());
            } finally {
                System.out.println();
            }
        }
    }

    public static int showMenu(Scanner console) {
        System.out.println("*****Menu*****");
        System.out.println("1. Buy Snack");
        System.out.println("2. Show Snack Inventory");
        System.out.println("3. Add Snack");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        return Integer.parseInt(console.nextLine());
    }

    public static boolean processOption(Scanner console, int option, List<Snack> product) {
        switch (option) {
            case 1 -> buySnack(console, product);
            case 2 -> showTicket(product);
            case 3 -> addSnacks(console);
            case 4 -> {
                System.out.println("Thank you for using the Snack Machine!");
                return true;
            }
            default -> System.out.println("Invalid option. Please try again.");
        }
        return false;
    }

    private static void showTicket(List<Snack> products) {
        var ticket = "*** your ticket ***\n";
        var total = 0.0;
        for (var product : products) {
            ticket += "\n\t- " + product.getName() + " $" + product.getPrice();
            total += product.getPrice();
        }
        ticket += "\n\nTotal: $" + total;
        System.out.println(ticket);
    }

    private static void addSnacks(Scanner console) {
        System.out.print("Enter the name of the snack: ");
        var name = console.nextLine();
        System.out.print("Enter the price of the snack: ");
        var price = Double.parseDouble(console.nextLine());
        System.out.print("Snack added to inventory");
        Snacks.addSnack(new Snack(name, price));
        Snacks.getSnacks();
    }

    private static void buySnack(Scanner console, List<Snack> product) {
        System.out.println("which snack would you like to buy? (id)");
        var idSnack = Integer.parseInt(console.nextLine());
        var snackFound = false;
        for (var snack : Snacks.getSnackList()) {
            if (idSnack == snack.getId()) {
                product.add(snack);
                System.out.println("Snack added to cart");
                snackFound = true;
                break;
            }
        }
        if (!snackFound) {
            System.out.println("Snack not found or out of stock");
        }
    }
}
