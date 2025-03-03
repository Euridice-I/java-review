package ternary_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("****Ternary Operator****");
        //  Determinate if the number is even or odd
        int number = 11;
        var result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + number + " is " + result);

        //   Calculate if you are of legal age
        int age = 17;
        var message = (age >= 18) ? "You are of legal age" : "You are not of legal age";
        System.out.println("\nYou are " + age + " years old. " + message);

        //  Determine if the number is positive, negative or zero
        number = -5;
        result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println("\nThe number " + number + " is " + result);
    }
}
