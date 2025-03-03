package health_fitness;

import java.util.Scanner;

public class HealthFitness {
    public static void main(String[] args) {
        System.out.println("****Health and Fitness****");

        final var DAILY_STEPS = 10000;
        final var STEP_CALORIES = 0.04;

        var console = new Scanner(System.in);

        System.out.print("Enter the number of steps you walked today: ");
        var steps = Integer.parseInt(console.nextLine());

//        verify if the user has walked the daily steps goal
        var reachedStepsGoal = (steps >= DAILY_STEPS) ?
                "Congratulations! You have reached your daily steps goal." :
                "You have not reached your daily steps goal.";

        var caloriesBurned = steps * STEP_CALORIES;

        System.out.printf("""
                \nSteps walked today: %d
                Calories burned: %.2f kcal
                Step daily goal: %s
                -------------------------------------------------
                
                The Goal of daily steps is: %d steps
                """, steps, caloriesBurned, reachedStepsGoal, DAILY_STEPS);

    }
}
