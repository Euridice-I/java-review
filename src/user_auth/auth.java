package user_auth;

import java.util.Scanner;

public class auth {
    public static void main(String[] args) {
        System.out.println("****User Authentication****");
        final var USERNAME_VALID = "admin";
        final var PASSWORD_VALID = "admin123";

        var console = new Scanner(System.in);
        System.out.print("Enter your username: ");
        var username = console.nextLine().strip().toLowerCase();

        System.out.print("Enter your password: ");
        var password = console.nextLine().strip().toLowerCase();

        if (username.equals(USERNAME_VALID) && password.equals(PASSWORD_VALID)) {
            System.out.println("Welcome " + username + "!");
        } else if (!username.equals(USERNAME_VALID) && password.equals(PASSWORD_VALID)) {
            System.out.println("Invalid username.");
        } else if (username.equals(USERNAME_VALID) && !password.equals(PASSWORD_VALID)) {
            System.out.println("Invalid password.");
        } else {
            System.out.println("Invalid username and password.");
        }
    }
}
