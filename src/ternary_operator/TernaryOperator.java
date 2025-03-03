package ternary_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("****Ternary Operator****");
        //  Determinate if the number is even or odd
        int number = 10;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + number + " is " + result);
    }
}
